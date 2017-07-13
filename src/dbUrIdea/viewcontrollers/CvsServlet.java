package dbUrIdea.viewcontrollers;

import dbUrIdea.models.Cv;
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
 * Created by Yoshinon on 13/07/2017.
 */
@WebServlet(name = "CvsServlet",urlPatterns = "/cV")
public class CvsServlet extends HttpServlet {
    // Service Layer access object
    HRService service = new HRService();
    // Action View Paths
    public static String CVS_EDIT_URI = "/editCv.jsp";
    public static String CVS_ADD_URI = "/newCv.jsp";
    public static String CVS_INDEX_URI = "/listCv.jsp";


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");
        switch(action) {
            case "update": {

                Cv cv= new Cv();
                cv.setId(Integer.parseInt(request.getParameter("id")));
                cv.setCvType(Integer.parseInt(request.getParameter("cv_type")));
                cv.setDescription(request.getParameter("description"));
                String message = service.updateCv(cv) ?
                        "Update success" :
                        "Error while updating";
                log(message);
                break;
            }

            case "create": {
                Cv cv= new Cv();
                Employee employee=new Employee();
                cv.setEmployee(employee.setId(Integer.parseInt(
                        request.getParameter("id_employee"))));

                cv.setCvType(Integer.parseInt(request.getParameter("cv_type")));
                cv.setDescription(request.getParameter("description"));
                String message = service.createCv(cv) ?
                        "Create success" :
                        "Error while creating";
                log(message);
                break;
            }


        }

        RequestDispatcher dispatcher =
                request.getRequestDispatcher(CVS_INDEX_URI);
        dispatcher.forward(request, response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        String actionUri;
        switch(action) {
            case "add": {

                request.setAttribute("action", "add");
                actionUri = CVS_ADD_URI;
                break;
            }
            case "edit": {
                Cv cv = service.getCvById
                        (Integer.parseInt(request.getParameter("id")));
                request.setAttribute("cv", cv);
                request.setAttribute("action", "edit");
                actionUri = CVS_EDIT_URI;
                break;
            }
            default:
                actionUri = CVS_INDEX_URI;
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(actionUri);
        dispatcher.forward(request, response);
    }
}