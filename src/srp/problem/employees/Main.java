package srp.problem.employees;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Ram", "Kumar", Gender.MALE, 2000);
        Employee.save(employee);

        System.out.println(employee);
    }
}
