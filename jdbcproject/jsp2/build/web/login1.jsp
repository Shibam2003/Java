<%@page import="java.sql.*" %>
<html>
    <head><title>Login page</title></head>
    <body>
        <%
            String s1=request.getParameter("em");
            String s2=request.getParameter("ps");
//            String s3=request.getParameter("nm");
//            String s4=request.getParameter("con");
            try
            {
            Class.forName("oracle.jdbc.driver.OracleDriver");//registering the type4 driver
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");//providing physical connectivity with the database
            Statement stmt = con.createStatement();
           String str1 = "select * from jspt where email='"+s1+"' and password='"+s2+"'";
           ResultSet rs = stmt.executeQuery(str1);
           if(rs.next()){
               %>
               <jsp:forward page="loginsuccess.jsp"/>
               <%
           }
        else{
        %>
        <jsp:forward page="loginfail.jsp"/>
             <%
}
con.close();
            }
            catch(Exception e){
               out.println(e);
}
 
           
    %></body>
</html>