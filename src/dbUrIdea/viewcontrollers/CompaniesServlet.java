package dbUrIdea.viewcontrollers;

import dbUrIdea.models.Company;
import dbUrIdea.models.EmailAddress;
import dbUrIdea.services.HRService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Yoshinon on 8/07/2017.
 */
@WebServlet(name = "CompaniesServlet",urlPatterns = "/comp")
public class CompaniesServlet extends HttpServlet {

    HRService service = new HRService();
    // Action View Paths
    public static String COMPS_EDIT_URI = "/editCompany.jsp";
    public static String COMPS_ADD_URI = "/newCompany.jsp";
    public static String COMPS_INDEX_URI = "/listCompany.jsp";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,  IOException {

        String action = request.getParameter("action");
        switch(action) {
            case "update": {
                //Company company = service.getCompanyById(request.getParameter("id"));

                Company company= new Company();
                company.setId(Integer.parseInt(request.getParameter("id")));
                company.setPassword(request.getParameter("password"));
                company.setNameCompany(request.getParameter("nameCompany"));
                company.setDescription(request.getParameter("description"));
                company.setCompanyState(Integer.parseInt
                        (request.getParameter("companyState")));
                company.setAddress(request.getParameter("address"));
                company.setPhoneNumber(Integer.parseInt
                        (request.getParameter("phoneNumber")));
                String message = service.updateCompany(company) ?
                        "Update success" :
                        "Error while updating";
                log(message);
                break;
            }
            case "create": {
               EmailAddress emailAddress =new EmailAddress();
               Company company =new Company();
                company.setPassword(request.getParameter("password"));
                company.setNameCompany(request.getParameter("nameCompany"));
                company.setDescription(request.getParameter("description"));
                company.setCompanyState(Integer.parseInt(request.getParameter("companyState")));
                company.setEmailAdress(emailAddress.setId(Integer.parseInt(request.getParameter("EmailId"))));
                company.setAddress(request.getParameter("address"));
                company.setPhoneNumber(Integer.parseInt(request.getParameter("phoneNumber")));
                String message = service.createComp(company) ?
                        "Create success" :
                        "Error while creating";
                log(message);
                break;


            }

        }

        RequestDispatcher dispatcher =
                request.getRequestDispatcher(COMPS_INDEX_URI);
        dispatcher.forward(request, response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        String actionUri;
        switch(action) {
            case "add": {
                actionUri = COMPS_ADD_URI;
                request.setAttribute("action", "add");
                break;
            }
            case "edit": {
                Company company = service.getCompanyById(Integer.parseInt(
                        request.getParameter("id")));
                request.setAttribute("company", company);
                request.setAttribute("action", "edit");
                actionUri = COMPS_EDIT_URI;
                break;
            }
            default:
                actionUri = COMPS_INDEX_URI;
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(actionUri);
        dispatcher.forward(request, response);
    }
}