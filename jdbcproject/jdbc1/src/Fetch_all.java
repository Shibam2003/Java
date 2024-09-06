import java.sql.*;
import java.io.*;
public class Fetch_all {
    public static void main(String args[]) throws IOException{
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");//registering the type4 driver
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");//providing physical connectivity with the database
            Statement stmt = con.createStatement();
            String str1 = "select * from t1";
            ResultSet rs = stmt.executeQuery(str1);//here resultset is a class which hold the fetch table with or without the data
            while(rs.next()){
                System.out.println("Your name is "+rs.getString(2));
                System.out.println("Your contact no. is "+rs.getString(3));
            }
            con.close();//closing the connection
}
         catch(Exception e){
            System.out.println(e);
        }
    }
}
