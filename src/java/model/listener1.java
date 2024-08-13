package model;

import java.util.ArrayList;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class listener1 implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        ArrayList<user> ar = new ArrayList<user>();
        sce.getServletContext().setAttribute("ar", ar);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }

}
