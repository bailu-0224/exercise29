package com.huadi.exercise29.controller.mangementcontroller;

import com.huadi.exercise29.entity.Employee;
import com.huadi.exercise29.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    //查询员工列表
    @GetMapping("/admin-employee.html")
    public String list(Model model)
    {
        List<Employee> employees=employeeRepository.getall();
        model.addAttribute("emps",employees);
        return "manage/admin-employee";
    }
}
