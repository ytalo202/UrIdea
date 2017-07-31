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
    public static String VaMensajeEntra_URI = "/VaMensajeEntrada.jsp";



    public static String EDItCompany_URI = "/editCompany.jsp";




    public static String Menu_Root_URI = "/VaRoot.jsp";


    public static String outCompany_URI = "/index.jsp";

    public static String MenuRoot_URI = "/menuRoot.jsp";

    public static String UpdateCompanyEmail_URI = "/_EmailsForm.jsp";

    public static String Adm_URI = "/menuRoot.jsp";

    public static String ListEmpleados_URI = "/listEmpleado.jsp";

    public static String NuevoEmailEmp_URI = "/newEmpEmail.jsp";

    public static String NuevoEmpleadoAdm_URI = "/newEmpAdm.jsp";


    public static String createComp_URI = "/CreateComp.jsp";
    public static String primeraSesionComp_URI = "/priMesaje.jsp";

    public static String listaAdministradores = "listAdministrators.jsp";

    public static String ChangeAdm_URI = "/changeAdmin.jsp";

    public static String ChangeEmpl_URI = "/changeEmployee.jsp";

    public static String perfilEmployee_uri = "/PerfilPrueba.jsp";

    public static String perfilHistorialEvaluEmployee_uri = "/PerfilHistorialEvaluation.jsp";

    public static String listaAreaEmployee_uri = "/listaXarea.jsp";


    int codCom;
    int EmpEvaluado;
    int idArea;
    String email;




    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {








        String action = request.getParameter("action");
        switch(action) {



            case "update": {
                //Company company = service.getCompanyById(request.getParameter("id"));

                Company company= new Company();
                company.setId(codCom
                        //Integer.parseInt(request.getParameter("idCompany"))
                );
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

                company = service.getCompanyById(
                        codCom
                        //Integer.parseInt(request.getParameter("idCompany"))
                );
                request.setAttribute("company", company);
                request.setAttribute("action", "edit");


                log(message);
                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(MenuRoot_URI);
                dispatcher.forward(request, response);
                break;


            }

            case "listTypeArea": {
                idArea=Integer.parseInt(request.getParameter("idArea"));
                if (idArea==6){
                    Company company = service.getCompanyById(codCom);

                    request.setAttribute("company", company);
                    request.setAttribute("action", "edit");

                    RequestDispatcher dispatcher =
                            request.getRequestDispatcher(ListEmpleados_URI);
                    dispatcher.forward(request, response);
                    break;
                }
                else {
                    Company company = service.getCompanyById(codCom);

                    request.setAttribute("company", company);
                    request.setAttribute("action", "edit");
                    request.setAttribute("idArea", idArea);

                    RequestDispatcher dispatcher =
                            request.getRequestDispatcher(listaAreaEmployee_uri);
                    dispatcher.forward(request, response);
                    break;
                }
            }

            case "updatechangeAdmin": {

                Company company = new Company();
                Employee employee= new Employee();
                employee.setId(Integer.parseInt(request.getParameter("idEmployee")));
                employee.setEmployeeType(1);

                String message = service.changeEmployee(employee) ?
                        "Update success" :
                        "Error while updating";
                company = service.getCompanyById(
                        codCom
                        //Integer.parseInt(request.getParameter("idCompany"))
                );
                request.setAttribute("company", company);
                request.setAttribute("action", "edit");


                log(message);
                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(MenuRoot_URI);
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
                company = service.getCompanyById(
                        codCom
                        //Integer.parseInt(request.getParameter("idCompany"))
                );
                request.setAttribute("company", company);
                request.setAttribute("action", "edit");


                log(message);
                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(MenuRoot_URI);
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
                company.setEmailAdress(service.findIdByEmail(email));
                String message = service.addComp2(company) ?
                        "Create success" :
                        "Error while creating";
                log(message);

                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(primeraSesionComp_URI);
                dispatcher.forward(request, response);
                break;


            }

            case "createCompEmail":{
                EmailAddress emailAddress1= new EmailAddress();
                email=request.getParameter("emailData");
                emailAddress1.setEmailData(email);
                String message = service.createEmail(emailAddress1) ?
                        "Create success" :
                        "Error while creating";
                log(message);
                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(createComp_URI);
                dispatcher.forward(request, response);
                break;
            }



            case "prSesion":{
                Company company = service.getCompanyById(
                        service.getCompanyCount());
                codCom=service.getCompanyCount();


                request.setAttribute("company", company);
                request.setAttribute("action", "menu");

                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(MenuRoot_URI);
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
                        request.getRequestDispatcher(VaMensajeEntra_URI);
                dispatcher.forward(request, response);
                break;
            }

            case "edit": {

               int  idC = Integer.parseInt(request.getParameter("idCompany"));

                Company company = service.getCompanyById(codCom
                        //idC
                );

                request.setAttribute("company", company);
                request.setAttribute("action", "edit");
                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(EDItCompany_URI);
                dispatcher.forward(request, response);
                break;
            }
////---------------------------------------------
            case "servis": {

                int  idC = Integer.parseInt(request.getParameter("idCompany"));
                codCom = idC;

                Company company = service.getCompanyById(idC);

                request.setAttribute("company", company);
                request.setAttribute("action", "servis");
                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(Menu_Root_URI);
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

                Company company = service.getCompanyById(
                        codCom
                        //Integer.parseInt(request.getParameter("idCompany"))
                );
                request.setAttribute("company", company);
                request.setAttribute("action", "edit");


                log(message);
                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(MenuRoot_URI);
                dispatcher.forward(request, response);
                break;

            }

            case "createEmail": {
                EmailAddress emailAddress1= new EmailAddress();
                email=request.getParameter("emailData");
                emailAddress1.setEmailData(email);





                String message = service.createEmail(emailAddress1) ?
                        "Create success" :
                        "Error while creating";

                Company company = service.getCompanyById(
                        codCom
                        //Integer.parseInt(request.getParameter("idCompany"))
                );
                request.setAttribute("company", company);

                request.setAttribute("action", "edit");
                //


                log(message);
                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(NuevoEmpleadoAdm_URI);
                dispatcher.forward(request, response);
                break;
            }



          case "createEmplAdmin": {

                Employee employee =new Employee();
                EmailAddress emailAddress =new EmailAddress();
              Area area = new Area();
                Company company1 =new Company();



              employee.setEmailAddress(service.findIdByEmail(email));


                employee.setCompany(company1.setId(
                        codCom
                        //Integer.parseInt(request.getParameter("idCompany"))
                        )
                );

                employee.setArea(area.setId(Integer.parseInt(request.getParameter("idArea"))));
              employee.setBirthdate(Date.valueOf(request.getParameter("cumple")));
                employee.setEmployeeType(1);



              employee.setPassword(request.getParameter("password"));
              employee.setName(request.getParameter("employee_name"));
              employee.setDni(Integer.parseInt(request.getParameter("dni")));
              String message = service.createEmployee2(employee) ?
                      "Create success" :
                      "Error while creating";
              log(message);


              Company company = service.getCompanyById(
                      codCom
                      //Integer.parseInt(request.getParameter("idCompany"))
              );
              request.setAttribute("company", company);
              request.setAttribute("action", "edit");

              RequestDispatcher dispatcher =
                      request.getRequestDispatcher(Adm_URI);
              dispatcher.forward(request, response);
                break;


            }

        }



        RequestDispatcher dispatcher =
                request.getRequestDispatcher(MenuRoot_URI);
        dispatcher.forward(request, response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String action = request.getParameter("action");
        String actionUri;
        switch(action) {

            case "edit": {
                Company company
                        = service.getCompanyById(
                        codCom
                                //Integer.parseInt(request.getParameter("idCompany"))
                );
                request.setAttribute("company", company);
                request.setAttribute("action", "edit");
                actionUri = EDItCompany_URI;
                break;
            }
            case "out": {

                actionUri = outCompany_URI;
                codCom=0;
                break;
            }

            case "editCorre": {
                Company company = service.getCompanyById(
                        codCom
                        //Integer.parseInt(request.getParameter("idCompany"))
                );
                request.setAttribute("company", company);
                request.setAttribute("action", "editCorre");
                actionUri = UpdateCompanyEmail_URI;
                break;
            }


            case "seleccion": {


                Company company = service.getCompanyById(
                        codCom
                        //Integer.parseInt(request.getParameter("idCompany"))

                );
                request.setAttribute("company", company);
                request.setAttribute("action", "seleccion");
                actionUri = Adm_URI;
                break;
            }

            case "seleccionEmpleados": {


                Company company = service.getCompanyById(
                        codCom
                        //Integer.parseInt(request.getParameter("idCompany"))

                );
                request.setAttribute("company", company);
                request.setAttribute("action", "seleccion");
                actionUri = ListEmpleados_URI;
                break;
            }

            case "regresar": {
                Company company = service.getCompanyById(
                        codCom
                        //Integer.parseInt(request.getParameter("idCompany"))
                );
                request.setAttribute("company", company);
                request.setAttribute("action", "edit");
                actionUri = MenuRoot_URI;
                break;


            }

            case "creEmail": {
                Company company = service.getCompanyById(
                        codCom
                        //Integer.parseInt(request.getParameter("idCompany"))

                );
                request.setAttribute("company", company);
                request.setAttribute("action", "edit");
                actionUri = NuevoEmailEmp_URI;
                break;
            }

            case "lista": {
                Company company = service.getCompanyById(
                        codCom
                                //Integer.parseInt(request.getParameter("idCompany"))
                );


                request.setAttribute("company", company);
                request.setAttribute("action", "edit");
                actionUri = listaAdministradores;
                break;
            }

            case "editTypeEmployee": {
                Employee employee = service.getEmployeeById(
                        //codCom
                        Integer.parseInt(request.getParameter("idEmployee"))
                );
                request.setAttribute("employee", employee);
                request.setAttribute("action", "editTypeEmployee");
                actionUri =ChangeEmpl_URI;
                break;
            }


            case "editTypeAdmin": {
                Employee employee = service.getEmployeeById(
                        //codCom
                        Integer.parseInt(request.getParameter("idEmployee"))
                        );
                request.setAttribute("employee", employee);
                request.setAttribute("action", "editTypeAdmin");
                actionUri = ChangeAdm_URI;
                break;
            }


            case "Perfil": {
                EmpEvaluado =Integer.parseInt(request.getParameter("idEmployee"));

                Employee employee = service.getEmployeeById(EmpEvaluado);
                request.setAttribute("employee", employee);
                request.setAttribute("action", "Perfil");
                actionUri = perfilEmployee_uri;
                break;
            }

            case "EvaluationHistorial": {
                EmpEvaluado =Integer.parseInt(request.getParameter("idEmployee"));

                Employee employee = service.getEmployeeById(EmpEvaluado);
                request.setAttribute("employee", employee);
                request.setAttribute("action", "Perfil");
                actionUri = perfilHistorialEvaluEmployee_uri;
                break;
            }












            default:
                actionUri = MenuRoot_URI;
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(actionUri);
        dispatcher.forward(request, response);
    }
}