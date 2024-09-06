import java.sql.*;
import java.io.*;
public class Insert {
    public static void main(String args[]) throws IOException{
        String s1, s2, s3;
        DataInputStream d = new DataInputStream(System.in);
        System.out.println("Enter the eno:");
        s1 = d.readLine();
        System.out.println("Enter the ename:");
        s2 = d.readLine();
        System.out.println("Enter the ecno:");
        s3 = d.readLine();
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");//registering the type4 driver
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");//providing physical connectivity with the database
            Statement stmt = con.createStatement();
            String str1 = "insert into t1 values('"+s1+"','"+s2+"','"+s3+"')";
            int x = stmt.executeUpdate(str1);//this method is responsible for firing the query
            if(x>0)
                System.out.println("Insertion successful");
            else
                System.out.println("Insertion failed");
            con.close();//closing the connection
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
