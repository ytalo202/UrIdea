package dbUrIdea.viewcontrollers;

import dbUrIdea.models.EmailAddress;
import dbUrIdea.models.PaymentsType;
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
@WebServlet(name = "PaymentsTypesServlet",urlPatterns = "/pay")
public class PaymentsTypesServlet  extends HttpServlet {
    // Service Layer access object
    HRService service = new HRService();
    // Action View Paths
    public static String PAYMENTSTYPE_EDIT_URI = "/editPaymentsType.jsp";
    public static String PAYMENTSTYPE_ADD_URI = "/newPaymentsType.jsp";
    public static String PAYMENTSTYPE_INDEX_URI = "/listPaymentsType.jsp";


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");
        switch(action) {
            case "update": {
                PaymentsType paymentsType = service.getPaymentsTypeById(
                        Integer.parseInt(request.getParameter("id")));

                paymentsType.setName(request.getParameter("name"));
                String message = service.updatePaymentsType(paymentsType) ?
                        "Update success" :
                        "Error while updating";
                log(message);
            }

        }
        RequestDispatcher dispatcher =
                request.getRequestDispatcher(PAYMENTSTYPE_INDEX_URI);
        dispatcher.forward(request, response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        String actionUri;
        switch(action) {
            case "add": {
                actionUri = PAYMENTSTYPE_ADD_URI;
                request.setAttribute("action", "add");
                break;
            }
            case "edit": {
                PaymentsType paymentsType = service.getPaymentsTypeById(Integer.parseInt(
                        request.getParameter("id")));
                request.setAttribute("paymentsType", paymentsType);
                request.setAttribute("action", "edit");
                actionUri = PAYMENTSTYPE_EDIT_URI;
                break;
            }
            default:
                actionUri = PAYMENTSTYPE_INDEX_URI;
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(actionUri);
        dispatcher.forward(request, response);
    }
}
