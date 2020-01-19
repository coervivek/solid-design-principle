package ocp.solution.employees;

import common.Gender;

public class EmployeeGenderSpecification implements Specification<Employee> {

    private final Gender gender;

    public EmployeeGenderSpecification(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean isSatisfied(Employee employee) {
        return employee.getGender() == gender;
    }
}
