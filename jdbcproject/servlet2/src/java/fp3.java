import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class fp3 extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
//        String em=req.getParameter("fname3");
        String ans = req.getParameter("n8");
        try{
            HttpSession ses = req.getSession();
            String s1 = (String)ses.getAttribute("nm1");
            Class.forName("oracle.jdbc.driver.OracleDriver");//registering the type4 driver
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");//providing physical connectivity with the database
             Statement stmt = con.createStatement();
             String str1 = "select * from shibam where email='"+s1+"' and ans='"+ans+"'";
            ResultSet rs = stmt.executeQuery(str1);//here resultset is a class which hold the fetch table with or without the data
            if(rs.next()){
                pw1.println("<html>\n" +
"	<head>\n" +
"		<title>welcome again</title>\n" +
"		\n" +
"	</head>\n" +
"	\n" +
"	<body bgcolor=\"#ed837b\">\n" +
"		\n" +
"		\n" +
"		<center>\n" +
"		<form  action=\"fp4\" name=\"myForm4\"  method=\"post\">\n" +
"		<table>\n" +
"		<h1 align=\"center\"><u>Welcome agian</u></h1>\n" +
"		<tr>\n" +
"		<td>NEW PASSWORD:</td>\n" +
"		<td><input type=\"text\" name=\"ps1\" placeholder=\"type your new password\"></td>\n" +
"		</tr>\n" +
"		<tr>\n" +
"		<td>Email:</td>\n" +
"		<td>"+s1+"</td>\n" +
"		</tr>\n" +
"		<tr>\n" +
"		<td align=\"center\"><input type=\"submit\" value=\"SUBMIT\"></td>\n" +
"		</tr>\n" +
"		</table>\n" +
"		</form>\n" +
"		</center>\n" +
"		\n" +
"		\n" +
"	</body>\n" +
"</html>");
//                pw1.println("<br> Welcome "+rs.getString(1));
                
            }
            else{
                pw1.println("fail to load");
            }
            con.close();
        }
        catch(Exception e){
            pw1.println(e);
        }
    }
}