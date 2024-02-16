package com.pulitko.spring.mvc_hibernate.controller;

import com.pulitko.spring.mvc_hibernate.dao.EmployeeDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    private EmployeeDAO employeeDAO;

    public FirstController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @GetMapping("/")
    public String showAllEmployees(Model model) {
        model.addAttribute("employees", employeeDAO.showAllEmployees());
        return "all-employees";
    }
}
