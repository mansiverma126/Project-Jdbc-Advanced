package org.learn.jdbc.dao;

import org.learn.jdbc.domain.Employee;

import java.util.List;

public interface EmployeeDao { //DAO standts for Data access object
    public void insert(Employee employee);
    public void update(Employee employee);
    public Employee findByEmployeeId(Integer id);
    public List<Employee> findAll();
    public void delete(Integer id);

}
