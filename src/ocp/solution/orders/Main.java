package ocp.solution.orders;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        FileExporter fileExporter = new FileExporter();
        OrderExportWriter orderExportWriter = new OrderExportWriter(List.of());
        UserExportWriter userExportWriter = new UserExportWriter(List.of());

        fileExporter.export("orders.txt", orderExportWriter::writeContent);
        fileExporter.export("users.txt", userExportWriter::writeContent);
    }
}
