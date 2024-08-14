<%-- 
    Document   : home
    Created on : Aug 14, 2024, 12:12:05 AM
    Author     : User
--%>

<%@page import="model.user"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WCD</title>
    </head>
    <body>
        <h1>Home!</h1>
        
        <%
        if(session.getAttribute("user")!=null){
           user u = (user)session.getAttribute("user");
           
           %>
        
           <p>name:<%= u.getName() %> </p>
           <p>mobile<%= u.getName()%> </p>
             <p>country<%= u.getCountry()%> </p>
        
        <%
            
            }else{
            
            response.sendRedirect("login.jsp");
            
            }
        
        
        %>
    </body>
</html>
