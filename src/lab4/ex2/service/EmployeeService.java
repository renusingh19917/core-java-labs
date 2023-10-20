package lab4.ex2.service;

import lab4.ex2.bean.Employee;

public interface EmployeeService {
    void getEmployeeDetails(Employee employee);
    void findInsuranceScheme(Employee employee);
    void displayEmployeeDetails(Employee employee);
}
