package com.websystique.springmvc.dao;
 
import java.util.List;
import com.websystique.springmvc.model.Employee;
 
public interface EmployeeDao {
    Employee findById(int id); // searches by ID
    void saveEmployee(Employee employee); //save Employee
    void deleteEmployeeBySsn(String ssn);// delete Employee By Ssn
    List<Employee> findAllEmployees(); //List Employee
    Employee findEmployeeBySsn(String ssn);// find Employee By SSN
 
}