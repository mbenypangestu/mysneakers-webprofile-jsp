package test;

import controller.ProdukController;
import controller.UserController;
import dao.UserDao;
import model.User;

public class Test {

    public static void main(String args[])  {
        ProdukController produkController = new ProdukController();
        try {
            if(produkController.addProduk(
                    1,
                    2,
                    "TestNama",
                    "TestDesc",
                    "TestBahan",
                    10000,
                    2,
                    null
                    )){
                System.out.println("Sukses");
            } else {
                System.out.println("fail");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
