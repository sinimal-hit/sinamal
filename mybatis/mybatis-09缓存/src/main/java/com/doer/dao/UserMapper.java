package com.doer.dao;

import com.doer.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    //根据id查询用户
    User queryUserById(@Param("id") int id);

    //更新用户信息
    int updateUser(User user);

}
