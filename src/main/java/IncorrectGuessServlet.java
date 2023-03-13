import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "IncorrectGuessServlet", value = "/incorrect")
public class IncorrectGuessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("answer", "You didn't get it");
        request.getRequestDispatcher("GuessingGameAnswer.jsp").forward(request,response);
    }
}
