package servlet;

import controller.UserController;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserController userController = new UserController();
        try {
            if (userController.login(request, response)){
                getServletContext().log("test");
                response.sendRedirect("/administrator");
            } else {
                getServletContext().log("failed");
                response.sendRedirect("/login");
            }
        } catch (Exception e) {
            getServletContext().log(e.getMessage());
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/pages/login.jsp");
        dispatcher.forward(request, response);
    }
}
