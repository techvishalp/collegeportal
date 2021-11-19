package collegeportal.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import collegeportal.beans.Student_bean;
import collegeportal.student.AdminTask;

/**
 * Servlet implementation class EditStudentProfile
 */
@WebServlet("/EditStudentProfile")
public class EditStudentProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditStudentProfile() {
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
		 String login=request.getParameter("userloginid");
		    String pswrd=request.getParameter("userpass");
		    String name=request.getParameter("username");
		    String email=request.getParameter("useremail");
		    String phn=request.getParameter("userphone");
		    
		    
		    
		    Student_bean st=new Student_bean();
		    st.setLoginid(login);
		    st.setPassword(phn);
		    st.setName(name);
		    st.setEmail(email);
		    st.setPhone(phn);
		    
		  
		    
		    
		   AdminTask task=new AdminTask();
		    int status=task.editProfile(st);
		    
		    if(status>0)
		    {
		    	
		    	
		    	
		    	response.sendRedirect("/collegeportal/parent/viewprofile.jsp");
		    }
		    
		    
		    
		    
		    
		    
		    
		    


}}