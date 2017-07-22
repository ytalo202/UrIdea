package dbUrIdea.viewcontrollers;

import dbUrIdea.models.Area;
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
import java.sql.Date;

/**
 * Created by Yoshinon on 10/07/2017.
 */
@WebServlet(name = "EmployeesServlet",urlPatterns = "/emp")
public class EmployeesServlet  extends HttpServlet {

    HRService service = new HRService();
    // Action View Paths
    public static String EMP_EDIT_URI = "/editEmployee.jsp";
    public static String EMP_ADD_URI = "/newEmployee.jsp";
    public static String EMP_INDEX_URI = "/listEmployee.jsp";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,  IOException {

        String action = request.getParameter("action");
        switch(action) {
            case "update": {
                //Company company = service.getCompanyById(request.getParameter("id"));

                Employee employee= new Employee();
                employee.setId(Integer.parseInt(request.getParameter("id")));
                employee.setEmployeeType(Integer.parseInt(request.getParameter("employee_type")));
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
                String message = service.updateEmployee(employee) ?
                        "Update success" :
                        "Error while updating";
                log(message);
                break;
            }
            case "create": {


                //Company company= service.getComanyByEmailId(Integer.parseInt(request.getParameter("EmailId")));
                Employee employee =new Employee();
                EmailAddress emailAddress =new EmailAddress();
                Company company =new Company();
                Area area = new Area();

                employee.setCompany(company.setId(Integer.parseInt(
                        request.getParameter("id_company"))));
                employee.setEmailAddress(emailAddress.setId
                        (Integer.parseInt(request.getParameter("id_email_address"))));

                //--area
                employee.setArea(area.setId(Integer.parseInt(request.getParameter("idArea"))));

               // employee.setId(Integer.parseInt(request.getParameter("id")));
                employee.setEmployeeType(Integer.parseInt(request.getParameter("employee_type")));
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


            }

        }

        RequestDispatcher dispatcher =
                request.getRequestDispatcher(EMP_INDEX_URI);
        dispatcher.forward(request, response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        String actionUri;
        switch(action) {
            case "add": {
                actionUri = EMP_ADD_URI;
                request.setAttribute("action", "add");
                break;
            }
            case "edit": {
                Employee employee = service.getEmployeeById(Integer.parseInt(request.getParameter("id")));
                request.setAttribute("employee", employee);
                request.setAttribute("action", "edit");
                actionUri = EMP_EDIT_URI;
                break;
            }
            default:
                actionUri = EMP_INDEX_URI;
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(actionUri);
        dispatcher.forward(request, response);
    }
}