package com.demo;

import com.alibaba.fastjson.JSON;
import com.demo.domain.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Demo1Application.class)
public class RedisTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public  void  textRedis() throws IOException {
         //从redis缓存中获得指定的数据
        //redisString();
        Object date = redisTemplate.opsForHash().get("userDate", "1");
        User user = objectMapper.readValue(date.toString(),User.class);
        System.out.println(user.toString());

        /*List<User>  all = userMapper.queryUserList();
        Map<String,String> map = new HashMap<String, String>();
        for (User user:all) {
            map.put(String.valueOf(user.getId()),objectMapper.writeValueAsString(user));
        }
        //转换成json格式字符串
        redisTemplate.opsForHash().putAll("userDate",map);
        ObjectMapper objectMapper = new ObjectMapper();
        String userListData = objectMapper.writeValueAsString(all);
        System.out.println(userListData);
        System.out.println("=====================================");
        System.out.println(JSON.toJSONString(all));*/

    }

    public  void  redisString()  throws  JsonProcessingException {
        String userListData = redisTemplate.boundValueOps("user:findAll").get();
//如果redis中没有数据的话
        if(null==userListData){
//查询数据库获得数据
            List<User>  all = userMapper.queryUserList();
//转换成json格式字符串
            ObjectMapper objectMapper = new ObjectMapper();
            userListData = objectMapper.writeValueAsString(all);
//将数据存储到redis中，下次在查询直接从redis中获得数据，不用在查询数据库
            redisTemplate.boundValueOps("user.findAll").set(all.toString());
            System.out.println("===============从数据库获得数据===============");
        }else{
            System.out.println("===============从redis缓存中获得数据===============");
        }
        System.out.println(userListData);
    }
}
