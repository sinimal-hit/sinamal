package org.example.service;

import com.github.pagehelper.PageHelper;
import org.example.mapper.StudentMapper;
import org.example.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public List<Student> query(Student stu) {
        PageHelper.startPage(stu);
        return studentMapper.query(stu);
    }

    public Student queryById(Integer id) {
        return studentMapper.queryById(id);
    }

    public int add(Student stu) {
        return studentMapper.insertSelective(stu);
    }

    public int delete(List<Integer> ids) {
        return studentMapper.deleteByIds(ids);
    }

    public int update(Student stu) {
        return studentMapper.updateByPrimaryKeySelective(stu);
    }

    public int apply(Student stu) {
        return studentMapper.apply(stu);
    }
}
