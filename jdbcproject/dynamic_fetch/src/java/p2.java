import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.*;
import javax.servlet.http.*;

public class p2 extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        String em=req.getParameter("em");
        String ps=req.getParameter("ps");
        String nm=req.getParameter("nm");
        String co=req.getParameter("con");
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");//registering the type4 driver
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");//providing physical connectivity with the database
            Statement stmt = con.createStatement();
            String str1 = "insert into register values('"+em+"','"+ps+"','"+nm+"','"+co+"','false','false')";
            int x = stmt.executeUpdate(str1);//this method is responsible for firing the query
            if(x>0)
                pw.println("Insertion successful");
            else
                pw.println("Insertion failed");
            con.close();//closing the connection
        }
        catch(Exception e){
            pw.println(e);
        }
    }
}