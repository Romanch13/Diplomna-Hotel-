package com.websystique.springmvc.dao;
 
import java.util.List;
import com.websystique.springmvc.model.Employee;
 
public interface EmployeeDao {
    Employee findById(int id); // ������� ����� �� ID
    void saveEmployee(Employee employee); //���������� ���������
    void deleteEmployeeBySsn(String ssn);// ��������� ����������
    List<Employee> findAllEmployees(); // ������ ����������
    Employee findEmployeeBySsn(String ssn);// ���� ���������� �� SSN
 
}