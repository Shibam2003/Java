import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class signup extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
    res.setContentType("text/html");
    PrintWriter pw1=res.getWriter();
    String nm=req.getParameter("fname1");
    String em=req.getParameter("fname3");
    String ps=req.getParameter("fname2");
    String sq=req.getParameter("n7");
    String ans=req.getParameter("n8");
    String con1=req.getParameter("fname4");
    String add=req.getParameter("add1");
//    pw1.println(
//    "<html><body bgcolor=skyblue>Welcome "
//            +nm+"<br>"+"your email is "+em+"<br>"+"security question is "+sq+"<br>"+"answer is "+ans
//            +"<br>"+"contact no. is "+con+"<br>"+"address is "+add+"</body></html>");
try{
            Class.forName("oracle.jdbc.driver.OracleDriver");//registering the type4 driver
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");//providing physical connectivity with the database
            Statement stmt = con.createStatement();
            String str1 = "insert into shibam values('"+nm+"','"+em+"','"+ps+"','"+sq+"','"+ans+"','"+con1+"','"+add+"')";
            int x = stmt.executeUpdate(str1);//this method is responsible for firing the query
            if(x>0)
                pw1.println("Insertion successful");
            else
                pw1.println("Insertion failed");
            con.close();//closing the connection
        }
        catch(Exception e){
            pw1.println(e);
        }
    } 
}