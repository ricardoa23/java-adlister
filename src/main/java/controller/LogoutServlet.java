package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LogoutServlet", value = "/logout")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if ((boolean)session.getAttribute("admin")) {
            session.invalidate();
        }
        request.getRequestDispatcher("/WEB-INF/logout.jsp").forward(request, response);
    }

}
