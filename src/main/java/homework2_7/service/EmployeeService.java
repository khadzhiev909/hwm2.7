package homework2_7.service;

import homework2_7.Employee;

public interface EmployeeService {
    Employee add(String firstName, String lastName);

    Employee remove(String firstName, String lastName);
}
