package ocp.problem.orders;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        FileExporter fileExporter = new FileExporter();

        fileExporter.exportOrders(List.of(), "orders.txt");
        fileExporter.exportUsers(List.of(), "users.txt");
    }
}
