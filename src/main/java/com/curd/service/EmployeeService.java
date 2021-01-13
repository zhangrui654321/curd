package com.curd.service;

import com.curd.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> list();
    int add(Employee employee);
    void delete(int id);
   Employee get(int id);
    int update(Employee employee);
}
