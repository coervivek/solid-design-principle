package ocp.solution.employees;

import java.util.Collection;
import java.util.List;

public interface Filter<T> {

    Collection<T> filter(List<T> items, Specification<T> specification);
}
