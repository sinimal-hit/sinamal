package org.example.controller;

import org.example.model.Student;
import org.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/query")
    public Object query(Student stu){
        //stu包含搜索字段，排序字段，页码和每页数量
        //返回的Student学生list中, 包含寝室，宿舍楼信息（根据接口定义，不能写1对1，1对多，只能写简单属性）
        List<Student> list = studentService.query(stu);
        return list;
    }

    @GetMapping("/queryById")
    public Object queryById(Integer id){
        Student s = studentService.queryById(id);
        return s;
    }

    @PostMapping("/add")
    public Object add(@RequestBody Student stu){
        int n = studentService.add(stu);
        return null;
    }

    /**
     * 删除多个学生：
     * GET student/delete?ids=2&ids=3
     */
    @GetMapping("/delete")
    public Object delete(@RequestParam("ids") List<Integer> ids){
        int n = studentService.delete(ids);
        return null;
    }

    @PostMapping("/update")
    public Object update(@RequestBody Student stu){
        int n = studentService.update(stu);
        return null;
    }

    @RequestMapping("/apply")
    public Object apply(@RequestBody Student stu){
        int n = studentService.apply(stu);
        return null;
    }
}
