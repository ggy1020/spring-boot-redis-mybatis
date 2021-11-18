package com.demo.redis;

import com.demo.domain.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.hash.Jackson2HashMapper;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * redis 学习高阶api和低级api存在的序列化问题
 */
@Component
public class TestRedis {

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    @Qualifier("init")
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    ObjectMapper objectMapper;

    public void test(){
        stringRedisTemplate.opsForValue().set("test","ggy");
        System.out.println(stringRedisTemplate.opsForValue().get("test"));

        //二进制字符流
        RedisConnection connection = redisTemplate.getConnectionFactory().getConnection();
        connection.set("test".getBytes(),"ggy".getBytes());
        System.out.println(new String(connection.get("test".getBytes())));

        HashOperations<String, Object, Object> hash = stringRedisTemplate.opsForHash();
        hash.put("ggy","age",18);
        hash.put("ggy","name","ggy");

        System.out.println(hash.entries("ggy").get("age"));
        System.out.println(hash.entries("ggy").get("age"));


        User user = new User();
        user.setUsername("ggy");
        user.setId(11L);
        user.setName("gao");
        user.setPassword("12334545");
/*

        //设置一下序列化方式
        stringRedisTemplate.setHashValueSerializer(new Jackson2JsonRedisSerializer<Object>(Object.class));
*/


        //需要把user转成map
        Jackson2HashMapper jm = new Jackson2HashMapper(objectMapper, true);


        redisTemplate.opsForHash().putAll("ggy",jm.toHash(user));

        Map ggy = redisTemplate.opsForHash().entries("ggy");
        User user1 = objectMapper.convertValue(ggy, User.class);
        System.out.println(user1);

       //接收消息
        RedisConnection cc = stringRedisTemplate.getConnectionFactory().getConnection();
        cc.subscribe(new MessageListener() {
            @Override
            public void onMessage(Message message, byte[] bytes) {
                byte[] body = message.getBody();
                String s = new String(body);
                System.out.println(s);
            }
        }, "ggy".getBytes());

        //为了保证这个线程一直存在，或者新建一个现场
        while (true){
            //发布消息
            stringRedisTemplate.convertAndSend("channel","hello");
            try {
                Thread.sleep(3000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
