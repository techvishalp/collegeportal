package collegeportal.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import collegeportal.student.AdminTask;

/**
 * Servlet implementation class DeleteParents
 */
@WebServlet("/DeleteParents")
public class DeleteParents extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AdminTask task;
	@Override
	public void init() throws ServletException {
		
		
		task=new AdminTask();
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteParents() {
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
		
		String[]parentids=request.getParameterValues("chkdelete");
		boolean status=task.deleteParents(parentids);
		if(status)
		{
			
			response.sendRedirect("/collegeportal/admin/viewparents.jsp");
		}
		
		
	}

}
