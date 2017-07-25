package dbUrIdea.viewcontrollers;

import dbUrIdea.models.*;
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
 * Created by Magnus on 7/15/2017.
 */
@WebServlet(name = "TypeEmployeeServlet",urlPatterns ="/TypeEmployeeValidation")
public class TypeEmployeeServlet extends HttpServlet {
    HRService service = new HRService();

    public static String ADMINISTRATOR_MENU_URI = "/connectAdministrator.jsp";
    public static String EMPLOYEE_MENU_URI = "/connectEmployee.jsp";
    public static String MENU_INDEX_URI = "/login.jsp";
    public static String Edit_Admin_URI = "/adminEdit.jsp";
    public static String MenuRoot_URI ="/gg";
    public static String EDItEmployee ="/editEmployee.jsp";
    public static String outEmployee_URI = "/index.jsp";
    public static String PruebaEmployee_URI = "/prueba3.jsp";
    public static String MenuAdmin_URI = "/menuAdministrator.jsp";
    public static String MenuEmp_URI = "/menuEmployee.jsp";

    public static String NuevoEmpleado_URI = "/newEmp2.jsp";

    public static String listaEmpleadosxArea = "/listaEmpAre.jsp";
    public static String  UpdateEmpEmail_URI= "/_EmpEmailUpdate.jsp";
    public static String  evaluar_uri= "/_Evaluar.jsp";
    int idE ;
    int employeeType;
    int EmailId;
    int idCom;
    int idA;

    int EmpEvaluado;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        switch(action) {


            case "select": {
                employeeType = Integer.parseInt(request.getParameter("EmployeeType"));
                idE = Integer.parseInt(request.getParameter("idEmployee"));
                EmailId = Integer.parseInt(request.getParameter("idEmail"));
                idCom = Integer.parseInt(request.getParameter("idCompany"));
                idA = Integer.parseInt(request.getParameter("idArea"));



                if (employeeType==1){




                    Employee employee1 = service.getEmployeeById(idE);

                    request.setAttribute("employee", employee1);
                    request.setAttribute("action", "edit");


                    RequestDispatcher dispatcher =
                        request.getRequestDispatcher(ADMINISTRATOR_MENU_URI);
                    dispatcher.forward(request, response);

                break;

                }
                else{




                    Employee employee1 = service.getEmployeeById(idE);

                    request.setAttribute("employee", employee1);
                    request.setAttribute("action", "edit");



                    RequestDispatcher dispatcher =
                            request.getRequestDispatcher(EMPLOYEE_MENU_URI);
                    dispatcher.forward(request, response);

                    break;

                }
            }


            case "updateEmpleadoData": {
                //Company company = service.getCompanyById(request.getParameter("id"));
                Employee employee= new Employee();
                employee.setId(Integer.parseInt(request.getParameter("id")));

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
                String message = service.updateEmployee2(employee) ?
                        "Update success" :
                        "Error while updating";
                log(message);


                if (employeeType==1){




                    Employee employee1 = service.getEmployeeById(idE);

                    request.setAttribute("employee", employee1);
                    request.setAttribute("action", "edit");


                    RequestDispatcher dispatcher =
                            request.getRequestDispatcher(MenuAdmin_URI );
                    dispatcher.forward(request, response);
                    break;
                }
                else{




                    Employee employee1 = service.getEmployeeById(idE);

                    request.setAttribute("employee", employee1);
                    request.setAttribute("action", "edit");



                    RequestDispatcher dispatcher =
                            request.getRequestDispatcher(MenuEmp_URI);
                    dispatcher.forward(request, response);

                    break;

            }     }

            case "updateEmail": {

                EmailAddress emailAddress= new EmailAddress();
                //EmailAddress emailAddress = service.getEmailAddressById(Integer.parseInt(request.getParameter("id")));

                emailAddress.setId(EmailId);
                emailAddress.setEmailData(request.getParameter("emailData"));
                String message = service.updateEmail(emailAddress) ?
                        "Update success" :
                        "Error while updating";

                if (employeeType==1){




                    Employee employee1 = service.getEmployeeById(idE);

                    request.setAttribute("employee", employee1);
                    request.setAttribute("action", "edit");


                    RequestDispatcher dispatcher =
                            request.getRequestDispatcher(MenuAdmin_URI );
                    dispatcher.forward(request, response);
                    break;
                }
                else{




                    Employee employee1 = service.getEmployeeById(idE);

                    request.setAttribute("employee", employee1);
                    request.setAttribute("action", "edit");



                    RequestDispatcher dispatcher =
                            request.getRequestDispatcher(MenuEmp_URI);
                    dispatcher.forward(request, response);

                    break;

                }     }


            case "createEmail": {
                EmailAddress emailAddress1= new EmailAddress();
                emailAddress1.setEmailData(request.getParameter("emailData"));

                int Corre=service.getEmailCount()+1;

                String message = service.createEmail(emailAddress1) ?
                        "Create success" :
                        "Error while creating";



                        //Integer.parseInt(request.getParameter("idCompany"))



                request.setAttribute("action", "edit");
                //
                request.setAttribute("emailNum", Corre);

                log(message);
                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(NuevoEmpleado_URI);
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


                employee.setCompany(company1.setId(
                        idCom
                        //Integer.parseInt(request.getParameter("idCompany"))
                        )
                );

                employee.setArea(area.setId(idA));
                employee.setBirthdate(Date.valueOf(request.getParameter("cumple")));
                employee.setEmployeeType(2);



                employee.setPassword(request.getParameter("password"));
                employee.setName(request.getParameter("employee_name"));
                employee.setDni(Integer.parseInt(request.getParameter("dni")));
                String message = service.createEmployee2(employee) ?
                        "Create success" :
                        "Error while creating";
                log(message);



                        //Integer.parseInt(request.getParameter("idCompany"))

                Employee employee1 = service.getEmployeeById(idE);

                request.setAttribute("employee", employee1);
                request.setAttribute("action", "edit");

                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(MenuAdmin_URI);
                dispatcher.forward(request, response);
                break;


            }

            case "createEvaluation": {


                //Company company= service.getComanyByEmailId(Integer.parseInt(request.getParameter("EmailId")));

                Company company =new Company();
                Evaluation evaluation = new Evaluation();
                Employee employee =new Employee();
                evaluation.setCompany(company.setId(idCom));
                evaluation.setIdEmployee(employee.setId(idE));
                evaluation.setIdUserEmployee(employee.setId(EmpEvaluado));
                int v1= Integer.parseInt(request.getParameter("commitment"));
                int v2= Integer.parseInt(request.getParameter("communication"));
                int v3= Integer.parseInt(request.getParameter("ethic"));
                int v4= Integer.parseInt(request.getParameter("team_management"));
                int v5= Integer.parseInt(request.getParameter("decision_making"));
                int v6= Integer.parseInt(request.getParameter("strategic_thinking"));
                int v7= Integer.parseInt(request.getParameter("customer_orientation"));
                int v8= Integer.parseInt(request.getParameter("social_responsability"));
                int v9= Integer.parseInt(request.getParameter("time_management"));
                int v10= Integer.parseInt(request.getParameter("use_of_resources"));
                int v11= Integer.parseInt(request.getParameter("cost_orientation"));
                int v12= Integer.parseInt(request.getParameter("knowledge_of_languages"));
                int v13= Integer.parseInt(request.getParameter("digital_skills"));
                double suma =v1+v2+v3+v4+v5+v6+v7+v8+v9+v10+v11+v12+v13;
                evaluation.setGrade(suma);
                evaluation.setCommitment(v1);
                evaluation.setCommunication(v2);
                evaluation.setEthic(v3);
                evaluation.setTeam_management(v4);
                evaluation.setDecision_making(v5);
                evaluation.setStrategic_thinking(v6);
                evaluation.setCustomer_orientation(v7);
                evaluation.setSocial_responsability(v8);
                evaluation.setTime_management(v9);
                evaluation.setUse_of_resources(v10);
                evaluation.setCost_orientation(v11);
                evaluation.setKnowledge_of_languages(v12);
                evaluation.setDigital_skills(v13);
                String message = service.createEvaluation(evaluation) ?
                        "Create success" :
                        "Error while creating";
                log(message);

                Employee employee1 = service.getEmployeeById(idE);

                request.setAttribute("employee", employee1);
                request.setAttribute("action", "edit");


                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(MenuAdmin_URI );
                dispatcher.forward(request, response);
                break;

            }




        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String action = request.getParameter("action");
        String actionUri;
        switch(action) {

            case "editEmployee": {
                Employee employee
                        = service.getEmployeeById(idE);
                request.setAttribute("employee", employee);
                request.setAttribute("action", "editEmployee");
                actionUri =  EDItEmployee;
                break;
            }
            case "out": {

                actionUri = outEmployee_URI;
                idE=0;
                employeeType=0;
                EmailId=0;
                break;
            }


            case "lista": {
                Employee employee = service.getEmployeeById(idE

                        //Integer.parseInt(request.getParameter("idCompany"))
                );


                request.setAttribute("employee", employee);
                request.setAttribute("action", "edit");
                actionUri = listaEmpleadosxArea;
                break;
            }

            case "regresar": {
                Employee employee = service.getEmployeeById(idE

                        //Integer.parseInt(request.getParameter("idCompany"))
                );


                request.setAttribute("employee", employee);
                request.setAttribute("action", "edit");
                actionUri = MenuAdmin_URI;
                break;


            }

            case "editCorre": {
                Employee employee = service.getEmployeeById(idE
                );


                request.setAttribute("employee", employee);
                request.setAttribute("action", "edit");
                actionUri = UpdateEmpEmail_URI;
                break;
            }

            case "evaluar": {

                EmpEvaluado =Integer.parseInt(request.getParameter("idEmpleado"));
                actionUri = evaluar_uri;
                break;
            }


/*
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
*/




            default:
                actionUri = MenuRoot_URI;
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(actionUri);
        dispatcher.forward(request, response);
    }
}
