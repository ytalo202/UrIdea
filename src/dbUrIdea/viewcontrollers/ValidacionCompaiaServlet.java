package dbUrIdea.viewcontrollers;

import dbUrIdea.models.CompaniesEntity;
import dbUrIdea.services.HRService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Yoshinon on 13/07/2017.
 */
@WebServlet(name = "ValidacionCompañiaServlet",urlPatterns = "/valiCom")


public class ValidacionCompaiaServlet extends HttpServlet {

    HRService service = new HRService();
    // Action View Paths
    public static String Indice_EDIT_URI = "/Listado.jsp";
    public static String Login_ADD_URI = "/login.jsp";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String usuario = request.getParameter("txtusuario");
        String clave = request.getParameter("txtclave");
        CompaniesEntity user= new CompaniesEntity();
        if (user.validarUserCompany(usuario,clave)){

            //request.getRequestDispatcher("Listado.jsp").forward(request,response);
            RequestDispatcher dispatcher =
                    request.getRequestDispatcher(Indice_EDIT_URI);
            dispatcher.forward(request, response);
        }else{
            request.setAttribute("error",
                    "<script>alert('USUARIO Y/O CONTRSEÑA" +
                            "NO VALIDOS')</script>");

            //request.getRequestDispatcher("index.jsp").forward(request,response);
            RequestDispatcher dispatcher =
                    request.getRequestDispatcher(Login_ADD_URI);
            dispatcher.forward(request, response);

        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
