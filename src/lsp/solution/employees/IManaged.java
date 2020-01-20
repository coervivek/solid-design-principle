package lsp.solution.employees;

public interface IManaged extends IEmployee {

    IEmployee getManager();

    void assignManager(IEmployee manager);
}
