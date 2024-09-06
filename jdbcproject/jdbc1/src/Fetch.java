import java.sql.*;
import java.io.*;
public class Fetch {
    public static void main(String args[]) throws IOException{
        String s1;
        DataInputStream d = new DataInputStream(System.in);
        System.out.println("Enter the eid which data you want to fetch");
        s1 = d.readLine();
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");//registering the type4 driver
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");//providing physical connectivity with the database
            Statement stmt = con.createStatement();
            String str1 = "select * from t1 where eid='"+s1+"'";
            ResultSet rs = stmt.executeQuery(str1);//here resultset is a class which hold the fetch table with or without the data
            if(rs.next())//here the next method check whethere the table contains data or not
            {
                System.out.println("Your name is "+rs.getString(2));
                System.out.println("Your contact no. is "+rs.getString(3));
            }
            else{
                System.out.println("No record found");
            }
            
            con.close();//closing the connection
}
         catch(Exception e){
            System.out.println(e);
        }
    }
}
