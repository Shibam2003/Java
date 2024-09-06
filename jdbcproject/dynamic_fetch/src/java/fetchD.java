import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.*;
import javax.servlet.http.*;

public class fetchD extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        String em=req.getParameter("em");
        String ps=req.getParameter("ps");
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");//registering the type4 driver
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");//providing physical connectivity with the database
            Statement stmt = con.createStatement();
            String str1 = "select * from register where status1='false'";
            ResultSet rs = stmt.executeQuery(str1);//here resultset is a class which hold the fetch table with or without the data
            pw.println("<html><body><table border=1 width=100%><tr><th align=center>Emailid</th><th align=center>password</th>"
                    +"<th align=center>Name</th><th align=center>contactno.</th><th align=center>ACTION</th>");
            while(rs.next()){
                pw.println("<tr><td align=center>"+rs.getString(1)+"</td> <td align=center>"+rs.getString(2)+
                       "</td> <td align=center>"+rs.getString(3)+"</td> <td align=center>"+rs.getString(4)+"</td><td align=center><a href=Validate?id="+rs.getString(1)+">Validate</td></tr>" );
            }
            pw.println("</table></body></html>");
            con.close();//closing the connection
}
         catch(Exception e){
            pw.println(e);
        }
//            if(rs.next())//here the next method check whethere the table contains data or not
//            {
//                pw.println("Login successful "+rs.getString(1));
//            }
//            else{
//                pw.println("No record found");
//            }
//            
//            con.close();//closing the connection
//}
//         catch(Exception e){
//            pw.println(e);
//        }
    }
}