package com.doer.dao;

import com.doer.pojo.User;
import com.doer.utils.MybatisUtils;
import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest  {
    @Test
    public void getUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(new User(5,"干事硅胶","1321421"));

        sqlSession.close();
    }

}