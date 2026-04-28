import java.sql.*; //first party i.e Java 
class studentdata{
    public static void main(String[] args) {
        Connection cn;// storing database url in Connection variable cn
        Statement stmt;// using this variable for query execution 
        ResultSet rs;// storing result in ResultSet variable rs
        try{
            //Step 1: Loading the Mysql driver 
            //Class.forName("com.mysql.jdbc.Driver");//Class-path (third party i.e not built in java) this is deprecated.
            Class.forName("com.mysql.cj.jdbc.Driver");//new driver class 
            //Step 2: Establishing Connection
            cn = DriverManager.getConnection("jdbc:mysql://localhost/tyjdbc","root","");
            
             //getConnection("DBurl,"DBuser","DBpwd");
            /*In Java the Sql package has a DriverManager class having getConnection method 
            which has 3 parameters  ("jdbc:DBproductName://hostName:PortNo/DBName","(DBusername)","(DBpassword)") 
            (PortNo if having multiple db product)*/
            

            //Step 3: Create Statement
            stmt = cn.createStatement();

            //Step 4: Execute Queries
            rs = stmt.executeQuery("Select * from student");            

            //Step 5: Print Result
            System.out.println("ROll NO.\tName\t\tMarks");
            while(rs.next()){
                System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getFloat(3));
                //System.out.println("Name: "+rs.getString(2));`
                //System.out.println("Marks: "+rs.getFloat(3));
            }


        }catch(Exception e){
            System.out.println(e    );
        }
    }
}