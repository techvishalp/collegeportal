package collegeportal.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import collegeportal.beans.Login_Credentials;
import collegeportal.beans.Message;
import collegeportal.beans.Parent;
import collegeportal.parent.ParentTask;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("uid");
		System.out.println(id);
		PrintWriter out=response.getWriter();
		if(id.equals("Saurabh")) {
			out.print("UserId Already Exist");
		}
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, 
 response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid=request.getParameter("txtuserid");
		String userpass=request.getParameter("txtuserpass");
		String username=request.getParameter("txtusername");
		String userphone=request.getParameter("txtuserphone");
		String cmbcity=request.getParameter("cmbcity");
		String gender=request.getParameter("gender");
		if(cmbcity.equalsIgnoreCase("others"))
			cmbcity=request.getParameter("txtothers");
		String[]langguage=request.getParameterValues("language");
		//System.out.printtln(language.length);
		
		String lang="";
		for(int i=0;i<langguage.length;i++)
		{
			//System.out.println("in for loop "+language[i]);
			lang=lang+langguage[i]+",";
		}
		
		Parent parent= new Parent(userid,username,gender,lang,cmbcity,userphone);
		Login_Credentials credentials=new Login_Credentials(userid,userpass,"parent");
		
		 ParentTask task=new ParentTask();
		 boolean status=task.registration(parent,credentials );
		 if(status==true)
				 
		 {
		
		
		request.setAttribute("msg", Message.REGISTRATION_SUCCESS);
		RequestDispatcher dispatcher =request.getRequestDispatcher("/jsp/message.jsp");
		dispatcher.forward(request, response);
		
		 }
		
		
	}

}
