package com.pulitko.spring.mvc_hibernate.dao;

import com.pulitko.spring.mvc_hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Employee> showAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
        Query<Employee> query = session.createQuery("from Employee", Employee.class);
        List<Employee> empList = query.getResultList();

        return empList;
    }
}
