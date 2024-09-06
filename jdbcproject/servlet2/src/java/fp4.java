import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class fp4 extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
//        String em=req.getParameter("em1");
        String ps=req.getParameter("ps1");
        try{
            HttpSession ses = req.getSession();
            String s1 = (String)ses.getAttribute("nm1");
            Class.forName("oracle.jdbc.driver.OracleDriver");//registering the type4 driver
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");//providing physical connectivity with the database
             Statement stmt = con.createStatement();
             String str1 = "update shibam set password='"+ps+"'where email='"+s1+"'";
             int x = stmt.executeUpdate(str1);//this method is responsible for firing the query
            if(x>0){
                pw1.println("Updation successful welcome "+s1);
                pw1.println("new password is: "+ps);
            }
                else{
                System.out.println("Updation failed");}
            con.close();//closing the connection
}
         catch(Exception e){
            System.out.println(e);
        }
    }
}