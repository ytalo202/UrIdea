package dbUrIdea.viewcontrollers;

import dbUrIdea.models.CompaniesEntity;
import dbUrIdea.models.Company;
import dbUrIdea.services.HRService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * Created by Yoshinon on 13/07/2017.
 */
@WebServlet(name = "ValidacionCompañiaServlet",urlPatterns = "/va")


public class ValidacionCompaiaServlet extends HttpServlet {

    HRService service = new HRService();
    // Action View Paths
    public static String Indice_EDIT_URI = "/Listado.jsp";
    public static String Login_ADD_URI = "/login.jsp";
    public static String L_EDIT_URI = "/editL.jsp";
    public static String L_INDEX_URI = "/login.jsp";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {




 String usuario = request.getParameter("txtusuario");
        String clave = request.getParameter("txtclave");
        CompaniesEntity user= new CompaniesEntity();


        //String message = service.validarCompany(usuario,clave) ? "Update success" : "Error while updating";log(message);
      /*  if (service.getIdByCompany(usuario,clave)!=null){
            //response.sendRedirect(Indice_EDIT_URI);

            request.getRequestDispatcher("Listado.jsp").
                    forward(request,response);
            //RequestDispatcher dispatcher = request.getRequestDispatcher(Indice_EDIT_URI);dispatcher.forward(request, response);
        }else {
            if (service.getIdByCompany(usuario,clave)==null) {


            request.setAttribute("error",
                    "<script>alert('USUARIO Y/O CONTRSEÑA NO VALIDOS')" +
                            "</script>");

            request.getRequestDispatcher("login.jsp").forward(request, response);
            //RequestDispatcher dispatcher = request.getRequestDispatcher(Login_ADD_URI);dispatcher.forward(request, response);

        }

        }*/

            Company company = service.getIdByCompany(
                    request.getParameter("txtusuario"),
                    request.getParameter("txtclave"));
        if (company.getId()!='y') {
            request.setAttribute("company", company);
            request.setAttribute("action", "menu");

            RequestDispatcher dispatcher =
                    request.getRequestDispatcher(L_EDIT_URI);
            dispatcher.forward(request, response);
        }
        else {
            if (user.validar(usuario, clave) == false) {
                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(L_INDEX_URI);
                dispatcher.forward(request, response);

            }
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
