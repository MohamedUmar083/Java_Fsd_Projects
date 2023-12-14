import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userEmail = request.getParameter("email");
        String userPassword = request.getParameter("password");
        String correctEmail = "user@example.com";
        String correctPassword = "password123";
        if (userEmail.equals(correctEmail) && userPassword.equals(correctPassword)) {
            response.sendRedirect("dashboard.html");
        } else {
            response.sendRedirect("error.html");
        }
    }
}   



