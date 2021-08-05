package com.doer;

import com.doer.dao.DepartmentDao;
import com.doer.pojo.Department;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collection;

@SpringBootTest
class Springboot03WebApplicationTests {
    @Autowired
    private DepartmentDao departmentDao;

    @Test
    void contextLoads() {
        Collection<Department> departments = departmentDao.getDepartments();
        for (Department department : departments) {
            System.out.println(department);


        }
    }


}
