package Controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet (name = "showNameandFamily")
public class showNameandFamily extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher dispatcher = req.getRequestDispatcher("/showName.jsp");

        String name, family;
        name = req.getParameter("Name");
        family = req.getParameter("Family");
        req.setAttribute("N", name);
       req.setAttribute("F", family);

        dispatcher.forward(req,resp);


    }
}
