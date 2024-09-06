import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class signin extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
        String em=req.getParameter("n2");
        String ps=req.getParameter("n3");
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");//registering the type4 driver
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");//providing physical connectivity with the database
             Statement stmt = con.createStatement();
             String str1 = "select * from shibam where email='"+em+"' and password='"+ps+"'";
            ResultSet rs = stmt.executeQuery(str1);//here resultset is a class which hold the fetch table with or without the data
            if(rs.next()){
                pw1.println("Login successful:");
                pw1.println("<br> Welcome "+rs.getString(1));
                
            }
            else{
                pw1.println("Login unsuccessful");
            }
            con.close();
        }
        catch(Exception e){
            pw1.println(e);
        }
    }
}