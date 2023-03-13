import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "GuessingGameServlet", value = "/guess")
public class GuessingGameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("GuessingGame.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String answer = request.getParameter("number");
        int randomNumber = (int) (Math.floor(Math.random() * 3) + 1);

        if(Integer.parseInt(answer) == randomNumber) {
            response.sendRedirect("/correct");
        } else {
            response.sendRedirect("/incorrect");

        }

    }
}
