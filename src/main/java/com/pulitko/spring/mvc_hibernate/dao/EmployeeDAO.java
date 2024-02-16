package com.pulitko.spring.mvc_hibernate.dao;

import com.pulitko.spring.mvc_hibernate.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> showAllEmployees();
}
