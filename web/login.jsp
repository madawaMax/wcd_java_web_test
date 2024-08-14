<%-- 
    Document   : login
    Created on : Aug 13, 2024, 11:58:14 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WCD</title>
    </head>
    <body>
        <h1>Sign In!</h1>
        
        <%
        if(request.getParameter("error")!= null){
                %>
        
                <h3 class="aa" ><%= request.getParameter("error") %></h3>
        <%
            }
        %>
        
        <form action="login" method="POST">
            
             <div class="mm">mobile</div>
             <input name="mobile"/>
             
              <button type="submit">sign in</button>
            
        </form>
        
    </body>
</html>
