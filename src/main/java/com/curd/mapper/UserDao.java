package com.curd.mapper;

import com.curd.pojo.User;

import java.util.List;

public interface UserDao {
    public List<User> getUserAll();
    
    public User getUserById(Integer id);
}
