package ocp.solution.employees;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFilter implements Filter<Employee> {

    @Override
    public Collection<Employee> filter(List<Employee> employees, Specification<Employee> specification) {
        return employees.stream()
            .filter(specification::isSatisfied)
            .collect(Collectors.toUnmodifiableList());
    }
}
