package dbUrIdea.viewcontrollers;

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
 * Created by Yoshinon on 7/07/2017.
 */
@WebServlet(name = "EmailAddreessServlet",urlPatterns = "/email")
public class EmailAddreessServlet extends HttpServlet {
    // Service Layer access object
    HRService service = new HRService();
    // Action View Paths
    public static String EMAILS_EDIT_URI = "/editEmail.jsp";
    public static String EMAILS_ADD_URI = "/newEmail.jsp";
    public static String EMAILS_INDEX_URI = "/listEmail.jsp";


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");
        switch(action) {
            case "update": {
                EmailAddress emailAddress = service.getEmailAddressById(request.getParameter("id"));
                emailAddress.setEmailData(request.getParameter("emailData"));
                String message = service.updateEmail(emailAddress) ?
                        "Update success" :
                        "Error while updating";
                log(message);
                break;
            }

            case "create": {
                EmailAddress emailAddress= new EmailAddress();
                emailAddress.setEmailData(request.getParameter("emailData"));
                String message = service.createEmail(emailAddress) ?
                        "Create success" :
                        "Error while creating";
                log(message);
                break;
            }
            case "delete": {

                EmailAddress emailAddress = service.getEmailAddressById(request.getParameter("id"));
                String message = service.deleteEmailById(emailAddress) ?
                        "Delete success" :
                        "Error while deleting";
                log(message);
                break;
            }

        }

        RequestDispatcher dispatcher =
                request.getRequestDispatcher(EMAILS_INDEX_URI);
        dispatcher.forward(request, response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        String actionUri;
        switch(action) {
            case "add": {

                request.setAttribute("action", "add");
                actionUri = EMAILS_ADD_URI;
                break;
            }
            case "edit": {
                EmailAddress emailAddress = service.getEmailAddressById
                        (request.getParameter("id"));
                request.setAttribute("emailAddress", emailAddress);
                request.setAttribute("action", "edit");
                actionUri = EMAILS_EDIT_URI;
                break;
            }
            default:
                actionUri = EMAILS_INDEX_URI;
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(actionUri);
        dispatcher.forward(request, response);
    }
}
