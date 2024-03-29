package com.doer.dao;

import com.doer.pojo.Department;
import com.doer.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

//员工Dao
@Repository
public class EmployeeDao {
    //模拟数据库中的数据
    private static Map<Integer, Employee> employees;

    //员工有所属的部门
    @Autowired
    private DepartmentDao departmentDao;

    static {
        employees = new HashMap<Integer, Employee>();//创建一个部门表

        employees.put(101, new Employee(1001, "AA", "A2512509412@qq.com", 0, new Department(101, "教学部")));
        employees.put(102, new Employee(1002, "BB", "B2512509412@qq.com", 1, new Department(101, "市场部")));
        employees.put(103, new Employee(1003, "CC", "C2512509412@qq.com", 0, new Department(101, "教研部")));
        employees.put(104, new Employee(1004, "DD", "D2512509412@qq.com", 1, new Department(101, "运营部")));
        employees.put(105, new Employee(1005, "EE", "E2512509412@qq.com", 0, new Department(101, "后勤部")));

    }

    //主键自增
    private static Integer initId = 1006;

    //增加一个员工,主键自增
    public void addEmployee(Employee employee) {
        if (employee.getId() == null) {
            employee.setId(initId++);
        }
        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));

        employees.put(employee.getId(), employee);

    }

    //查询所有员工信息
    public Collection<Employee> getAllEmployee() {
        return employees.values();
    }

    //通过id查询员工
    public Employee getEmployeeById(Integer id) {
        return employees.get(id);
    }

    //删除员工
    public void deleteEmploy(Integer id) {
        employees.remove(id);
    }

}
