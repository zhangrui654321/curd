package com.curd.mapper;
import com.curd.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface EmployeeMapper {
    List<Employee> list();

    int add(Employee employee);
    void delete(int id);
    Employee get(int id);
    int update(Employee employee);
}
