package com.curd.service.impl;

import com.curd.mapper.EmployeeMapper;
import com.curd.pojo.Employee;
import com.curd.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeMapper employeeMapper;
    @Override
    public List<Employee> list(){
        return employeeMapper.list();
    }
    @Override
    public int add(Employee employee){
        return employeeMapper.add(employee);
    }
    @Override
    public void delete(int id){
        employeeMapper.delete(id);
    }
    @Override
    public Employee get(int id){
        return employeeMapper.get(id);
    }
    @Override
    public int update(Employee employee){
        return employeeMapper.update(employee);
    }


}
