package controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.user;

public class signup extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String mobile = request.getParameter("mobile");
        String name = request.getParameter("nam");
        String country = request.getParameter("country");

//        System.out.println(mobile);
//        System.out.println(name);
//        System.out.println(country);
        user u = new user(mobile, name, country);

        ServletContext sc = request.getServletContext();

        ArrayList<user> ar = (ArrayList<user>) sc.getAttribute("ar");
        ar.add(u);
        
      response.sendRedirect("login.jsp");

    }

}
