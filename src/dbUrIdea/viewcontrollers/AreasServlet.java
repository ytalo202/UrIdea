package dbUrIdea.viewcontrollers;

import dbUrIdea.models.Area;
import dbUrIdea.models.Company;
import dbUrIdea.services.HRService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Yoshinon on 21/07/2017.
 */
@WebServlet(name = "AreasServlet")
public class AreasServlet extends HttpServlet {
    // Service Layer access object
    HRService service = new HRService();
    // Action View Paths
    public static String AREAS_EDIT_URI = "/editEmail.jsp";
    public static String AREAS_ADD_URI = "/newEmail.jsp";
    public static String AREAS_INDEX_URI = "/listEmail.jsp";


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");
        switch(action) {
            case "update": {

                Area area= new Area();
                //EmailAddress emailAddress = service.getEmailAddressById(Integer.parseInt(request.getParameter("id")));

                area.setNameArea(request.getParameter("name_area"));
                String message = service.updateArea(area) ?
                        "Update success" :
                        "Error while updating";
                log(message);
                break;
            }

            case "create": {
                Area area= new Area();
                Company company = new Company();
                area.setCompany(company.setId(Integer.parseInt(
                        request.getParameter("id_companies"))));
                area.setNameArea(request.getParameter("name_area"));
                String message = service.createArea(area) ?
                        "Create success" :
                        "Error while creating";
                log(message);
                break;
            }

        }

        RequestDispatcher dispatcher =
                request.getRequestDispatcher(AREAS_INDEX_URI);
        dispatcher.forward(request, response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        String actionUri;
        switch(action) {
            case "add": {

                request.setAttribute("action", "add");
                actionUri = AREAS_ADD_URI;
                break;
            }
            case "edit": {
                Area area = service.getAreaById(
                        Integer.parseInt(request.getParameter("idArea")));
                request.setAttribute("area", area);
                request.setAttribute("action", "edit");
                actionUri = AREAS_EDIT_URI;
                break;
            }
            default:
                actionUri = AREAS_INDEX_URI;
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(actionUri);
        dispatcher.forward(request, response);
    }
}