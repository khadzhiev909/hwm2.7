package homework2_7.service;

import homework2_7.Employee;
import homework2_7.exeptions.CantRemoveExeption;

import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService{
    final private Map<String, Employee> employees;

    public EmployeeServiceImpl(Map<String, Employee> employees) {
        this.employees = employees;
    }

    @Override
    public Employee add(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if(employees.containsKey(employee.getFullName()));
        employees.put(employee.getFullName() ,employee);
        return employee;
    }
    @Override
    public Employee remove(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if(employees.containsKey(employee.getFullName())) {
            employees.remove(employee.getFullName(), employee);
            return employee;
        }
        throw new CantRemoveExeption();
    }
}
