import java.sql.*;
public class EmployeeApp {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:33060/hrms_payroll";
        String username = "root";
        String password = "root";

        String sql = "SELECT employee_id, employee_name, salary FROM employee";

        try (
                Connection connection = DriverManager.getConnection(url, username, password);
                Statement statement = connection.createStatement();
                ResultSet result = statement.executeQuery(sql)
        ) {

            while (result.next()) {

                int id = result.getInt("employee_id");
                String name = result.getString("employee_name");
                double salary = result.getDouble("salary");

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Salary: " + salary);
                System.out.println();
            }

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}