
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author 821214
 */
public class NoteServlet extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
      /*  
        if (edit == true){
        getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp")
                .forward(request, response);  
      }
      else {
          getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request, response);
      }
      
      */
    
        getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp")
                .forward(request, response);


                
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        
       Note note = new Note(title, content); 
       request.setAttribute("note", note);
       
      getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request, response); 
       
            
    }
}