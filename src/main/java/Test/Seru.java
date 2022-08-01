package Test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;

public class Seru extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader reader = req.getReader();
        String s = reader.readLine();
        System.out.println(s);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Map<String,String[]> map=req.getParameterMap();
        for (String s : map.keySet()) {
            System.out.print(s+":");
            String[] strings = map.get(s);
            for (String string : strings) {
                System.out.print(string+" ");
            }
            System.out.println();
        }




//        String method=req.getMethod();
//        System.out.println(method);
//        String contextPath = req.getContextPath();
//        System.out.println(contextPath);
//        StringBuffer requestURL = req.getRequestURL();
//        System.out.println(requestURL);
//        String queryString = req.getQueryString();
//        System.out.println(queryString);
//
//        String header = req.getHeader("user-agent");
//        System.out.println(header);
    }
}
