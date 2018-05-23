package test;

import controller.UserController;
import dao.UserDao;
import model.User;

public class Test {

    public static void main(String args[])  {
        UserController userController = new UserController();
        try {
            if (userController.login("mbenypangestu@gmail.com", "beny")){
                System.out.println("test");
            } else {
                System.out.println("failed");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
