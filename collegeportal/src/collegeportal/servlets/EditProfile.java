package collegeportal.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import collegeportal.beans.Parent;
import collegeportal.parent.ParentTask;

/**
 * Servlet implementation class EditProfile
 */
@WebServlet("/EditProfile")
public class EditProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    String phone=request.getParameter("txtphone");
    String city=request.getParameter("txtcity");
    
    String id=request.getParameter("txthidden");
  
  /* HttpSession hs=request.getSession(false); user id is accessed via hidden field
   String id=(String)hs.getAttribute("session_userid");*/
    
    
    
    
    
    
    
    
    Parent p=new Parent();
    p.setCity(city);
    p.setPhone(phone);
    p.setId(id);
    
    
    
    ParentTask task=new ParentTask();
    int status=task.editProfile(p);
    
    if(status>0)
    {
    	
    	
    	
    	response.sendRedirect("/collegeportal/parent/viewprofile.jsp");
    }
    
    
    
    
    
    
    
    
	}

}
