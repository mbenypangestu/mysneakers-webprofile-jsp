package test;

import dao.UserDao;
import model.User;

public class Test {

    public static void main(String args[])  {
        try {
            UserDao userDao = new UserDao();
            User user       = userDao.findById(2);
            user.setNama("M Beny Pangestu");

            userDao.setTableModel(user);

            System.out.println("Test "+ userDao.update(2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
