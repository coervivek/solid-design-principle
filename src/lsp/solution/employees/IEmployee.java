package lsp.solution.employees;

import common.Gender;

public interface IEmployee {

    String getId();

    void setId(String id);

    String getFirstName();

    void setFirstName(String firstName);

    String getLastName();

    void setLastName(String lastName);

    Gender getGender();

    void setGender(Gender gender);

    double getSalary();

    void setSalary(double salary);

    void calculatePerHourRate(int rank);
}
