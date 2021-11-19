package collegeportal.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import collegeportal.beans.Message;
import collegeportal.beans.News_bean;
import collegeportal.student.AdminTask;

/**
 * Servlet implementation class News
 */
@WebServlet("/News")
public class News extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public News() {
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
		String subject=request.getParameter("Subject");
		String content=request.getParameter("Content");
		String dte=request.getParameter("date");
		News_bean nb=new News_bean(subject,content,dte);
		AdminTask at=new AdminTask();
		boolean status=at.addnews(nb);
				if(status==true)
				{
		request.setAttribute("msg", Message.NEWS);
		RequestDispatcher dispatcher =request.getRequestDispatcher("/jsp/addnews.jsp");
		dispatcher.forward(request, response);
	}

}
}
