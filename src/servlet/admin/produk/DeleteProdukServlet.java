package servlet.admin.produk;

import controller.ProdukController;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EditProdukServlet", urlPatterns = "/administrator/produk/delete")
public class DeleteProdukServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProdukController produkController = new ProdukController();
        try {
            if (produkController.deleteProduk(request, response)) {
                System.out.println("Test");
            }else{
                System.out.println("Failed");
            }
            response.sendRedirect("/administrator/produk");
        } catch (Exception e) {
            getServletContext().log(e.getMessage());
        }
    }
}
