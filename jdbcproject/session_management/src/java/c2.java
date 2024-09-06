import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class c2 extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        String s1=req.getParameter("c1");
        Cookie ob = new Cookie("nm",s1);//creating cookie
        res.addCookie(ob);//adding cookie to client side
        pw.println("<form method=post action=c3>"
                +"<input type=submit value=SUBMIT></form>");
    }
}