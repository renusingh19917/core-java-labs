package lab4.ex2.service;

import lab4.ex2.bean.Employee;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
	
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void getEmployeeDetails(Employee employee) {
        System.out.println("Enter Employee ID:");
        employee.setId(scanner.nextInt());
        scanner.nextLine(); // Consume the newline character
        
        System.out.println("Enter Employee Name:");
        employee.setName(scanner.nextLine());
        
        System.out.println("Enter Employee Salary:");
        employee.setSalary(scanner.nextDouble());
        scanner.nextLine(); // Consume the newline character
        
        System.out.println("Enter Employee Designation:");
        employee.setDesignation(scanner.nextLine());
    }

    @Override
    public void findInsuranceScheme(Employee employee) {
        double salary = employee.getSalary();
        String designation = employee.getDesignation();

        // Determine insurance scheme based on salary and designation
        if (salary > 50000) {
            if ("Manager".equalsIgnoreCase(designation)) {
                employee.setInsuranceScheme("Managerial Insurance");
            } else {
                employee.setInsuranceScheme("Regular Insurance");
            }
        } else {
            employee.setInsuranceScheme("No Insurance");
        }
    }

    @Override
    public void displayEmployeeDetails(Employee employee) {
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Salary: " + employee.getSalary());
        System.out.println("Employee Designation: " + employee.getDesignation());
        System.out.println("Insurance Scheme: " + employee.getInsuranceScheme());
    }
}
