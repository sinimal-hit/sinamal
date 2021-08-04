package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.base.BaseMapper;
import org.example.model.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface StudentMapper extends BaseMapper<Student> {
    List<Student> query(Student stu);

    Student queryById(Integer id);

    int apply(Student stu);
}