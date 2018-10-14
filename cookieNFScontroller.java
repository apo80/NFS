package Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet (name = "cookieNFS")
public class cookieNFScontroller extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String N,F;

        N=req.getParameter("Name");
        F=req.getParameter("Family");


        Cookie cookie = new Cookie("name",N);
        Cookie cookie1 = new Cookie("family",F);

        cookie.setPath("/");
        cookie1.setPath("/");
        resp.addCookie(cookie);
        resp.addCookie(cookie1);
        resp.sendRedirect("/showCkookie");

    }
}
