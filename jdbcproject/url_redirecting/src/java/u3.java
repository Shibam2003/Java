import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class u3 extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        String s1 = req.getParameter("id1");
        pw.println("Welcome "+s1);
        
    }
}