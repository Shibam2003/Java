import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.*;
import javax.servlet.http.*;

public class Validate extends HttpServlet{
    int ind = 0;
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        String em=req.getParameter("id");
     
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");//registering the type4 driver
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");//providing physical connectivity with the database
            Statement stmt = con.createStatement();
            String str1 = "update register set status1='true' where emailid='"+em+"'";
            int x = stmt.executeUpdate(str1);//this method is responsible for firing the query
            if(x>0){
            String str2 = "select * from register where status1='false'";
            ResultSet rs = stmt.executeQuery(str2);//here resultset is a class which hold the fetch table with or without the data
            
            pw.println("<html><body><table border=1 width=100%><tr><th align=center>Emailid</th><th align=center>password</th>"
                    +"<th align=center>Name</th><th align=center>contactno.</th><th align=center>ACTION</th>");
            
            while(rs.next()){
        
                pw.println("<tr><td align=center>"+rs.getString(1)+"</td> <td align=center>"+rs.getString(2)+
                       "</td> <td align=center>"+rs.getString(3)+"</td> <td align=center>"+rs.getString(4)+"</td><td align=center><a href=Validate?id="+rs.getString(1)+">Validate</a></td></tr>" );
                ind = 1;
            }
            pw.println("</table></body></html>");
             if(ind == 0) res.sendRedirect("view.html");
             ind = 0;
            }
           
                con.close();//closing the connection
            
}
         catch(Exception e){
            pw.println(e);
        }
    }
}