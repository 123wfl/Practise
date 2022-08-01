package Test;

import javax.annotation.Resource;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet("/tom")
public class Servelt implements Servlet {

    public void init(ServletConfig servletConfig) throws ServletException {

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("hhhhh");
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
