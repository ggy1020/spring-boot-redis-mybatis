package com.demo;

import com.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<User>  queryUserList();

    public User  queryOne(String id);
}
