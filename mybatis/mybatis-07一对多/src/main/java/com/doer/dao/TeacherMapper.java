package com.doer.dao;

import com.doer.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
    //获取老师
    //List<Teacher> getTeacher();

    //获取指定老师下所有信息包括包含的学生
    Teacher getTeacher(@Param("tid") int id);
}
