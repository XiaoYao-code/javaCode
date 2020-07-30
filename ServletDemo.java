package ha;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletDemo   extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.setHeader("set-Cookie","today=2020-7-9");
       resp.setContentType("text/plain:charset=utf-8");
       resp.getWriter().println("种cookie：today=2020-7-9");
    }
}
