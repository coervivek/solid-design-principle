package srp.solution.employees;

import srp.problem.employees.Gender;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("Ram", "Kumar", Gender.MALE, 2000);

        EmployeeRepository repository = new EmployeeRepository();
        repository.save(employee);

        System.out.println(employee);
    }
}
