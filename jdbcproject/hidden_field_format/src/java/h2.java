import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class h2 extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        String s1=req.getParameter("c1");
        
        pw.println("<form method=post action=h3>"
                +"<input type=hidden name=n1 value="+s1+">"
                +"<input type=submit value=SUBMIT></form>");
    }
}