package ocp.solution.employees;

public interface Specification<T> {

    boolean isSatisfied(T item);
}
