package Test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;


@WebServlet("/r1")
public class resp1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String user = req.getParameter("文本框名字");
        System.out.println(user);
        this.doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("r1");
//resp.setStatus(302);
//resp.setHeader("location","/tomact1_war/r2");
////简化
//        resp.sendRedirect("/tomact1_war/r2");
        PrintWriter writer = resp.getWriter();
        writer.write("你好");
    }
}
