package ocp.solution.employees;

public class EmployeeFirstNameSpecification implements Specification<Employee> {

    private final String firstName;

    public EmployeeFirstNameSpecification(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public boolean isSatisfied(Employee employee) {
        return employee.getFirstName().equals(firstName);
    }
}
