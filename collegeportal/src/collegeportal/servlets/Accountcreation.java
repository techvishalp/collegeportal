package collegeportal.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import collegeportal.beans.Login_Credentials;
import collegeportal.beans.Message;
import collegeportal.beans.Student_bean;
import collegeportal.student.AdminTask;

/**
 * Servlet implementation class Accountcreation
 */
@WebServlet("/Accountcreation")
public class Accountcreation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Accountcreation() {
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
		String password=request.getParameter("userpass");
		String name=request.getParameter("username");
		String email=request.getParameter("useremail");
		String phone=request.getParameter("userphone");
		
		
		
		Student_bean std=new Student_bean(login,password,name,email,phone);
		Login_Credentials credentials=new Login_Credentials(login,password,"std");
		AdminTask task=new AdminTask();
		boolean status=task.accountcreation(std,credentials);
		if(status==true) 
		{
			request.setAttribute("msg", Message.REGISTRATION_SUCCESS);
			RequestDispatcher dispatcher =request.getRequestDispatcher("/jsp/message.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			request.setAttribute("msg", Message.REGISTRATION_FAILED);
			RequestDispatcher dispatcher =request.getRequestDispatcher("/jsp/message.jsp");
			dispatcher.forward(request, response);
			
		}
		
	}

}
