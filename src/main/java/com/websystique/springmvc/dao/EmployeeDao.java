package com.websystique.springmvc.dao;
 
import java.util.List;
import com.websystique.springmvc.model.Employee;
 
public interface EmployeeDao {
    Employee findById(int id); // здійснює пошук по ID
    void saveEmployee(Employee employee); //збереження праціника
    void deleteEmployeeBySsn(String ssn);// видалення працівника
    List<Employee> findAllEmployees(); // список працівників
    Employee findEmployeeBySsn(String ssn);// вибір працівника по SSN
 
}