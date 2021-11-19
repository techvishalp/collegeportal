



<%@page import="collegeportal.beans.*"%>


<% 
String uid=(String)session.getAttribute("session_userid");
if(uid==null||session.isNew())//return new if session is new
{
	request.setAttribute("msg",Message.INVALID_ACCESS);
RequestDispatcher dispatcher=request.getRequestDispatcher("/jsp/login.jsp");

dispatcher.forward(request,response);
return ;
}

%>



