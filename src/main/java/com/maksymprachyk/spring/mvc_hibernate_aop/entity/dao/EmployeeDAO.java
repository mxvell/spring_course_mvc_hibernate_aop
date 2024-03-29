package com.maksymprachyk.spring.mvc_hibernate_aop.entity.dao;

import com.maksymprachyk.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
//    public String add
}
