<html>
    <head><title>Welcome Screen</title></head>
    <body>
        <%
            String s1=request.getParameter("n1");
            out.println("Welcome "+s1);
            %>
    </body>
</html>