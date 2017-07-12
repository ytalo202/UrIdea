package dbUrIdea.viewcontrollers;

import dbUrIdea.models.Payment;
import dbUrIdea.services.HRService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Usuario on 07/07/2017.
 */
@WebServlet(name = "paymentServlet",urlPatterns = "/payments")
public class paymentServlet extends HttpServlet {
    HRService service = new HRService();
    // Action View Paths
    public static String REGIONS_EDIT_URI = "/editPayment.jsp";
    public static String REGIONS_ADD_URI = "/newPayment.jsp";
    public static String REGIONS_INDEX_URI = "/lisPaymentEdit.jsp";



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch(action) {
            case  "update": {
                Payment payment = service.getPaymentById(Integer.parseInt(
                        request.getParameter("id")));
                payment.setName(request.getParameter("name"));
                String message = service.updatePayment(payment) ?
                        "Update success" :
                        "Error while updating";
                log(message);


            }


        }
        RequestDispatcher dispatcher =
                request.getRequestDispatcher(REGIONS_INDEX_URI);
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        String actionUri;
        switch(action) {
            case "add": {
                actionUri = REGIONS_ADD_URI;
                request.setAttribute("action", "add");
                break;
            }
            case "edit": {
                Payment payment = service.getPaymentById(Integer.parseInt(
                        request.getParameter("id")));
                request.setAttribute("payment", payment);
                request.setAttribute("action", "edit");
                actionUri = REGIONS_EDIT_URI;
                break;
            }
            default:
                actionUri = REGIONS_INDEX_URI;
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(actionUri);
        dispatcher.forward(request, response);
    }
    }

