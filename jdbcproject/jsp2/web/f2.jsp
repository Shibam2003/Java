<%@page import="java.sql.*" %>
<html>
    <head><title>Welcome Screen</title></head>
    <body>
        <%
            String s1=request.getParameter("em");
            String s2=request.getParameter("ps");
            String s3=request.getParameter("nm");
            String s4=request.getParameter("con");
            try
            {
            Class.forName("oracle.jdbc.driver.OracleDriver");//registering the type4 driver
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");//providing physical connectivity with the database
            Statement stmt = con.createStatement();
           String q1 = "insert into jspt values('"+s1+"','"+s2+"','"+s3+"','"+s4+"')";
           int x = stmt.executeUpdate(q1);
           if(x>0){
               %>
               <jsp:forward page="success.jsp"/>
               <%
           }
        else{
        %>
        <jsp:forward page="failure.jsp"/>
             <%
}
con.close();
            }
            catch(Exception e){
               out.println(e);
}
 
           
    %></body>
</html>