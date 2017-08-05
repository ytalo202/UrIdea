package dbUrIdea.viewcontrollers;

import dbUrIdea.models.Company;
import dbUrIdea.models.Employee;
import dbUrIdea.services.HRService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Yoshinon on 4/08/2017.
 */
@WebServlet(name = "SearchServlet",urlPatterns = "/search")
public class SearchServlet extends HttpServlet {
    // Service Layer access object
    HRService service = new HRService();
    // Action View Paths
    public static String CVS_EDIT_URI = "/editCv.jsp";
    public static String CVS_ADD_URI = "/newCv.jsp";
    public static String CVS_INDEX_URI = "/listCv.jsp";
    public static String perfilComp_uri = "/perfilIndexCompañia.jsp";
    public static String INDEX_URI = "/index.jsp";
    public static String perfilEmpleado_uri = "/perfilIndexEmpleado.jsp";
    public static String perfilAdmin_uri = "/perfilIndexAdm.jsp";
int codComp;
int codEmp;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String validaciones = "";
            String action = request.getParameter("action");
            switch (action) {

                case "Buscar": {

                    try {
                        codComp = Integer.parseInt(request.getParameter("cod"));
                        Company company = service.getCompanyById(codComp);
                        request.setAttribute("company", company);
                        request.setAttribute("action", "edit");

                        RequestDispatcher dispatcher =
                                request.getRequestDispatcher(perfilComp_uri);
                        dispatcher.forward(request, response);
                        break;
                    } catch (Exception e) {
                        validaciones = "Código Ingresado Invalido";
                        request.setAttribute("validaciones", validaciones);
                        RequestDispatcher dispatcher = request.getRequestDispatcher(INDEX_URI);
                        dispatcher.forward(request, response);
                        log("DADADSDA");
                        break;
                    }
                }
                default:


            }

            RequestDispatcher dispatcher =
                    request.getRequestDispatcher(CVS_INDEX_URI);
            dispatcher.forward(request, response);



    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            String action = request.getParameter("action");
            String actionUri;
            switch (action) {
                case "add": {

                    request.setAttribute("action", "add");
                    actionUri = CVS_ADD_URI;
                    break;
                }

                case "perfilEmpleado": {

                    codEmp = Integer.parseInt(request.getParameter("codEmp"));
                    Employee employee = service.getEmployeeById(codEmp);
                    request.setAttribute("employee", employee);
                    request.setAttribute("action", "edit");


                    actionUri = perfilEmpleado_uri;
                    break;
                }

                case "PerfilAdm": {

                    codEmp = Integer.parseInt(request.getParameter("codEmp"));
                    Employee employee = service.getEmployeeById(codEmp);
                    request.setAttribute("employee", employee);
                    request.setAttribute("action", "edit");


                    actionUri = perfilAdmin_uri;
                    break;
                }

                default:
                    actionUri = CVS_INDEX_URI;
            }
            RequestDispatcher dispatcher = request.getRequestDispatcher(actionUri);
            dispatcher.forward(request, response);
        }

    }