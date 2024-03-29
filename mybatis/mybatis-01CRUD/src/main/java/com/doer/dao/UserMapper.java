package com.doer.dao;

import com.doer.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //模糊查询
    List<User> getUserLike(String value);

    //查询全部用户
    List<User> getUserList();

    //根据id查询用户
    User getUserById(int id);

    //增加一个用户
    int addUser(User user);
    //万能的map
    int addUser2(Map<String,Object> map);
    //修改用户
    int updateUser(User id);

    //删除一个用户
    int deleteUser(int id);
}
