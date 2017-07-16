package dbUrIdea.viewcontrollers;

import dbUrIdea.models.Company;
import dbUrIdea.models.EmailAddress;
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
 * Created by Magnus on 7/15/2017.
 */
@WebServlet(name = "TypeEmployeeServlet",urlPatterns ="/TypeEmployeeValidation")
public class TypeEmployeeServlet extends HttpServlet {
    HRService service = new HRService();

    public static String ADMINISTRATOR_MENU_URI = "/connectAdministrator.jsp";
    public static String EMPLOYEE_MENU_URI = "/connectEmployee.jsp";
    public static String MENU_INDEX_URI = "/login.jsp";


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        switch(action) {

           /* case "update": {
                //Company company = service.getCompanyById(request.getParameter("id"));

                Company company= new Company();
                company.setId(Integer.parseInt(request.getParameter("idCompany")));
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

                company = service.getCompanyById(Integer.parseInt(
                        request.getParameter("idCompany")));
                request.setAttribute("company", company);
                request.setAttribute("action", "edit");


                log(message);
                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(root_URI);
                dispatcher.forward(request, response);
                break;


            }


            case "menu": {


                Company company = service.getIdByCompany(
                        request.getParameter("txtusuario"),
                        request.getParameter("txtclave"));

                request.setAttribute("company", company);
                request.setAttribute("action", "menu");

                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(L_EDIT_URI);
                dispatcher.forward(request, response);
                break;
            }

            case "edit": {

                int  idC = Integer.parseInt(request.getParameter("idCompany"));
                Company company = service.getCompanyById(idC);

                request.setAttribute("company", company);
                request.setAttribute("action", "edit");
                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(COMPS_EDIT_URI);
                dispatcher.forward(request, response);
                break;
            }
*/
            case "select": {
                int employeeType = Integer.parseInt(request.getParameter("EmployeeType"));
                int  idEmployee = Integer.parseInt(request.getParameter("idEmployee"));
                Employee employee = service.getEmployeeById(idEmployee);

                request.setAttribute("employee", employee);
                request.setAttribute("action", "select");
                if (employeeType==1){
                    RequestDispatcher dispatcher =
                        request.getRequestDispatcher(ADMINISTRATOR_MENU_URI);
                    dispatcher.forward(request, response);
                break;}
                else{
                    RequestDispatcher dispatcher =
                            request.getRequestDispatcher(EMPLOYEE_MENU_URI);
                    dispatcher.forward(request, response);
                    break;

                }
            }


/*
            case "mostrar": {

                String c = "Holaaaaa bakaa ";
                int  idC = Integer.parseInt(request.getParameter("idCompany"));
                int idCorreo =Integer.parseInt(request.getParameter("idEmail"));

                request.setAttribute("company", c);

                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(MU_URI);
                dispatcher.forward(request, response);
                break;
            }


            case "updateEmail": {

                EmailAddress emailAddress= new EmailAddress();
                //EmailAddress emailAddress = service.getEmailAddressById(Integer.parseInt(request.getParameter("id")));

                emailAddress.setId(Integer.parseInt(request.getParameter("idEmail")));
                emailAddress.setEmailData(request.getParameter("emailData"));
                String message = service.updateEmail(emailAddress) ?
                        "Update success" :
                        "Error while updating";

                Company company = service.getCompanyById(Integer.parseInt(
                        request.getParameter("idCompany")));
                request.setAttribute("company", company);
                request.setAttribute("action", "edit");


                log(message);
                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(root_URI);
                dispatcher.forward(request, response);
                break;

            }

          /*  case "createEmpleado": {


                //Company company= service.getComanyByEmailId(Integer.parseInt(request.getParameter("EmailId")));
                Employee employee =new Employee();
                EmailAddress emailAddress =new EmailAddress();
                Company company =new Company();

                employee.setCompany(company.setId(idC));

                employee.setEmailAddress(emailAddress.setId
                        (idCorreo));

                // employee.setId(Integer.parseInt(request.getParameter("id")));
                employee.setEmployeeType(1);
                employee.setPassword(request.getParameter("password"));
                employee.setName(request.getParameter("employee_name"));
                employee.setFirstLastName(request.getParameter("employee_first_last_name"));
                employee.setSecondLastName(request.getParameter("employee_second_last_name"));
                employee.setDni(Integer.parseInt(request.getParameter("dni")));
                employee.setPhoneNumber(Integer.parseInt(request.getParameter("phone_number")));
                employee.setCellPhoneNumber(Integer.parseInt(request.getParameter("cell_phone_number")));
                employee.setAddress(request.getParameter("address"));
                employee.setDepartment(request.getParameter("department"));
                employee.setBirthdate(Date.valueOf(request.getParameter("birthdate")));
                String message = service.createEmployee(employee) ?
                        "Create success" :
                        "Error while creating";
                log(message);
                break;


            }*/

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
