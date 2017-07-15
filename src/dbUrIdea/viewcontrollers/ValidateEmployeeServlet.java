package dbUrIdea.viewcontrollers;

import dbUrIdea.models.CompaniesEntity;
import dbUrIdea.models.Company;
import dbUrIdea.models.Employee;
import dbUrIdea.models.EmployeesEntity;
import dbUrIdea.services.HRService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Magnus on 7/15/2017.
 */
@WebServlet(name = "ValidateEmployeeServlet",urlPatterns = "/validateEmployee")
public class ValidateEmployeeServlet extends HttpServlet {
    HRService service = new HRService();
    public static String Indice_EDIT_URI = "/Listado.jsp";
    public static String Login_ADD_URI = "/login.jsp";
    public static String L_EDIT_URI = "/loginEmployeeSuccess.jsp";
    public static String L_INDEX_URI = "/loginEmployee.jsp";


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("txtemail");
        String usuario ="";
        String password = request.getParameter("txtpassword");
        EmployeesEntity user= new EmployeesEntity();

        if (!request.getParameter("txtemail").equalsIgnoreCase("")&&!request.getParameter("txtpassword").equalsIgnoreCase("")) {
            try{Employee employee = service.getIdByEmployee(email, password);
                request.setAttribute("employee", employee);
                RequestDispatcher dispatcher =request.getRequestDispatcher(L_EDIT_URI);
                dispatcher.forward(request,response);
                log("FUNCIONA");}

            catch (Exception e){
                //    response.sendRedirect("login.jsp?error=Nombre y/o usuarios invalidos");
                RequestDispatcher dispatcher =request.getRequestDispatcher(L_INDEX_URI);
                dispatcher.forward(request, response);
            log("FUNCIONA A MEDIAS");
            }
        }
        else {
            //response.sendRedirect("login.jsp?error=Nombre y/o usuarios invalidos");
            if (user.validar(usuario, password) == false) {
                log("NO FUNCIONA");
                RequestDispatcher dispatcher = request.getRequestDispatcher(L_INDEX_URI);
                dispatcher.forward(request, response);

            }
        }

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
