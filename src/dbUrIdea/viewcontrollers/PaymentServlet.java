package dbUrIdea.viewcontrollers;

import dbUrIdea.models.Company;
import dbUrIdea.models.Payment;
import dbUrIdea.models.PaymentsType;
import dbUrIdea.services.HRService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

/**
 * Created by Usuario on 07/07/2017.
 */
@WebServlet(name = "PaymentServlet",urlPatterns = "/paym")
public class PaymentServlet extends HttpServlet {
    HRService service = new HRService();
    // Action View Paths
    public static String PAY_EDIT_URI = "/editPayment.jsp";
    public static String PAY_ADD_URI = "/newPayment.jsp";
    public static String PAY_INDEX_URI = "/listPayment.jsp";



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch(action) {
            case "update": {
                //Company company = service.getCompanyById(request.getParameter("id"));
                Company company = new Company();
                PaymentsType paymentsType = new PaymentsType();
                Payment payment= new Payment();

                payment.setId(Integer.parseInt(request.getParameter("id")));
                //payment.setCompany(company.setId(Integer.parseInt(request.getParameter("id_companies"))));
                //payment.setPaymentsType(paymentsType.setId(Integer.parseInt(request.getParameter("id_payment_type"))));
                payment.setCardNumber(request.getParameter("card_number"));
                payment.setName(request.getParameter("name"));
                payment.setLastName(request.getParameter("last_name"));
                payment.setFirstAddress(request.getParameter("first_address"));
                payment.setSecondAddress(request.getParameter("second_address"));
                payment.setPaymentDate(Date.valueOf(request.getParameter("payment_date")));
                payment.setLocation(request.getParameter("location"));
                payment.setCountry(request.getParameter("country"));
                payment.setCodeZip(request.getParameter("code_zip"));
                payment.setCellPhoneNumber(request.getParameter("cell_phone_number"));
                payment.setAmount(Float.valueOf(request.getParameter("payment_amount")));
                payment.setExpiryMonth(Integer.parseInt(request.getParameter("expiry_month")));
                payment.setExpiryDay(Integer.parseInt(request.getParameter("expiry_day")));
                payment.setSecurityCode(Integer.parseInt(request.getParameter("security_code")));

                String message = service.updatePayment(payment) ?
                        "Update success" :
                        "Error while updating";
                log(message);
                break;
            }
            /*case "create": {


                //Company company= service.getComanyByEmailId(Integer.parseInt(request.getParameter("EmailId")));
                EmailAddress emailAddress =new EmailAddress();
                Company company =new Company();
                //company.setId(Integer.parseInt(request.getParameter("id")));
                company.setPassword(request.getParameter("password"));
                company.setNameCompany(request.getParameter("nameCompany"));
                company.setDescription(request.getParameter("description"));
                company.setCompanyState
                        (Integer.parseInt(request.getParameter("companyState")));


                ///-------------------Probando
                company.setEmailAdress(emailAddress.setId(Integer.parseInt(request.getParameter("EmailId"))));

                //
                company.setAddress(request.getParameter("address"));
                company.setPhoneNumber(Integer.parseInt(request.getParameter("phoneNumber")));


                String message = service.createComp(company) ?
                        "Create success" :
                        "Error while creating";
                log(message);
                break;


            }*/


        }
        RequestDispatcher dispatcher =
                request.getRequestDispatcher(PAY_INDEX_URI);
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        String actionUri;
        switch(action) {
            case "add": {
                actionUri = PAY_ADD_URI;
                request.setAttribute("action", "add");
                break;
            }
            case "edit": {
                Payment payment = service.getPaymentById(Integer.parseInt(
                        request.getParameter("id")));
                request.setAttribute("payment", payment);
                request.setAttribute("action", "edit");
                actionUri = PAY_EDIT_URI;
                break;
            }
            default:
                actionUri = PAY_INDEX_URI;
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(actionUri);
        dispatcher.forward(request, response);
    }
}


