import java.sql.*;
import java.io.*;
public class MultipleUpdate {
    public static void main(String args[]) throws IOException{
        String s1, s2, s3;
        DataInputStream d = new DataInputStream(System.in);
        System.out.println("Enter the eid where the contact is updated:");
        s1 = d.readLine();
        System.out.println("Enter the new contact no.:");
        s2 = d.readLine();
        System.out.println("Enter the name which is to be updated:");
        s3 = d.readLine();
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");//registering the type4 driver
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");//providing physical connectivity with the database
            Statement stmt = con.createStatement();
            String str1 = "update t1 set ecno='"+s2+"',ename='"+s3+"'where eid='"+s1+"'";
            int x = stmt.executeUpdate(str1);//this method is responsible for firing the query
            if(x>0)
                System.out.println("Updation successful");
            else
                System.out.println("Updation failed");
            con.close();//closing the connection
}
         catch(Exception e){
            System.out.println(e);
        }
    }
}
