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
import java.sql.Timestamp;

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
    public static String EDItEmployee ="/_EmployeeForm.jsp";
    public static String EDItEmployeeComun ="/editEmployeeComun.jsp";
    public static String outEmployee_URI = "/index.jsp";
    public static String PruebaEmployee_URI = "/prueba3.jsp";
    public static String MenuAdmin_URI = "/menuAdministrator.jsp";
    public static String MenuEmp_URI = "/menuEmployee.jsp";

    public static String NuevoEmpleado_URI = "/newEmp2.jsp";

    public static String listaEmpleadosxArea = "/listaEmpAre.jsp";

    public static String  UpdateEmpEmail_URI= "/_EmpEmailUpdate.jsp";
    public static String  UpdateEmpEmailComun_URI= "/_EmpEmailUpdateComun.jsp";

    public static String  evaluar_uri= "/_Evaluar.jsp";
    public static String  evaluar2_uri= "/_Evaluar2.jsp";
    public static String  evaluar3_uri= "/_Evaluar3.jsp";

    public static String  evaluar_uriEditar= "/_EvaluarEditar.jsp";
    public static String  evaluar2_uriEditar= "/_Evaluar2Editar.jsp";
    public static String  evaluar3_uriEditar= "/_Evaluar3Editar.jsp";

    public static String  evaluarInformatica_uri= "/_EvaluarInformatica.jsp";
    public static String  evaluarInformatica2_uri= "/_EvaluarInformatica2.jsp";
    public static String  evaluarInformatica3_uri= "/_EvaluarInformatica3.jsp";

    public static String  evaluarInformatica_uriEditar= "/_EvaluarInformaticaEditar.jsp";
    public static String  evaluarInformatica2_uriEditar= "/_EvaluarInformatica2Editar.jsp";
    public static String  evaluarInformatica3_uriEditar= "/_EvaluarInformatica3Editar.jsp";

    public static String  evaluarAdministracion_uri= "/_EvaluarAdministracion.jsp";
    public static String  evaluarAdministracion2_uri= "/_EvaluarAdministracion2.jsp";
    public static String  evaluarAdministracion3_uri= "/_EvaluarAdministracion3.jsp";

    public static String  evaluarAdministracion_uriEditar= "/_EvaluarAdministracionEditar.jsp";
    public static String  evaluarAdministracion2_uriEditar= "/_EvaluarAdministracion2Editar.jsp";
    public static String  evaluarAdministracion3_uriEditar= "/_EvaluarAdministracion3Editar.jsp";

    public static String  evaluarProduccion_uri= "/_EvaluarProduccion.jsp";
    public static String  evaluarProduccion2_uri= "/_EvaluarProduccion2.jsp";
    public static String  evaluarProduccion3_uri= "/_EvaluarProduccion3.jsp";

    public static String  evaluarProduccion_uriEditar= "/_EvaluarProduccionEditar.jsp";
    public static String  evaluarProduccion2_uriEditar= "/_EvaluarProduccion2Editar.jsp";
    public static String  evaluarProduccion3_uriEditar= "/_EvaluarProduccion3Editar.jsp";

    public static String  evaluarMarketing_uri= "/_EvaluarMaketing.jsp";
    public static String  evaluarMarketing2_uri= "/_EvaluarMaketing2.jsp";
    public static String  evaluarMarketing3_uri= "/_EvaluarMaketing3.jsp";

    public static String  evaluarMarketing_uriEditar= "/_EvaluarMaketingEditar.jsp";
    public static String  evaluarMarketing2_uriEditar= "/_EvaluarMaketing2Editar.jsp";
    public static String  evaluarMarketing3_uriEditar= "/_EvaluarMaketing3Editar.jsp";


    public static String  addCv_uri= "/_NCv.jsp";

    public static String perfilEmployee_uri = "/PerfilPrueba1.jsp";
    public static String perfilEmployee_Adminuri = "/PerfilPrueba2.jsp";
    public static String perfilHistorialEvaluEmployee_uri = "/PerfilHistorialEvaluation1.jsp";
    public static String perfilHistoEvaluAdminitracionEmployee_uri = "/PerfilHistorialEvaluationAdministracion.jsp";
    public static String perfilHistoEvaluInformaticaEmployee_uri = "/PerfilHistorialEvaluationInformatica.jsp";
    public static String perfilHistoEvaluMarketingEmployee_uri = "/PerfilHistorialEvaluationMarketing.jsp";
    public static String perfilHistoProduccionEmployee_uri = "/PerfilHistorialEvaluationProduccion.jsp";


    public static String perfilHistorialEvaluEmployee2_uri = "/PerfilHistorialEvaluationAdmin.jsp";
    public static String perfilHistoEvaluAdminitracionEmployee2_uri = "/PerfilHistorialEvaluationAdministracionAdmin.jsp";
    public static String perfilHistoEvaluInformaticaEmployee2_uri = "/PerfilHistorialEvaluationInformaticaAdmin.jsp";
    public static String perfilHistoEvaluMarketingEmployee2_uri = "/PerfilHistorialEvaluationMarketingAdmin.jsp";
    public static String perfilHistoProduccionEmployee2_uri = "/PerfilHistorialEvaluationProduccionAdmin.jsp";

    public static String PerfilAdmin_uri = "/PerfilAdmin.jsp";
    public static String PerfilAdminEmpleado_uri = "/PerfilAdminEmpleado.jsp";
    public static String Notime_uri = "/timeF.jsp";
    public static String PerfilAdmin_Empleadouri = "/PerfilAdminEmpleado.jsp";

    public static String noTimeCv = "/noTimeCvEmpleado.jsp";
    public static String EditarCv = "/CvAdmEditarEmpleado.jsp";



    String email;

    int evaluador;
    int idE ;
    int employeeType;
    int EmailId;
    int idCom;
    int idA;
    int idEvaluacion;

    int EmpEvaluado;
    int EmpCv;
    int EmpPerfil;
    int areaId;
    int idCv;





    //evaluacion1
    float competitivo;
    float competif;
    float presion;
    float compromiso;
    float trabajoEquipo;
    float tomaDesicion;
    float objetivo;
    float liderasgo;
    float analitico;
    float proactivo;
    float grade;
    //evaluacion2

    float puntual;
    float honesto;
    float organizado;
    float responsable;
    float respeto;
    float grade1;




    //evaluacion3
    float desempeño;
    float negocioSkills;
    float negociosC;
    float comunicacion;
    float eficiencia;
    float productividad;
    float innovacion;
    float grade2;
    float idiomas;
    float computadora;
    float conocimientos;
    float soluciones;
    float optimisar;



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        switch(action) {


            case "EditarCv2": {

                Cv cv= new Cv();
                cv.setId(idCv);
                cv.setCvType(Integer.parseInt(request.getParameter("cv_type")));
                cv.setDescription(new String(request.getParameter("description").getBytes("ISO-8859-1"),"UTF-8"));
                String message = service.updateCv(cv) ?
                        "Update success" :
                        "Error while updating";
                log(message);

                Employee employee1 = service.getEmployeeById(idE);

                request.setAttribute("employee", employee1);
                request.setAttribute("action", "edit");


                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(MenuAdmin_URI );
                dispatcher.forward(request, response);
                break;

            }

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
                employee.setId(idE);
                employee.setPassword(new String(request.getParameter("password").
                        getBytes("ISO-8859-1"),"UTF-8"));
                employee.setName(new String(request.getParameter("employee_name").
                        getBytes("ISO-8859-1"), "UTF-8"));

                employee.setFirstLastName(new String(request.getParameter("employee_first_last_name").
                        getBytes("ISO-8859-1"), "UTF-8"));


                employee.setSecondLastName(new String(request.getParameter("employee_second_last_name").
                        getBytes("ISO-8859-1"), "UTF-8"));

                employee.setDni(Integer.parseInt(request.getParameter("dni")));

                employee.setPhoneNumber(Integer.parseInt(request.getParameter("phone_number")));
                employee.setCellPhoneNumber(Integer.parseInt(request.getParameter("cell_phone_number")));

                //prueba ---



                String direccion =request.getParameter("address");


                //employee.setAddress(request.getParameter("address"));
                employee.setAddress(new String(direccion.getBytes("ISO-8859-1"), "UTF-8"));



                employee.setDepartment(new String(request.getParameter("department")
                        .getBytes("ISO-8859-1"),"UTF-8"));
                employee.setBirthdate(Date.valueOf(request.getParameter("birthdate")));
                String message = service.updateEmployee2(employee) ?
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

            case "updateEmail": {

                EmailAddress emailAddress= new EmailAddress();
                //EmailAddress emailAddress = service.getEmailAddressById(Integer.parseInt(request.getParameter("id")));

                emailAddress.setId(EmailId);
                emailAddress.setEmailData(new String(request.getParameter("emailData").getBytes("ISO-8859-1"),"UTF-8"));
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

                email=new String(request.getParameter("emailData").getBytes("ISO-8859-1"),"UTF-8");
                emailAddress1.setEmailData(email);

                String message = service.createEmail(emailAddress1) ?
                        "Create success" :
                        "Error while creating";



                        //Integer.parseInt(request.getParameter("idCompany"))



                request.setAttribute("action", "edit");
                //


                log(message);
                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(NuevoEmpleado_URI);
                dispatcher.forward(request, response);
                break;
            }

            case "createEmplPeon": {

                Employee employee =new Employee();
                EmailAddress emailAddress =new EmailAddress();
                Area area = new Area();
                Company company1 =new Company();

                employee.setEmailAddress(service.findIdByEmail(email));


                employee.setCompany(company1.setId(
                        idCom

                        )
                );

                employee.setArea(area.setId(idA));
                employee.setBirthdate(Date.valueOf(request.getParameter("cumple")));
                employee.setEmployeeType(2);



                employee.setPassword(new String(request.getParameter("password").getBytes("ISO-8859-1"),"UTF-8"));
                employee.setName(new String(request.getParameter("employee_name").getBytes("ISO-8859-1"),"UTF-8"));
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


           compromiso= Float.parseFloat(request.getParameter("commitment_company"));
            trabajoEquipo= Float.parseFloat(request.getParameter("teamwork"));
             tomaDesicion= Float.parseFloat(request.getParameter("decision_making"));
             proactivo= Float.parseFloat(request.getParameter("proactive"));
          grade = compromiso+trabajoEquipo+tomaDesicion+proactivo;

          RequestDispatcher dispatcher =
                        request.getRequestDispatcher(evaluar2_uri);
                dispatcher.forward(request, response);
                break;

            }

            case "createEvaluationIformatica1": {


                compromiso= Float.parseFloat(request.getParameter("commitment_company"));
                competitivo=Float.parseFloat(request.getParameter("competitive"));
                presion= Float.parseFloat(request.getParameter("work_under_pressure"));
                proactivo= Float.parseFloat(request.getParameter("proactive"));
                grade = compromiso+competitivo+presion+proactivo;

                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(evaluarInformatica2_uri);
                dispatcher.forward(request, response);
                break;

            }

            case "createEvaluationAdministracion2": {

                honesto= Float.parseFloat(request.getParameter("honesty"));
                organizado= Float.parseFloat(request.getParameter("organized"));
                responsable= Float.parseFloat(request.getParameter("responsibility"));
                respeto= Float.parseFloat(request.getParameter("respect"));
                puntual=Float.parseFloat(request.getParameter("punctuality"));
                grade1 = honesto+responsable+organizado+respeto+puntual;


                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(evaluarAdministracion3_uri);
                dispatcher.forward(request, response);
                break;

            }

            case "createEvaluationAdministracion3": {



                Company company =new Company();
                Evaluation evaluation = new Evaluation();
                Employee employee =new Employee();
                Area area = new Area();
                comunicacion= Float.parseFloat(request.getParameter("communication_skills"));
                idiomas= Float.parseFloat(request.getParameter("language_skills"));
                negocioSkills= Float.parseFloat(request.getParameter("business_skills"));

                negociosC= Float.parseFloat(request.getParameter("business_knowledge"));
                optimisar= Float.parseFloat(request.getParameter("resource_optimization"));
                eficiencia= Float.parseFloat(request.getParameter("efficiency"));
                productividad= Float.parseFloat(request.getParameter("productivity"));
                innovacion= Float.parseFloat(request.getParameter("innovative"));
                grade2 = comunicacion+idiomas+negociosC+negocioSkills+optimisar+eficiencia
                        +productividad+innovacion;

                float avg =grade2+grade1+grade;






                evaluation.setCompany(company.setId(idCom));
                evaluation.setIdEvaluator(employee.setId2(idE));
                evaluation.setIdUserEmployee(employee.setId(EmpEvaluado));
                evaluation.setArea(area.setId(idA));

                evaluation.setGrade(grade);
                evaluation.setGrade1(grade1);
                evaluation.setGrade2(grade2);
                //actitud



                evaluation.setCommitment_company(compromiso);
                evaluation.setProactive(proactivo);
                evaluation.setObjective(objetivo);
                evaluation.setDecision_making(tomaDesicion);
                evaluation.setTeamwork(trabajoEquipo);

                //valores
                evaluation.setPunctuality(puntual);
                evaluation.setHonesty(honesto);
                evaluation.setOrganized(organizado);
                evaluation.setResponsibility(responsable);
                evaluation.setRespect(respeto);
                //crecimiento profecional

                evaluation.setLanguage_skills(idiomas);
                evaluation.setBusiness_skills(negocioSkills);
                evaluation.setBusiness_knowledge(negociosC);
                evaluation.setProductivity(productividad);
                evaluation.setResource_optimization(optimisar);
                evaluation.setEfficiency(eficiencia);
                evaluation.setCommunication_skills(comunicacion);
                evaluation.setInnovative(innovacion);
                evaluation.setAvg_grade(avg);
                evaluation.setComment(new String(request.getParameter("comment").getBytes("ISO-8859-1"),"UTF-8"));

                String message = service.createEvaluationAdministracion(evaluation) ?
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


            case "createEvaluationAdministracion1": {

                compromiso= Float.parseFloat(request.getParameter("commitment_company"));
                proactivo=Float.parseFloat(request.getParameter("proactive"));
                tomaDesicion=Float.parseFloat(request.getParameter("decision_making"));
                objetivo= Float.parseFloat(request.getParameter("objective"));
                trabajoEquipo= Float.parseFloat(request.getParameter("teamwork"));
                grade = compromiso+objetivo+trabajoEquipo+proactivo+tomaDesicion;

                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(evaluarAdministracion2_uri);
                dispatcher.forward(request, response);
                break;

            }


            case "createEvaluationProduccion1": {
                compromiso= Float.parseFloat(request.getParameter("commitment_company"));
                presion=Float.parseFloat(request.getParameter("work_under_pressure"));
                trabajoEquipo= Float.parseFloat(request.getParameter("teamwork"));
                proactivo= Float.parseFloat(request.getParameter("proactive"));
                grade = compromiso+presion+trabajoEquipo+proactivo;

                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(evaluarProduccion2_uri);
                dispatcher.forward(request, response);
                break;

            }

            case "createEvaluationProduccion2": {

                puntual= Float.parseFloat(request.getParameter("punctuality"));
                honesto= Float.parseFloat(request.getParameter("honesty"));
                organizado= Float.parseFloat(request.getParameter("organized"));
                responsable= Float.parseFloat(request.getParameter("responsibility"));
                respeto= Float.parseFloat(request.getParameter("respect"));
                grade1 = honesto+responsable+organizado+respeto+puntual;


                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(evaluarProduccion3_uri);
                dispatcher.forward(request, response);
                break;

            }


            case "createEvaluationProduccion3": {



                Company company =new Company();
                Evaluation evaluation = new Evaluation();
                Employee employee =new Employee();
                Area area = new Area();

                eficiencia= Float.parseFloat(request.getParameter("efficiency"));
                desempeño= Float.parseFloat(request.getParameter("performance"));
                productividad= Float.parseFloat(request.getParameter("productivity"));
                optimisar= Float.parseFloat(request.getParameter("resource_optimization"));

                innovacion= Float.parseFloat(request.getParameter("innovative"));
                grade2 = desempeño+optimisar+eficiencia+productividad+innovacion;
                float avg =grade2+grade1+grade;






                evaluation.setCompany(company.setId(idCom));
                evaluation.setIdEvaluator(employee.setId2(idE));
                evaluation.setIdUserEmployee(employee.setId(EmpEvaluado));
                evaluation.setArea(area.setId(idA));

                evaluation.setGrade(grade);
                evaluation.setGrade1(grade1);
                evaluation.setGrade2(grade2);
                //actitud




                evaluation.setCommitment_company(compromiso);
                evaluation.setWork_under_pressure(presion);
                evaluation.setTeamwork(trabajoEquipo);
                evaluation.setProactive(proactivo);
                //valores
                evaluation.setHonesty(honesto);
                evaluation.setOrganized(organizado);
                evaluation.setPunctuality(puntual);
                evaluation.setResponsibility(responsable);
                evaluation.setRespect(respeto);
                //crecimiento profecional


                //crecimiento Profecional
                evaluation.setEfficiency(eficiencia);
                evaluation.setPerformance(desempeño);
                evaluation.setProductivity(productividad);
                evaluation.setResource_optimization(optimisar);
                evaluation.setInnovative(innovacion);
                evaluation.setAvg_grade(avg);
                evaluation.setComment(new String(request.getParameter("comment").getBytes("ISO-8859-1"),"UTF-8"));

                String message = service.createEvaluationProduccion(evaluation) ?
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

            case "createEvaluationMarketing1": {



                compromiso= Float.parseFloat(request.getParameter("commitment_company"));
                liderasgo=Float.parseFloat(request.getParameter("leadership"));
                analitico=Float.parseFloat(request.getParameter("analytical"));
                objetivo= Float.parseFloat(request.getParameter("objective"));
                tomaDesicion= Float.parseFloat(request.getParameter("decision_making"));
                grade = compromiso+liderasgo+analitico+objetivo+tomaDesicion;

                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(evaluarMarketing2_uri);
                dispatcher.forward(request, response);
                break;

            }


            case "createEvaluationIformatica2": {

                honesto= Float.parseFloat(request.getParameter("honesty"));
                organizado= Float.parseFloat(request.getParameter("organized"));
                responsable= Float.parseFloat(request.getParameter("responsibility"));
                respeto= Float.parseFloat(request.getParameter("respect"));
                grade1 = honesto+responsable+organizado+respeto;


                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(evaluarInformatica3_uri);
                dispatcher.forward(request, response);
                break;

            }


            case "createEvaluationMarketing2": {

                puntual= Float.parseFloat(request.getParameter("punctuality"));
                honesto= Float.parseFloat(request.getParameter("honesty"));
                organizado= Float.parseFloat(request.getParameter("organized"));
                responsable= Float.parseFloat(request.getParameter("responsibility"));
                respeto= Float.parseFloat(request.getParameter("respect"));
                grade1 = honesto+responsable+organizado+respeto+puntual;


                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(evaluarMarketing3_uri);
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

             puntual= Float.parseFloat(request.getParameter("punctuality"));

            honesto= Float.parseFloat(request.getParameter("honesty"));
            organizado= Float.parseFloat(request.getParameter("organized"));
            responsable= Float.parseFloat(request.getParameter("responsibility"));
             respeto= Float.parseFloat(request.getParameter("respect"));
                grade1 = puntual+honesto+responsable+organizado+respeto;


                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(evaluar3_uri);
                dispatcher.forward(request, response);
                break;

            }



            case "createEvaluationMarketing3": {



                Company company =new Company();
                Evaluation evaluation = new Evaluation();
                Employee employee =new Employee();
                Area area = new Area();



                idiomas= Float.parseFloat(request.getParameter("language_skills"));
                negocioSkills= Float.parseFloat(request.getParameter("business_skills"));
                negociosC= Float.parseFloat(request.getParameter("business_knowledge"));

                conocimientos= Float.parseFloat(request.getParameter("market_knowledge"));
                productividad= Float.parseFloat(request.getParameter("productivity"));
                comunicacion= Float.parseFloat(request.getParameter("communication_skills"));
                innovacion= Float.parseFloat(request.getParameter("innovative"));
                grade2 = idiomas+negocioSkills+negociosC+conocimientos
                        +productividad+comunicacion+innovacion;

                float avg =grade2+grade1+grade;






                evaluation.setCompany(company.setId(idCom));
                evaluation.setIdEvaluator(employee.setId2(idE));
                evaluation.setIdUserEmployee(employee.setId(EmpEvaluado));
                evaluation.setArea(area.setId(idA));

                evaluation.setGrade(grade);
                evaluation.setGrade1(grade1);
                evaluation.setGrade2(grade2);
                //actitud



                evaluation.setCommitment_company(compromiso);
                evaluation.setLeadership(liderasgo);
                evaluation.setAnalytical(analitico);
                evaluation.setObjective(objetivo);
                evaluation.setDecision_making(tomaDesicion);

                //valores
                evaluation.setPunctuality(puntual);
                evaluation.setHonesty(honesto);
                evaluation.setOrganized(organizado);
                evaluation.setResponsibility(responsable);
                evaluation.setRespect(respeto);
                //crecimiento profecional



                evaluation.setLanguage_skills(idiomas);
                evaluation.setBusiness_skills(negocioSkills);
                evaluation.setBusiness_knowledge(negociosC);
                evaluation.setMarket_knowledge(conocimientos);
                evaluation.setProductivity(productividad);
                evaluation.setCommunication_skills(comunicacion);
                evaluation.setInnovative(innovacion);
                evaluation.setAvg_grade(avg);
                evaluation.setComment(new String(request.getParameter("comment").getBytes("ISO-8859-1"),"UTF-8"));

                String message = service.createEvaluationMarketing(evaluation) ?
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


            case "createEvaluationIformatica3": {



                Company company =new Company();
                Evaluation evaluation = new Evaluation();
                Employee employee =new Employee();
                Area area = new Area();

                idiomas= Float.parseFloat(request.getParameter("language_skills"));
                computadora= Float.parseFloat(request.getParameter("computer_skills"));
                conocimientos= Float.parseFloat(request.getParameter("market_knowledge"));
                productividad= Float.parseFloat(request.getParameter("productivity"));
                eficiencia= Float.parseFloat(request.getParameter("efficiency"));
                soluciones= Float.parseFloat(request.getParameter("give_successful_solutions"));
                innovacion= Float.parseFloat(request.getParameter("innovative"));
                grade2 = idiomas+computadora+conocimientos+eficiencia+productividad+soluciones+innovacion;
                float avg =grade2+grade1+grade;






                evaluation.setCompany(company.setId(idCom));
                evaluation.setIdEvaluator(employee.setId2(idE));
                evaluation.setIdUserEmployee(employee.setId(EmpEvaluado));
                evaluation.setArea(area.setId(idA));

                evaluation.setGrade(grade);
                evaluation.setGrade1(grade1);
                evaluation.setGrade2(grade2);
                //actitud

                evaluation.setCommitment_company(compromiso);
                evaluation.setCompetitive(competitivo);
                evaluation.setWork_under_pressure(presion);
                evaluation.setProactive(proactivo);
                //valores
                evaluation.setHonesty(honesto);
                evaluation.setOrganized(organizado);
                evaluation.setResponsibility(responsable);
                evaluation.setRespect(respeto);
                //crecimiento profecional
                evaluation.setLanguage_skills(idiomas);
                evaluation.setComputer_skills(computadora);
                evaluation.setMarket_knowledge(conocimientos);
                evaluation.setProductivity(productividad);
                evaluation.setEfficiency(eficiencia);
                evaluation.setGive_successful_solutions(soluciones);
                evaluation.setInnovative(innovacion);
                evaluation.setAvg_grade(avg);
                evaluation.setComment(new String(request.getParameter("comment").getBytes("ISO-8859-1"),"UTF-8"));

                String message = service.createEvaluationInformatica(evaluation) ?
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


            case "createEvaluation3": {



                Company company =new Company();
                Evaluation evaluation = new Evaluation();
                Employee employee =new Employee();
                Area area = new Area();

                desempeño= Float.parseFloat(request.getParameter("performance"));
                eficiencia= Float.parseFloat(request.getParameter("efficiency"));
                productividad= Float.parseFloat(request.getParameter("productivity"));
                innovacion= Float.parseFloat(request.getParameter("innovative"));
                grade2 = desempeño+eficiencia+productividad+innovacion;
                float avg =grade2+grade1+grade;



                evaluation.setCompany(company.setId(idCom));
                evaluation.setIdEvaluator(employee.setId2(idE));
                evaluation.setIdUserEmployee(employee.setId(EmpEvaluado));
                evaluation.setArea(area.setId(idA));

                evaluation.setGrade(grade);
                evaluation.setGrade1(grade1);
                evaluation.setGrade2(grade2);
                //actitud
                evaluation.setCommitment_company(compromiso);
                evaluation.setProactive(proactivo);
                evaluation.setTeamwork(trabajoEquipo);
                evaluation.setDecision_making(tomaDesicion);
                //valores
                evaluation.setPunctuality(puntual);
                evaluation.setHonesty(honesto);
                evaluation.setOrganized(organizado);
                evaluation.setResponsibility(responsable);
                evaluation.setRespect(respeto);
                //crecimiento profecional


                evaluation.setPerformance(desempeño);
                evaluation.setEfficiency(eficiencia);
                evaluation.setProductivity(productividad);
                evaluation.setInnovative(innovacion);
                evaluation.setAvg_grade(avg);
                evaluation.setComment(new String(request.getParameter("comment").getBytes("ISO-8859-1"),"UTF-8"));

                String message = service.createEvaluationPracticantes(evaluation) ?
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
                cv.setDescription(new String(request.getParameter("description").getBytes("ISO-8859-1"),"UTF-8"));
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

            //------------------
            //Edicionn ---------------
            case "createEvaluation1Editar": {


                compromiso= Float.parseFloat(request.getParameter("commitment_company"));
                trabajoEquipo= Float.parseFloat(request.getParameter("teamwork"));
                tomaDesicion= Float.parseFloat(request.getParameter("decision_making"));
                proactivo= Float.parseFloat(request.getParameter("proactive"));
                grade = compromiso+trabajoEquipo+tomaDesicion+proactivo;

                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(evaluar2_uriEditar);
                dispatcher.forward(request, response);
                break;

            }

            case "createEvaluationIformatica1Editar": {


                compromiso= Float.parseFloat(request.getParameter("commitment_company"));
                competif=Float.parseFloat(request.getParameter("competitive"));
                presion= Float.parseFloat(request.getParameter("work_under_pressure"));
                proactivo= Float.parseFloat(request.getParameter("proactive"));
                grade = compromiso+ competif+presion+proactivo;

                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(evaluarInformatica2_uriEditar);
                dispatcher.forward(request, response);
                break;

            }

            case "createEvaluationAdministracion2Editar": {

                honesto= Float.parseFloat(request.getParameter("honesty"));
                organizado= Float.parseFloat(request.getParameter("organized"));
                responsable= Float.parseFloat(request.getParameter("responsibility"));
                respeto= Float.parseFloat(request.getParameter("respect"));
                puntual=Float.parseFloat(request.getParameter("punctuality"));
                grade1 = honesto+responsable+organizado+respeto+puntual;


                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(evaluarAdministracion3_uriEditar);
                dispatcher.forward(request, response);
                break;

            }

            case "createEvaluationAdministracion3Editar": {




                Evaluation evaluation = new Evaluation();

                comunicacion= Float.parseFloat(request.getParameter("communication_skills"));
                idiomas= Float.parseFloat(request.getParameter("language_skills"));
                negocioSkills= Float.parseFloat(request.getParameter("business_skills"));

                negociosC= Float.parseFloat(request.getParameter("business_knowledge"));
                optimisar= Float.parseFloat(request.getParameter("resource_optimization"));
                eficiencia= Float.parseFloat(request.getParameter("efficiency"));
                productividad= Float.parseFloat(request.getParameter("productivity"));
                innovacion= Float.parseFloat(request.getParameter("innovative"));
                grade2 = comunicacion+idiomas+negociosC+negocioSkills+optimisar+eficiencia
                        +productividad+innovacion;

                float avg =grade2+grade1+grade;






                evaluation.setId(idEvaluacion);
                evaluation.setGrade(grade);
                evaluation.setGrade1(grade1);
                evaluation.setGrade2(grade2);
                //actitud



                evaluation.setCommitment_company(compromiso);
                evaluation.setProactive(proactivo);
                evaluation.setObjective(objetivo);
                evaluation.setDecision_making(tomaDesicion);
                evaluation.setTeamwork(trabajoEquipo);

                //valores
                evaluation.setPunctuality(puntual);
                evaluation.setHonesty(honesto);
                evaluation.setOrganized(organizado);
                evaluation.setResponsibility(responsable);
                evaluation.setRespect(respeto);
                //crecimiento profecional

                evaluation.setLanguage_skills(idiomas);
                evaluation.setBusiness_skills(negocioSkills);
                evaluation.setBusiness_knowledge(negociosC);
                evaluation.setProductivity(productividad);
                evaluation.setResource_optimization(optimisar);
                evaluation.setEfficiency(eficiencia);
                evaluation.setCommunication_skills(comunicacion);
                evaluation.setInnovative(innovacion);
                evaluation.setAvg_grade(avg);
                evaluation.setComment(new String(request.getParameter("comment").getBytes("ISO-8859-1"),"UTF-8"));

                String message = service.updateAdministracionEva(evaluation) ?
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


            case "createEvaluationAdministracion1Editar": {

                compromiso= Float.parseFloat(request.getParameter("commitment_company"));
                proactivo=Float.parseFloat(request.getParameter("proactive"));
                tomaDesicion=Float.parseFloat(request.getParameter("decision_making"));
                objetivo= Float.parseFloat(request.getParameter("objective"));
                trabajoEquipo= Float.parseFloat(request.getParameter("teamwork"));
                grade = compromiso+objetivo+trabajoEquipo+proactivo+tomaDesicion;

                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(evaluarAdministracion2_uriEditar);
                dispatcher.forward(request, response);
                break;

            }


            case "createEvaluationProduccion1Editar": {
                compromiso= Float.parseFloat(request.getParameter("commitment_company"));
                presion=Float.parseFloat(request.getParameter("work_under_pressure"));
                trabajoEquipo= Float.parseFloat(request.getParameter("teamwork"));
                proactivo= Float.parseFloat(request.getParameter("proactive"));
                grade = compromiso+presion+trabajoEquipo+proactivo;

                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(evaluarProduccion2_uriEditar);
                dispatcher.forward(request, response);
                break;

            }

            case "createEvaluationProduccion2Editar": {

                puntual= Float.parseFloat(request.getParameter("punctuality"));
                honesto= Float.parseFloat(request.getParameter("honesty"));
                organizado= Float.parseFloat(request.getParameter("organized"));
                responsable= Float.parseFloat(request.getParameter("responsibility"));
                respeto= Float.parseFloat(request.getParameter("respect"));
                grade1 = honesto+responsable+organizado+respeto+puntual;


                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(evaluarProduccion3_uriEditar);
                dispatcher.forward(request, response);
                break;

            }


            case "createEvaluationProduccion3Editar": {




                Evaluation evaluation = new Evaluation();
                evaluation.setId(idEvaluacion);


                eficiencia= Float.parseFloat(request.getParameter("efficiency"));
                desempeño= Float.parseFloat(request.getParameter("performance"));
                productividad= Float.parseFloat(request.getParameter("productivity"));
                optimisar= Float.parseFloat(request.getParameter("resource_optimization"));

                innovacion= Float.parseFloat(request.getParameter("innovative"));
                grade2 = desempeño+optimisar+eficiencia+productividad+innovacion;
                float avg =grade2+grade1+grade;
                evaluation.setGrade(grade);
                evaluation.setGrade1(grade1);
                evaluation.setGrade2(grade2);
                //actitud
                evaluation.setCommitment_company(compromiso);
                evaluation.setWork_under_pressure(presion);
                evaluation.setTeamwork(trabajoEquipo);
                evaluation.setProactive(proactivo);
                //valores
                evaluation.setHonesty(honesto);
                evaluation.setOrganized(organizado);
                evaluation.setPunctuality(puntual);
                evaluation.setResponsibility(responsable);
                evaluation.setRespect(respeto);
                //crecimiento profecional


                //crecimiento Profecional
                evaluation.setEfficiency(eficiencia);
                evaluation.setPerformance(desempeño);
                evaluation.setProductivity(productividad);
                evaluation.setResource_optimization(optimisar);
                evaluation.setInnovative(innovacion);
                evaluation.setAvg_grade(avg);
                evaluation.setComment(new String(request.getParameter("comment").getBytes("ISO-8859-1"),"UTF-8"));

                String message = service.updateProductividadEva(evaluation) ?
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

            case "createEvaluationMarketing1Editar": {



                compromiso= Float.parseFloat(request.getParameter("commitment_company"));
                liderasgo=Float.parseFloat(request.getParameter("leadership"));
                analitico=Float.parseFloat(request.getParameter("analytical"));
                objetivo= Float.parseFloat(request.getParameter("objective"));
                tomaDesicion= Float.parseFloat(request.getParameter("decision_making"));
                grade = compromiso+liderasgo+analitico+objetivo+tomaDesicion;

                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(evaluarMarketing2_uriEditar);
                dispatcher.forward(request, response);
                break;

            }


            case "createEvaluationIformatica2Editar": {

                honesto= Float.parseFloat(request.getParameter("honesty"));
                organizado= Float.parseFloat(request.getParameter("organized"));
                responsable= Float.parseFloat(request.getParameter("responsibility"));
                respeto= Float.parseFloat(request.getParameter("respect"));
                grade1 = honesto+responsable+organizado+respeto;


                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(evaluarInformatica3_uriEditar);
                dispatcher.forward(request, response);
                break;

            }


            case "createEvaluationMarketing2Editar": {

                puntual= Float.parseFloat(request.getParameter("punctuality"));
                honesto= Float.parseFloat(request.getParameter("honesty"));
                organizado= Float.parseFloat(request.getParameter("organized"));
                responsable= Float.parseFloat(request.getParameter("responsibility"));
                respeto= Float.parseFloat(request.getParameter("respect"));
                grade1 = honesto+responsable+organizado+respeto+puntual;


                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(evaluarMarketing3_uriEditar);
                dispatcher.forward(request, response);
                break;

            }


            case "createEvaluation2Editar": {


                /*
                Company company =new Company();
                Evaluation evaluation = new Evaluation();
                Employee employee =new Employee();
                evaluation.setCompany(company.setId(idCom));
                evaluation.setIdEmployee(employee.setId(idE));
                evaluation.setIdUserEmployee(employee.setId(EmpEvaluado));

                */

                puntual= Float.parseFloat(request.getParameter("punctuality"));

                honesto= Float.parseFloat(request.getParameter("honesty"));
                organizado= Float.parseFloat(request.getParameter("organized"));
                responsable= Float.parseFloat(request.getParameter("responsibility"));
                respeto= Float.parseFloat(request.getParameter("respect"));
                grade1 = puntual+honesto+responsable+organizado+respeto;


                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(evaluar3_uriEditar);
                dispatcher.forward(request, response);
                break;

            }



            case "createEvaluationMarketing3Editar": {




                Evaluation evaluation = new Evaluation();
                evaluation.setId(idEvaluacion);


                idiomas= Float.parseFloat(request.getParameter("language_skills"));
                negocioSkills= Float.parseFloat(request.getParameter("business_skills"));
                negociosC= Float.parseFloat(request.getParameter("business_knowledge"));

                conocimientos= Float.parseFloat(request.getParameter("market_knowledge"));
                productividad= Float.parseFloat(request.getParameter("productivity"));
                comunicacion= Float.parseFloat(request.getParameter("communication_skills"));
                innovacion= Float.parseFloat(request.getParameter("innovative"));
                grade2 = idiomas+negocioSkills+negociosC+conocimientos
                        +productividad+comunicacion+innovacion;

                float avg =grade2+grade1+grade;








                evaluation.setGrade(grade);
                evaluation.setGrade1(grade1);
                evaluation.setGrade2(grade2);
                //actitud



                evaluation.setCommitment_company(compromiso);
                evaluation.setLeadership(liderasgo);
                evaluation.setAnalytical(analitico);
                evaluation.setObjective(objetivo);
                evaluation.setDecision_making(tomaDesicion);

                //valores
                evaluation.setPunctuality(puntual);
                evaluation.setHonesty(honesto);
                evaluation.setOrganized(organizado);
                evaluation.setResponsibility(responsable);
                evaluation.setRespect(respeto);
                //crecimiento profecional



                evaluation.setLanguage_skills(idiomas);
                evaluation.setBusiness_skills(negocioSkills);
                evaluation.setBusiness_knowledge(negociosC);
                evaluation.setMarket_knowledge(conocimientos);
                evaluation.setProductivity(productividad);
                evaluation.setCommunication_skills(comunicacion);
                evaluation.setInnovative(innovacion);
                evaluation.setAvg_grade(avg);
                evaluation.setComment(new String(request.getParameter("comment").getBytes("ISO-8859-1"),"UTF-8"));

                String message = service.updateMarketiongEva(evaluation) ?
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


            case "createEvaluationIformatica3Editar": {




                Evaluation evaluation = new Evaluation();

                idiomas= Float.parseFloat(request.getParameter("language_skills"));
                computadora= Float.parseFloat(request.getParameter("computer_skills"));
                conocimientos= Float.parseFloat(request.getParameter("market_knowledge"));
                productividad= Float.parseFloat(request.getParameter("productivity"));
                eficiencia= Float.parseFloat(request.getParameter("efficiency"));
                soluciones= Float.parseFloat(request.getParameter("give_successful_solutions"));
                innovacion= Float.parseFloat(request.getParameter("innovative"));
                grade2 = idiomas+computadora+conocimientos+eficiencia+productividad+soluciones+innovacion;
                float avg =grade2+grade1+grade;




                evaluation.setId(idEvaluacion);



                evaluation.setGrade(grade);
                evaluation.setGrade1(grade1);
                evaluation.setGrade2(grade2);
                //actitud


                evaluation.setCompetitive(competif);
                evaluation.setCommitment_company(compromiso);
                evaluation.setWork_under_pressure(presion);
                evaluation.setProactive(proactivo);
                //valores
                evaluation.setHonesty(honesto);
                evaluation.setOrganized(organizado);
                evaluation.setResponsibility(responsable);
                evaluation.setRespect(respeto);
                //crecimiento profecional
                evaluation.setLanguage_skills(idiomas);
                evaluation.setComputer_skills(computadora);
                evaluation.setMarket_knowledge(conocimientos);
                evaluation.setProductivity(productividad);
                evaluation.setEfficiency(eficiencia);
                evaluation.setGive_successful_solutions(soluciones);
                evaluation.setInnovative(innovacion);
                evaluation.setAvg_grade(avg);
                evaluation.setComment(new String
                        (request.getParameter("comment").
                                getBytes("ISO-8859-1"),"UTF-8"));

                String message = service.updateInformaticoEva(evaluation) ?
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


            case "createEvaluation3Editar": {



                Evaluation evaluation = new Evaluation();


                desempeño = Float.parseFloat(request.getParameter("performance"));
                eficiencia = Float.parseFloat(request.getParameter("efficiency"));
                productividad = Float.parseFloat(request.getParameter("productivity"));
                innovacion = Float.parseFloat(request.getParameter("innovative"));
                grade2 = desempeño + eficiencia + productividad + innovacion;
                float avg = grade2 + grade1 + grade;


                evaluation.setId(idEvaluacion);
                evaluation.setGrade(grade);
                evaluation.setGrade1(grade1);
                evaluation.setGrade2(grade2);
                //actitud
                evaluation.setCommitment_company(compromiso);
                evaluation.setProactive(proactivo);
                evaluation.setTeamwork(trabajoEquipo);
                evaluation.setDecision_making(tomaDesicion);
                //valores
                evaluation.setPunctuality(puntual);
                evaluation.setHonesty(honesto);
                evaluation.setOrganized(organizado);
                evaluation.setResponsibility(responsable);
                evaluation.setRespect(respeto);
                //crecimiento profecional


                evaluation.setPerformance(desempeño);
                evaluation.setEfficiency(eficiencia);
                evaluation.setProductivity(productividad);
                evaluation.setInnovative(innovacion);
                evaluation.setAvg_grade(avg);
                evaluation.setComment(new String(request.getParameter("comment").getBytes("ISO-8859-1"), "UTF-8"));

                String message = service.updatePracticantesEva(evaluation) ?
                        "Create success" :
                        "Error while creating";
                log(message);

                Employee employee1 = service.getEmployeeById(idE);

                request.setAttribute("employee", employee1);
                request.setAttribute("action", "edit");


                RequestDispatcher dispatcher =
                        request.getRequestDispatcher(MenuAdmin_URI);
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
                if (employeeType==1){
                actionUri =  EDItEmployee;
                break;}
                else{
                    actionUri =  EDItEmployeeComun;
                    break;}


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

                if (employeeType==1){
                    actionUri = MenuAdmin_URI;
                    break;}
                else{
                    actionUri =  MenuEmp_URI;
                    break;}

            }

            case "editCorre": {
                Employee employee = service.getEmployeeById(idE
                );


                request.setAttribute("employee", employee);
                request.setAttribute("action", "edit");

                if (employeeType==1){
                    actionUri = UpdateEmpEmail_URI;
                    break;}
                else{
                    actionUri =  UpdateEmpEmailComun_URI;
                    break;}


            }

            case "evaluar": {
                EmpEvaluado =Integer.parseInt(request.getParameter("idEmpleado"));

                Employee employee = service.getEmployeeById(EmpEvaluado);
                request.setAttribute("employee", employee);
                request.setAttribute("action", "idEmpleado");

                if (idA ==5){

                actionUri = evaluar_uri;
                break;}
                if (idA ==4){

                    actionUri = evaluarAdministracion_uri;
                    break;}
                if (idA ==3){

                    actionUri = evaluarProduccion_uri;
                    break;}
                if (idA ==2){

                    actionUri = evaluarMarketing_uri;
                    break;}
                else{

                    actionUri = evaluarInformatica_uri;
                    break;}
            }

            case "addCv": {

                EmpCv =Integer.parseInt(request.getParameter("idEmpleado"));
                actionUri = addCv_uri;
                break;
            }
            case "Perfil": {
                EmpPerfil=Integer.parseInt(request.getParameter("idEmpleado"));

                Employee employee = service.getEmployeeById(EmpPerfil);
                request.setAttribute("employee", employee);
                request.setAttribute("action", "Perfil");
                actionUri = perfilEmployee_Adminuri;
                break;
            }

            case "PerfilEmpleado": {

                Employee employee = service.getEmployeeById(idE);
                request.setAttribute("employee", employee);
                request.setAttribute("action", "PerfilEmpleado");
                actionUri = perfilEmployee_uri;
                break;
            }

            case "EvaluationHistorial": {
                EmpEvaluado =Integer.parseInt(request.getParameter("idEmployee"));
                areaId =Integer.parseInt(request.getParameter("idArea"));

                Employee employee = service.getEmployeeById(EmpEvaluado);
                request.setAttribute("employee", employee);
                request.setAttribute("action", "Perfil");
                if (areaId ==5){

                    actionUri = perfilHistorialEvaluEmployee_uri;
                    break;}
                if (areaId ==4){

                    actionUri = perfilHistoEvaluAdminitracionEmployee_uri;
                    break;}
                if (areaId ==3){

                    actionUri = perfilHistoProduccionEmployee_uri;
                    break;}
                if (areaId ==2){

                    actionUri = perfilHistoEvaluMarketingEmployee_uri;
                    break;}
                else{

                    actionUri = perfilHistoEvaluInformaticaEmployee_uri;
                    break;}
            }

            case "EvaluationHistorialAdmin": {
                EmpEvaluado =Integer.parseInt(request.getParameter("idEmployee"));
                areaId =Integer.parseInt(request.getParameter("idArea"));

                Employee employee = service.getEmployeeById(EmpEvaluado);
                request.setAttribute("employee", employee);
                request.setAttribute("action", "Perfil");
                if (areaId ==5){

                    actionUri = perfilHistorialEvaluEmployee2_uri;
                    break;}
                if (areaId ==4){

                    actionUri = perfilHistoEvaluAdminitracionEmployee2_uri;
                    break;}
                if (areaId ==3){

                    actionUri = perfilHistoProduccionEmployee2_uri;
                    break;}
                if (areaId ==2){

                    actionUri = perfilHistoEvaluMarketingEmployee2_uri;
                    break;}
                else{

                    actionUri = perfilHistoEvaluInformaticaEmployee2_uri;
                    break;}
            }

            case "PerfilAdmin": {


                Employee employee = service.getEmployeeById(idE);
                request.setAttribute("employee", employee);
                request.setAttribute("action", "Perfil");
                actionUri = PerfilAdmin_uri;
                break;
            }
            case "PerfilAdminFempleado": {


                Employee employee = service.getEmployeeById(idE);
                request.setAttribute("employee", employee);
                request.setAttribute("action", "Perfil");
                actionUri = perfilEmployee_Adminuri;
                break;
            }


            case "PerfilAdmin2": {
                evaluador =Integer.parseInt(request.getParameter("idEmployee"));

                Employee employee = service.getEmployeeById(evaluador);
                request.setAttribute("employee", employee);
                request.setAttribute("action", "Perfil");
                actionUri = PerfilAdmin_Empleadouri;
                break;
            }

            case "EditarEvaluacion": {
                idEvaluacion =Integer.parseInt(request.getParameter("idEvaluacion"));
                int year = Integer.parseInt(request.getParameter("year"));
                int month = Integer.parseInt(request.getParameter("month"));
                int day = Integer.parseInt(request.getParameter("day"));


                if(month==12) {
                    month=1;
                    year++;
                    Timestamp timeNow = new Timestamp(System.currentTimeMillis());
                    Timestamp timeLimite = Timestamp.valueOf(year + "-" + month + "-" + day + " 0:0:0.0");
                    if (timeNow.before(timeLimite)){

                        if (idA ==5){
                            actionUri = evaluar_uriEditar;
                            break;}
                        if (idA ==4){

                            actionUri = evaluarAdministracion_uriEditar;
                            break;}
                        if (idA ==3){

                            actionUri = evaluarProduccion_uriEditar;
                            break;}
                        if (idA ==2){

                            actionUri = evaluarMarketing_uriEditar;
                            break;}
                        else{

                            actionUri = evaluarInformatica_uriEditar;
                            break;}

                    }
                    else{
                        actionUri=Notime_uri;
                        break;
                    }


                }else {
                    month++;
                    Timestamp timeNow = new Timestamp(System.currentTimeMillis());
                    Timestamp timeLimite = Timestamp.valueOf(year + "-" + month + "-" + day + " 0:0:0.0");

                    if (timeNow.before(timeLimite)){

                        if (idA ==5){
                            actionUri = evaluar_uriEditar;
                            break;}
                        if (idA ==4){

                            actionUri = evaluarAdministracion_uriEditar;
                            break;}
                        if (idA ==3){

                            actionUri = evaluarProduccion_uriEditar;
                            break;}
                        if (idA ==2){

                            actionUri = evaluarMarketing_uriEditar;
                            break;}
                        else{

                            actionUri = evaluarInformatica_uriEditar;
                            break;}

                    }
                    else{
                        actionUri=Notime_uri;
                        break;
                    }


                }




            }


            case "EditarCvEmpleado": {
                idCv = Integer.parseInt(request.getParameter("idCv"));
                int year = Integer.parseInt(request.getParameter("year"));
                int month = Integer.parseInt(request.getParameter("month"));
                int day = Integer.parseInt(request.getParameter("day"));


                if (month == 12) {
                    month = 1;
                    year++;
                    Timestamp timeNow = new Timestamp(System.currentTimeMillis());
                    Timestamp timeLimite = Timestamp.valueOf(year + "-" + month + "-" + day + " 0:0:0.0");
                    if (timeNow.before(timeLimite)) {

                        actionUri = EditarCv;
                        break;

                    } else {
                        actionUri = noTimeCv;
                        break;
                    }


                } else {
                    month++;
                    Timestamp timeNow = new Timestamp(System.currentTimeMillis());
                    Timestamp timeLimite = Timestamp.valueOf(year + "-" + month + "-" + day + " 0:0:0.0");

                    if (timeNow.before(timeLimite)) {
                        actionUri = EditarCv;
                        break;


                    } else {
                        actionUri = noTimeCv;
                        break;
                    }


                }
            }



            default:
                actionUri = MenuRoot_URI;
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(actionUri);
        dispatcher.forward(request, response);
    }
}
