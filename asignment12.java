import java.sql.*;

class Employee {
    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

 
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:/emp", "root", "");


            Statement stmt = con.createStatement();


            ResultSet rs = stmt.executeQuery(
                "SELECT * FROM emp_data"
            );


             System.out.printf("%-10s %-10s %-10s %-5s %-15s\n",
                    "EmpID", "FirstName", "LastName", "Age", "DOJ");


            while (rs.next()) {
                System.out.printf("%-10d %-10s %-10s %-5d %-15s\n",
                        rs.getInt("emp_id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getInt("age"),
                        rs.getDate("doj"));
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}