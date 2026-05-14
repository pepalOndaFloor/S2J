<%@ page language ="java" import = "java.sql.*" %>

<html>
<head>
</head>
<body>
    <h1>Patient Details</h1>    
    <table border="1">  
        <thead>
            <tr>
                <th>Patient Number</th>
                <th>Patient Name</th>
                <th>Patient Address</th>
                <th>Patient Age</th>
                <th>Patient Disease</th>
            </tr>
        </thead>
        <tbody>
            <%
                String DBurl = "jdbc:postgresql://localhost/postgres";
                String DBuser = "postgres";
                String DBpass = "password";

                Connection con = null;
                Statement stmt = null;
                ResultSet rs = null;
                try{
                    Class.forName("org.postgresql.Driver");
                    con = DriverManager.getConnection(DBurl,DBuser,DBpass);
                    stmt = con.createStatement();
                    rs = stmt.executeQuery("Select * from patient");

                    while(rs.next()){
                        String pno = rs.getString("pno");
                        String pname = rs.getString("pname");
                        String address = rs.getString("address");
                        String age = rs.getString("age");
                        String disease = rs.getString("disease");
                    
                    %>

                    <tr>
                        <td><%= pno %></td>
                        <td><%= pname %></td>
                        <td><%= address %></td>
                        <td><%= age %></td>
                        <td><%= disease %></td>
                    </tr>
                <%
                    }
                }catch(ClassNotFoundException cnfe){
                    out.println("Unable to locate psql class "+cnfe);
                }catch(SQLException sqle){
                    out.println("some sql exception occured "+sqle);
                }catch(Exception e){
                    out.println("something went wrong "+e);
                }
            %>
        </tbody>
    </table>
</body>
</html>