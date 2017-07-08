package dbUrIdea.viewcontrollers;

import dbUrIdea.models.Commentary;
import dbUrIdea.models.EmailAddress;
import dbUrIdea.services.HRService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Yoshinon on 8/07/2017.
 */
@WebServlet(name = "CommentsServlet",urlPatterns ="/com")
public class CommentsServlet extends HttpServlet {

    HRService service = new HRService();
    // Action View Paths
    public static String COMMS_EDIT_URI = "/editCommentary.jsp";
    public static String COMMS_ADD_URI = "/newCommentary.jsp";
    public static String COMMS_INDEX_URI = "/listCommentary.jsp";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,  IOException {

        String action = request.getParameter("action");
        switch(action) {
            case "update": {
                Commentary commentary = service.getCommentaryById(request.getParameter("id"));
                commentary.setCommentaryType(Integer.parseInt(request.getParameter("commentaryType")));
                commentary.setDetail(request.getParameter("detail"));
                String message = service.updateCommentary(commentary) ?
                        "Update success" :
                        "Error while updating";
                log(message);
            }

        }

        RequestDispatcher dispatcher =
                request.getRequestDispatcher(COMMS_INDEX_URI);
        dispatcher.forward(request, response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        String actionUri;
        switch(action) {
            case "add": {
                actionUri = COMMS_ADD_URI;
                request.setAttribute("action", "add");
                break;
            }
            case "edit": {
                Commentary commentary = service.getCommentaryById(request.getParameter("id"));
                request.setAttribute("commentary", commentary);
                request.setAttribute("action", "edit");
                actionUri = COMMS_EDIT_URI;
                break;
            }
            default:
                actionUri = COMMS_INDEX_URI;
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(actionUri);
        dispatcher.forward(request, response);
    }
}