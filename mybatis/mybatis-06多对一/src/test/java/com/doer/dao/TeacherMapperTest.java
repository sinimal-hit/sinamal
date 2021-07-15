package com.doer.dao;

import com.doer.pojo.Teacher;
import com.doer.utils.MybatisUtils;
import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TeacherMapperTest  {
    @Test
    public void getTeacherById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacherById = mapper.getTeacherById(1);
        System.out.println(teacherById);
        sqlSession.close();
    }
}