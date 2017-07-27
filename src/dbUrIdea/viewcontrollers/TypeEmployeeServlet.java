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
    public static String  evaluar2_uri= "/_Evaluar2.jsp";
    public static String  evaluar3_uri= "/_Evaluar3.jsp";
    public static String  addCv_uri= "/_NCv.jsp";
    int idE ;
    int employeeType;
    int EmailId;
    int idCom;
    int idA;

    int EmpEvaluado;
    int EmpCv;

    //evaluacion1
    double compromiso;
    double trabajoEquipo;
    double tomaDesicion;
    double opinion;
    double time;
    double grade;
    //evaluacion2

    double valiente;
    double honesto;
    double compartir;
    double responsable;
    double confianza;
    double grade1;

    //evaluacion3
    double comunicacion;
    double mejora;
    double idiomas;
    double digital;
    double grade2;



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        switch(action) {


            case "select": {
                employeeType = Integer.parseInt(request.getParameter("EmployeeType"));
                idE = Integer.parseInt(request.getParameter("idAdmin"));
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

            case "createEvaluation1": {


                /*
                Company company =new Company();
                Evaluation evaluation = new Evaluation();
                Employee employee =new Employee();
                evaluation.setCompany(company.setId(idCom));
                evaluation.setIdEmployee(employee.setId(idE));
                evaluation.setIdUserEmployee(employee.setId(EmpEvaluado));

                */
           compromiso= Double.parseDouble(request.getParameter("commitment"));
            trabajoEquipo= Double.parseDouble(request.getParameter("team_management"));
             tomaDesicion= Double.parseDouble(request.getParameter("decision_making"));
             opinion= Double.parseDouble(request.getParameter("strategic_thinking"));
          time= Double.parseDouble(request.getParameter("time_management"));
          grade = compromiso+trabajoEquipo+tomaDesicion+opinion+time;


                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(evaluar2_uri);
                dispatcher.forward(request, response);
                break;

            }


            case "createEvaluation2": {


                /*
                Company company =new Company();
                Evaluation evaluation = new Evaluation();
                Employee employee =new Employee();
                evaluation.setCompany(company.setId(idCom));
                evaluation.setIdEmployee(employee.setId(idE));
                evaluation.setIdUserEmployee(employee.setId(EmpEvaluado));

                */

             valiente= Double.parseDouble(request.getParameter("ethic"));

            honesto= Double.parseDouble(request.getParameter("customer_orientation"));
            compartir= Double.parseDouble(request.getParameter("social_responsability"));
            responsable= Double.parseDouble(request.getParameter("use_of_resources"));
             confianza= Double.parseDouble(request.getParameter("cost_orientation"));
                grade1 = valiente+honesto+compartir+responsable+confianza;


                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(evaluar3_uri);
                dispatcher.forward(request, response);
                break;

            }


            case "createEvaluation3": {



                Company company =new Company();
                Evaluation evaluation = new Evaluation();
                Employee employee =new Employee();
                Area area = new Area();

                comunicacion= Double.parseDouble(request.getParameter("communication"));
                mejora= Double.parseDouble(request.getParameter("professional_improvement"));
                idiomas= Double.parseDouble(request.getParameter("knowledge_of_languages"));
                digital= Double.parseDouble(request.getParameter("digital_skills"));
                grade2 = comunicacion+mejora+idiomas+digital;
                double avg =grade2+grade1+grade;



                evaluation.setCompany(company.setId(idCom));

                //evaluation.setIdEmployee(employee.setId(9));
                evaluation.setIdEmployee(employee.setId2(idE));

                evaluation.setIdUserEmployee(employee.setId(EmpEvaluado));


                evaluation.setArea(area.setId(idA));

                evaluation.setGrade(grade);
                evaluation.setGrade1(grade1);
                evaluation.setGrade2(grade2);

                evaluation.setCommitment(compromiso);
                evaluation.setCommunication(comunicacion);
                evaluation.setEthic(valiente);
                evaluation.setTeam_management(trabajoEquipo);
                evaluation.setDecision_making(tomaDesicion);
                evaluation.setStrategic_thinking(opinion);
                evaluation.setCustomer_orientation(honesto);
                evaluation.setSocial_responsability(compartir);
                evaluation.setTime_management(time);
                evaluation.setUse_of_resources(responsable);
                evaluation.setCost_orientation(confianza);
                evaluation.setKnowledge_of_languages(idiomas);
                evaluation.setDigital_skills(digital);
                evaluation.setProfessional_improvement(mejora);
                evaluation.setAvg_grade(avg);
                evaluation.setComment(request.getParameter("comment"));

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

            case "addCv2": {
                Cv cv= new Cv();
                Employee employee=new Employee();
                cv.setEmployee(employee.setId(EmpCv));

                cv.setCvType(Integer.parseInt(request.getParameter("cv_type")));
                cv.setDescription(request.getParameter("description"));
                String message = service.createCv(cv) ?
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

            case "addCv": {

                EmpCv =Integer.parseInt(request.getParameter("idEmpleado"));
                actionUri = addCv_uri;
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
