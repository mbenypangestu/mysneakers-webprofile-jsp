package test;

import dao.UserDao;
import model.User;

public class Test {

    public static void main(String args[]) {
        UserDao userDao = new UserDao();
        User user       = new User();
        user.setNama("Beny");
        user.setUsername("beny");
        user.setEmail("mbenypangestu@gmail.com");
        user.setPassword("beny123");

        userDao.setTableModel(user);
        userDao.save();

    }
}
