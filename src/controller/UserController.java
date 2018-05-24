package controller;

import config.Variable;
import dao.UserDao;
import model.User;
import model.UserModel;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.nio.charset.Charset;
import java.util.Random;

public class UserController {

    public boolean register(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        String nama             = request.getParameter("nama");
        String email            = request.getParameter("email");
        String password         = request.getParameter("password");
        String confirm_password = request.getParameter("confirm_password");

        UserDao userDao = new UserDao();
        User user       = new User();

        user.setNama(nama);
        user.setEmail(email);
        user.setPassword(password);

        userDao.setTableModel(user);
        if (userDao.save()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean login(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        HttpSession session     = request.getSession(true);
        String email            = request.getParameter("email");
        String password         = request.getParameter("password");

        UserDao userDao = new UserDao();
        User user       = userDao.findByEmail(email);

        if (user != null && user.getPassword().equals(password)) {
            user.setRemember_token(Variable.generateRandom());
            userDao.setTableModel(user);
            userDao.update(user.getId());

            session.setAttribute("sessionUser", user);

            return true;
        } else {
            return false;
        }
    }

    public boolean login(String email, String password){
        UserDao userDao = new UserDao();
        User user       = userDao.findByEmail(email);

        System.out.println(user.getNama());

        if (user != null && user.getPassword().equals(password)) {
            user.setRemember_token(Variable.generateRandom());
            System.out.println(user.getRemember_token());
            userDao.setTableModel(user);
            userDao.update(user.getId());
            return true;
        } else {
            return false;
        }
    }

}
