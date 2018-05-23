package controller;

import dao.UserDao;
import model.User;
import model.UserModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController {

    public void register(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        String nama             = request.getParameter("nama");
        String email            = request.getParameter("email");
        String password         = request.getParameter("password");
        String confirm_password = request.getParameter("confirm_password");

        UserDao userDao = new UserDao();
        User user       = new User();

        user.setNama(nama);
        user.setEmail(email);
        user.setPassword(password);

        userDao.save();
    }

}
