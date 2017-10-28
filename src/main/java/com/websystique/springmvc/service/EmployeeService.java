package com.websystique.springmvc.service;
 
import java.util.List;
import com.websystique.springmvc.model.Employee;
 
public interface EmployeeService {
    Employee findById(int id);
    void saveEmployee(Employee employee);//збереження праціника
    void updateEmployee(Employee employee);// оновлення працівника
    void deleteEmployeeBySsn(String ssn);// видалення працівника
    List<Employee> findAllEmployees(); // список працівників
    Employee findEmployeeBySsn(String ssn); // вибір працівника по SSN
    boolean isEmployeeSsnUnique(Integer id, String ssn);
     
}