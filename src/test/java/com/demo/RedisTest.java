package com.demo;

import com.demo.domain.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Demo1Application.class)
public class RedisTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Test
    public  void  textRedis()  throws  JsonProcessingException {
       //从redis缓存中获得指定的数据

        String userListData = redisTemplate.boundValueOps("user.findAll").get();
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
