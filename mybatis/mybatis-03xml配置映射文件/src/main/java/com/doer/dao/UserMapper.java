package com.doer.dao;

import com.doer.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {



    //根据id查询用户
    User getUserById(int id);

    List<User> getUserByLimit(Map<String, Integer> map);



}
