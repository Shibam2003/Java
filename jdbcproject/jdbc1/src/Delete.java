import java.sql.*;
import java.io.*;
public class Delete {
    public static void main(String args[]) throws IOException{
        String s1;
        DataInputStream d = new DataInputStream(System.in);
        System.out.println("Enter the eid where record is to be deleted");
        s1 = d.readLine();
        
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");//registering the type4 driver
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");//providing physical connectivity with the database
            Statement stmt = con.createStatement();
            String str1 = "delete from t1 where eid='"+s1+"'";
            int x = stmt.executeUpdate(str1);//this method is responsible for firing the query
            if(x>0)
                System.out.println("Deletion successful");
            else
                System.out.println("Deletion failed");
            con.close();//closing the connection
}
         catch(Exception e){
            System.out.println(e);
        }
    }
}
