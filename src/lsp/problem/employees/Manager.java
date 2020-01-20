package lsp.problem.employees;

import common.Gender;

public class Manager extends Employee {

    public Manager(String firstName, String lastName, Gender gender) {
        super(firstName, lastName, gender);
    }

    public void generatePerformanceReview() {
        System.out.println("I am reviewing a direct report's performance.");
    }

    @Override
    public void calculatePerHourRate(int rank) {
        double baseAmount = 19.75;
        setSalary(baseAmount + (rank * 4));
    }
}
