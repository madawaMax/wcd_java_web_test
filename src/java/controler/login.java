package controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.registry.infomodel.User;
import model.user;

public class login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String mobile = request.getParameter("mobile");

        ServletContext servletContext = request.getServletContext();
        ArrayList<user> arlist = (ArrayList<user>) servletContext.getAttribute("ar");

        boolean ufound = false;

        for (user u : arlist) {
            if (u.getMobile().equals(mobile)) {
                ufound = true;
                
                HttpSession session = request.getSession();
                session.setAttribute("user", u);
                
                response.sendRedirect("home.jsp");
                break;

            }
        }

        if (!ufound) {
            response.sendRedirect("sign_up.jsp?error=Invalid Details");
        }
    }

}
