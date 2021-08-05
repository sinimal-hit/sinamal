package com.doer.controller;

import com.doer.dao.EmployeeDao;
import com.doer.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeDao employeeDao;

    @RequestMapping("/employee")
    public String list(Model model) {
        Collection<Employee> allEmployee = employeeDao.getAllEmployee();
        model.addAttribute("emps", allEmployee);
        return "employee/list";
    }
}
