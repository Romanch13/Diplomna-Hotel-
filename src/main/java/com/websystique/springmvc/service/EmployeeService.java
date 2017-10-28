package com.websystique.springmvc.service;
 
import java.util.List;
import com.websystique.springmvc.model.Employee;
 
public interface EmployeeService {
    Employee findById(int id);
    void saveEmployee(Employee employee);//save Employee
    void updateEmployee(Employee employee);//  update Employee
    void deleteEmployeeBySsn(String ssn);// delete Employee By Ssn
    List<Employee> findAllEmployees(); //  List Employee
    Employee findEmployeeBySsn(String ssn); // find Employee BySSN
    boolean isEmployeeSsnUnique(Integer id, String ssn);
     
}