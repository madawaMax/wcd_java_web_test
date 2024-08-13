<%-- 
    Document   : sign_up
    Created on : Aug 13, 2024, 10:12:42 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WCD</title>
        <link rel="stylesheet" href="css/style.css"/>
    </head>
    <body>
        <h1>sign up!</h1>
        
        <form action="signup" method="POST">
             <div class="mm">mobile</div>
             <input name="mobile"/>
        
        <div class="mm">name</div>
        <input name="nam"/>
        
        <div class="mm">country</div>
        <select name="country">
            <option>srilanka</option>
            <option>aus</option>
            <option>germany</option>
        </select>
        
        <button type="submit">sign up</button>
        </form>
       
         
    </body>
</html>
