package servlet.admin.produk;

import controller.ProdukController;
import controller.UserController;
import dao.ProdukDao;
import model.Produk;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddProdukServlet", urlPatterns = "/administrator/produk/add")
public class AddProdukServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProdukController produkController = new ProdukController();
        try {
            if (produkController.addProduk(request, response)) {
                System.out.println("Test");
                response.sendRedirect("/administrator/produk");
            }else{
                System.out.println("Test");
                response.sendRedirect("/administrator/produk/add");
            }
        } catch (Exception e) {
            getServletContext().log(e.getMessage());
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = this.getServletContext().
                getRequestDispatcher("/pages/admin/produk/add.jsp");
        dispatcher.forward(request, response);
    }
}
