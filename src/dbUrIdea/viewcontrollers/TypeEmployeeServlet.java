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
    public static String  evaluarInformatica_uri= "/_EvaluarInformatica.jsp";
    public static String  evaluarInformatica2_uri= "/_EvaluarInformatica2.jsp";
    public static String  evaluarInformatica3_uri= "/_EvaluarInformatica3.jsp";

    public static String  evaluarAdministracion_uri= "/_EvaluarAdministracion.jsp";
    public static String  evaluarAdministracion2_uri= "/_EvaluarAdministracion2.jsp";
    public static String  evaluarAdministracion3_uri= "/_EvaluarAdministracion3.jsp";

    public static String  evaluarProduccion_uri= "/_EvaluarProduccion.jsp";
    public static String  evaluarProduccion2_uri= "/_EvaluarProduccion2.jsp";
    public static String  evaluarProduccion3_uri= "/_EvaluarProduccion3.jsp";

    public static String  evaluarMarketing_uri= "/_EvaluarMaketing.jsp";
    public static String  evaluarMarketing2_uri= "/_EvaluarMaketing2.jsp";
    public static String  evaluarMarketing3_uri= "/_EvaluarMaketing3.jsp";

    public static String  evaluar2_uri= "/_Evaluar2.jsp";
    public static String  evaluar3_uri= "/_Evaluar3.jsp";
    public static String  addCv_uri= "/_NCv.jsp";

    public static String perfilEmployee_uri = "/PerfilPrueba1.jsp";
    public static String perfilHistorialEvaluEmployee_uri = "/PerfilHistorialEvaluation1.jsp";
    public static String perfilHistoEvaluAdminitracionEmployee_uri = "/PerfilHistorialEvaluationAdministracion.jsp";
    public static String perfilHistoEvaluInformaticaEmployee_uri = "/PerfilHistorialEvaluationInformatica.jsp";
    public static String perfilHistoEvaluMarketingEmployee_uri = "/PerfilHistorialEvaluationMarketing.jsp";
    public static String perfilHistoProduccionEmployee_uri = "/PerfilHistorialEvaluationProduccion.jsp";

    String email;

    int idE ;
    int employeeType;
    int EmailId;
    int idCom;
    int idA;

    int EmpEvaluado;
    int EmpCv;
    int EmpPerfil;
    int areaId;





    //evaluacion1
    float competitivo;
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

                email=request.getParameter("emailData");
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
                evaluation.setComment(request.getParameter("comment"));

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
                evaluation.setComment(request.getParameter("comment"));

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
                evaluation.setComment(request.getParameter("comment"));

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
                evaluation.setComment(request.getParameter("comment"));

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
                evaluation.setComment(request.getParameter("comment"));

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
