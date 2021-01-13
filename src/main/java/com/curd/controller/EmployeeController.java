package com.curd.controller;

import com.curd.pojo.Employee;
import com.curd.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
   @GetMapping("/employees")
    public PageInfo<Employee> list(@RequestParam(value="start",defaultValue = "1")int start, @RequestParam(value="size",defaultValue = "5")int size)throws Exception{
       PageHelper.startPage(start,size,"id desc");
       List<Employee> es=employeeService.list();
       PageInfo<Employee> page=new PageInfo<>(es,5);
       return page;
   }
   @PostMapping("/employees")
    public String add(@RequestBody Employee employee)throws Exception{
       employeeService.add(employee);
       return "success";
   }
   @DeleteMapping("/employees/{id}")
    public String delete(Employee employee)throws Exception{
        employeeService.delete(employee.getId());
        return "success";
   }
   @GetMapping("/employees/{id}")
    public Employee get(@PathVariable("id") int id )throws Exception{
       Employee employee=employeeService.get(id);
       return employee;
   }
   @PutMapping("/employees/{id}")
    public String update(@RequestBody Employee employee)throws Exception{
       employeeService.update(employee);
       return "success";
   }
    /*页面跳转 部分*/
    @RequestMapping(value="/listEmployee", method=RequestMethod.GET)
    public ModelAndView listEmployee(){
        ModelAndView mv = new ModelAndView("listEmployee");
        return mv;
    }

    @RequestMapping(value="/editEmployee", method=RequestMethod.GET)
    public ModelAndView editHero(){
        ModelAndView mv = new ModelAndView("editEmployee");
        return mv;
    }


}
