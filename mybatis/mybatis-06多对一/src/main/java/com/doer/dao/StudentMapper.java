package com.doer.dao;

import com.doer.pojo.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {

    //查询所有学生的信息,以及对应老师的信息
    //@Select("select * from student")
    List<Student> getStudent();


    //按照结果嵌套处理
    List<Student> getStudent2();
}
