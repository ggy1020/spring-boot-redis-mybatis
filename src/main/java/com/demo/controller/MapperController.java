package com.demo.controller;

import com.demo.UserMapper;
import com.demo.domain.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MapperController {

    @Autowired
    private UserMapper  userMapper ;

    @ResponseBody
    @RequestMapping("/queryUser")
    @ApiOperation(value = "")
    public List<User>   queryUserList(){

        List<User>  list  = userMapper.queryUserList();
        return  list;

    }


}
