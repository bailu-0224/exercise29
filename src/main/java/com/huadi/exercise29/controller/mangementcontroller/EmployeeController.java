package com.huadi.exercise29.controller.mangementcontroller;

import com.huadi.exercise29.entity.Employee;
import com.huadi.exercise29.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    //查询员工列表
    @GetMapping("/admin-employee.html")
    public String list(Model model)
    {
        model.addAttribute("emps",employeeRepository.selectAll());
        return "manage/admin-employee";
    }
    //添加员工
    @PostMapping ("/admin-employee.html")
    public String addEmployee(Employee employee)
    {
        System.out.println(employee);
        employeeRepository.insert(employee);
        return "redirect:/admin-employee.html";
    }
    //删除员工
    @PostMapping ("/admin-employee.html/{id}")
    public String deleteEmployee(@PathVariable("id") String id)
    {
        System.out.println(id);
        employeeRepository.deleteById(id);
        return "redirect:/admin-employee.html";
    }
    //修改员工
}
