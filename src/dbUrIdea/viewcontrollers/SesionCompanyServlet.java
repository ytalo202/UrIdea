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
 * Created by Yoshinon on 14/07/2017.
 */
@WebServlet(name = "SesionCompanyServlet",urlPatterns = "/v")

public class SesionCompanyServlet extends HttpServlet {
    // Service Layer access object
    HRService service = new HRService();
    // Action View Paths
    public static String L_EDIT_URI = "/editL.jsp";
    public static String L_INDEX_URI = "/login.jsp";
    public static String COMPS_EDIT_URI = "/editCompany.jsp";
    public static String COMPS_ADD_URI = "/newCompany.jsp";
    public static String COMPS_INDEX_URI = "/listCompany.jsp";
    public static String Menu_INDEX_URI = "/Ly.jsp";
    public static String MU_URI = "/mu.jsp";
    public static String out_URI = "/index.jsp";

    public static String root_URI = "/root.jsp";

    public static String Email_URI = "/_EmailsForm.jsp";
    public static String Adm_URI = "/listAdministor.jsp";

    public static String Empl_URI = "/listEmpleado.jsp";

    public static String Emailnew_URI = "/newEmpEmail.jsp";

    public static String EmpleadoAdm_URI = "/newEmpAdm.jsp";
    //public static String CompEmail_URI = "/CompEmail.jsp";

    public static String createComp_URI = "/CreateComp.jsp";
    public static String priComp_URI = "/priMesaje.jsp";
    public static String pruebalista = "listPrueba.jsp";

    public static String ChangeAdm_URI = "/changeAdmin.jsp";

    public static String ChangeEmpl_URI = "/changeEmployee.jsp";




    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {








        String action = request.getParameter("action");
        switch(action) {



            case "update": {
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

            case "updatechangeAdmin": {

                Company company = new Company();
                Employee employee= new Employee();
                employee.setId(Integer.parseInt(request.getParameter("idEmployee")));
                employee.setEmployeeType(1);

                String message = service.changeEmployee(employee) ?
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

            case "updatechangeEmployee": {

                Company company = new Company();
                Employee employee= new Employee();
                employee.setId(Integer.parseInt(request.getParameter("idEmployee")));
                employee.setEmployeeType(2);

                String message = service.changeEmployee(employee) ?
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


            case "createComp":{

                EmailAddress emailAddress =new EmailAddress();
                Company company =new Company();
                //company.setId(Integer.parseInt(request.getParameter("id")));
                company.setPassword(request.getParameter("password"));
                company.setNameCompany(request.getParameter("nameCompany"));
                company.setCompanyState
                        (1);


                ///-------------------Probando
                company.setEmailAdress(emailAddress.setId(Integer.parseInt(request.getParameter("CorreNum"))));
                String message = service.addComp2(company) ?
                        "Create success" :
                        "Error while creating";
                log(message);

                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(priComp_URI);
                dispatcher.forward(request, response);
                break;


            }

            case "createCompEmail":{
                EmailAddress emailAddress1= new EmailAddress();
                emailAddress1.setEmailData(request.getParameter("emailData"));
                int Corre=service.getEmailCount()+1;
                String message = service.createEmail(emailAddress1) ?
                        "Create success" :
                        "Error while creating";
                log(message);
                request.setAttribute("emailNum", Corre);
                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(createComp_URI);
                dispatcher.forward(request, response);
                break;
            }



            case "prSesion":{
                Company company = service.getCompanyById(
                        service.getCompanyCount());

                request.setAttribute("company", company);
                request.setAttribute("action", "menu");

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

            case "servis": {

                int  idC = Integer.parseInt(request.getParameter("idCompany"));
                Company company = service.getCompanyById(idC);

                request.setAttribute("company", company);
                request.setAttribute("action", "servis");
                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(Menu_INDEX_URI);
                dispatcher.forward(request, response);
                break;
            }

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

            case "createEmail": {
                EmailAddress emailAddress1= new EmailAddress();
                emailAddress1.setEmailData(request.getParameter("emailData"));

                int Corre=service.getEmailCount()+1;

                String message = service.createEmail(emailAddress1) ?
                        "Create success" :
                        "Error while creating";

                Company company = service.getCompanyById(Integer.parseInt(
                        request.getParameter("idCompany")));
                request.setAttribute("company", company);

                request.setAttribute("action", "edit");
                //
                request.setAttribute("emailNum", Corre);

                log(message);
                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(EmpleadoAdm_URI);
                dispatcher.forward(request, response);
                break;
            }



          case "createEmplAdmin": {

                Employee employee =new Employee();
                EmailAddress emailAddress =new EmailAddress();
              Area area = new Area();
                Company company1 =new Company();

                employee.setEmailAddress(emailAddress.setId(Integer.parseInt
                        (request.getParameter("CorreNum"))));


                employee.setCompany(company1.setId(Integer.parseInt(
                        request.getParameter("idCompany"))));

                employee.setArea(area.setId(Integer.parseInt(request.getParameter("idArea"))));
                employee.setEmployeeType(1);



              employee.setPassword(request.getParameter("password"));
              employee.setName(request.getParameter("employee_name"));
              employee.setDni(Integer.parseInt(request.getParameter("dni")));
              String message = service.createEmployee2(employee) ?
                      "Create success" :
                      "Error while creating";
              log(message);


              Company company = service.getCompanyById(Integer.parseInt(
                      request.getParameter("idCompany")));
              request.setAttribute("company", company);
              request.setAttribute("action", "edit");

              RequestDispatcher dispatcher =
                      request.getRequestDispatcher(Adm_URI);
              dispatcher.forward(request, response);
                break;


            }

        }



        RequestDispatcher dispatcher =
                request.getRequestDispatcher(L_INDEX_URI);
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
                Company company
                        = service.getCompanyById(Integer.parseInt(
                        request.getParameter("idCompany")));
                request.setAttribute("company", company);
                request.setAttribute("action", "edit");
                actionUri =COMPS_EDIT_URI;
                break;
            }
            case "out": {

                actionUri = out_URI;
                break;
            }

            case "editCorre": {
                Company company = service.getCompanyById(Integer.parseInt(
                        request.getParameter("idCompany")));
                request.setAttribute("company", company);
                request.setAttribute("action", "editCorre");
                actionUri = Email_URI;
                break;
            }


            case "seleccion": {


                Company company = service.getCompanyById(Integer.parseInt(
                        request.getParameter("idCompany")));
                request.setAttribute("company", company);
                request.setAttribute("action", "seleccion");
                actionUri = Adm_URI;
                break;
            }

            case "seleccionEmpleados": {


                Company company = service.getCompanyById(Integer.parseInt(
                        request.getParameter("idCompany")));
                request.setAttribute("company", company);
                request.setAttribute("action", "seleccion");
                actionUri = Empl_URI;
                break;
            }

            case "regresar": {
                Company company = service.getCompanyById(Integer.parseInt(request.getParameter("idCompany")));
                request.setAttribute("company", company);
                request.setAttribute("action", "edit");
                actionUri = root_URI;
                break;


            }

            case "creEmail": {
                Company company = service.getCompanyById(Integer.parseInt(request.getParameter("idCompany")));
                request.setAttribute("company", company);
                request.setAttribute("action", "edit");
                actionUri = Emailnew_URI;
                break;
            }

            case "lista": {
                Company company = service.getCompanyById
                        (Integer.parseInt(request.getParameter("idCompany")));


                request.setAttribute("company", company);
                request.setAttribute("action", "edit");
                actionUri = pruebalista;
                break;
            }

            case "editTypeEmployee": {
                Employee employee = service.getEmployeeById(Integer.parseInt(request.getParameter("idEmployee")));
                request.setAttribute("employee", employee);
                request.setAttribute("action", "editTypeEmployee");
                actionUri =ChangeEmpl_URI;
                break;
            }


            case "editTypeAdmin": {
                Employee employee = service.getEmployeeById(Integer.parseInt(request.getParameter("idEmployee")));
                request.setAttribute("employee", employee);
                request.setAttribute("action", "editTypeAdmin");
                actionUri = ChangeAdm_URI;
                break;
            }





            default:
                actionUri = COMPS_INDEX_URI;
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(actionUri);
        dispatcher.forward(request, response);
    }
}