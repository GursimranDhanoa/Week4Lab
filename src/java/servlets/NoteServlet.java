
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                    .forward(request, response);              
                return;
            
    }
}