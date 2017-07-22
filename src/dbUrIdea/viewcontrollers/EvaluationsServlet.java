package dbUrIdea.viewcontrollers;

import dbUrIdea.models.Company;
import dbUrIdea.models.Employee;
import dbUrIdea.models.Evaluation;
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
 * Created by Yoshinon on 11/07/2017.
 */
@WebServlet(name = "EvaluationsServlet",urlPatterns = "/eva")
public class EvaluationsServlet extends HttpServlet {

    HRService service = new HRService();
    // Action View Paths
    public static String EVAL_EDIT_URI = "/editEvaluation.jsp";
    public static String EVAL_ADD_URI = "/newEvaluation.jsp";
    public static String EVAL_INDEX_URI = "/listEvaluation.jsp";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,  IOException {

        String action = request.getParameter("action");
        switch(action) {
            case "update": {
                //Company company = service.getCompanyById(request.getParameter("id"));

                //Evaluation evaluation = service.getEvaluationById(Integer.parseInt(request.getParameter("id")));
                Evaluation evaluation = new Evaluation();
                evaluation.setId(Integer.parseInt(request.getParameter("id")));

                evaluation.setGrade(Integer.parseInt(request.getParameter("grade")));
                String message = service.updateEvaluation(evaluation) ?
                        "Update success" :
                        "Error while updating";
                log(message);
            break;
            }
            case "create": {


                //Company company= service.getComanyByEmailId(Integer.parseInt(request.getParameter("EmailId")));

                Company company =new Company();
                Evaluation evaluation = new Evaluation();
                Employee employee =new Employee();
                evaluation.setCompany(company.setId(Integer.parseInt(request.getParameter("id_company"))));
                evaluation.setIdEmployee(employee.setId(Integer.parseInt(request.getParameter("id_evaluator"))));
                evaluation.setIdUserEmployee(employee.setId(Integer.parseInt(
                        request.getParameter("id_user_employee"))));
               // evaluation.setId(Integer.parseInt(request.getParameter("id")));
                evaluation.setGrade(Double.parseDouble(request.getParameter("grade")));
                String message = service.createEvaluation(evaluation) ?
                        "Create success" :
                        "Error while creating";
                log(message);
                break;


            }

        }

        RequestDispatcher dispatcher =
                request.getRequestDispatcher(EVAL_INDEX_URI);
        dispatcher.forward(request, response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        String actionUri;
        switch(action) {
            case "add": {
                actionUri = EVAL_ADD_URI;
                request.setAttribute("action", "add");
                break;
            }
            case "edit": {
                Evaluation evaluation = service.getEvaluationById(
                        Integer.parseInt(request.getParameter("id")));
                request.setAttribute("evaluation", evaluation);
                request.setAttribute("action", "edit");
                actionUri = EVAL_EDIT_URI;
                break;
            }
            default:
                actionUri = EVAL_INDEX_URI;
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(actionUri);
        dispatcher.forward(request, response);
    }
}