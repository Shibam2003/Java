/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chakr
 */

import java.sql.*;
import java.io.*;
public class signup {
    public static void main(String args[]) throws IOException{
        String s1, s2, s3,s4,s5,s6,s7;
        DataInputStream d = new DataInputStream(System.in);
        System.out.println("Enter the name:");
        s1 = d.readLine();
        System.out.println("Enter the email:");
        s2 = d.readLine();
        System.out.println("Enter the password:");
        s3 = d.readLine();
        System.out.println("Enter the security_question:");
        s4 = d.readLine();
        System.out.println("Enter the answer:");
        s5 = d.readLine();
        System.out.println("Enter the address:");
        s6 = d.readLine();
        System.out.println("Enter the contact:");
        s7 = d.readLine();
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");//registering the type4 driver
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");//providing physical connectivity with the database
            Statement stmt = con.createStatement();
            String str1 = "insert into registration values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"')";
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

