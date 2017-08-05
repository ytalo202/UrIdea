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
import javax.swing.*;
import java.io.IOException;

/**
 * Created by Magnus on 7/15/2017.
 */
@WebServlet(name = "ValidateEmployeeServlet",urlPatterns = "/validateEmployee")
public class ValidateEmployeeServlet extends HttpServlet {
    HRService service = new HRService();
    public static String COMPANY_EDIT_URI = "/VaMensajeEntrada.jsp";
    public static String EMPLOYEE_EDIT_URI = "/loginEmployeeSuccess.jsp";
    public static String EMPLOYEE_INDEX_URI = "/login.jsp";
    public static String INDEX_URI = "/index.jsp";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = new String(request.getParameter("txtemail").getBytes("ISO-8859-1"),"UTF-8");
        String usuario = "";
        String password = new String(request.getParameter("txtpassword").getBytes("ISO-8859-1"),"UTF-8");
        EmployeesEntity e = new EmployeesEntity();
        CompaniesEntity c = new CompaniesEntity();
        String validaciones = "";
        if (!request.getParameter("txtemail").
                equalsIgnoreCase("") && !request.getParameter
                ("txtpassword").equalsIgnoreCase("")) {

            try {

                request.setAttribute("validaciones", validaciones);
                Employee employee = service.getIdByEmployee(email, password);
                request.setAttribute("employee", employee);
                RequestDispatcher dispatcher = request.getRequestDispatcher
                        (EMPLOYEE_EDIT_URI);
                dispatcher.forward(request, response);
                log("FUNCIONA EMPLOYEE");
            }
            catch (Exception a) {
                try {request.setAttribute("validaciones", validaciones);
                Company company = service.getIdByCompany(email, password);
                request.setAttribute("company", company);
                RequestDispatcher dispatcher = request.getRequestDispatcher(COMPANY_EDIT_URI);
                dispatcher.forward(request, response);
                log("FUNCIONA COLMPANY");
            } catch (Exception b) {
                    log("DATOS INGRESADOS ERRONEOS");
                    validaciones="Correo y/o Contraseña Incorrectos";
                    request.setAttribute("validaciones", validaciones);
                RequestDispatcher dispatcher = request.getRequestDispatcher(EMPLOYEE_INDEX_URI);
                dispatcher.forward(request, response);
            }

            }
        } else {


                if (e.validar(usuario, password) == false) {
                    request.setAttribute("validaciones", validaciones);
                        RequestDispatcher dispatcher = request.getRequestDispatcher(EMPLOYEE_INDEX_URI);
                        dispatcher.forward(request, response);
                        log("NO HAY DATOS 1");
                }


            }
        }




    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
