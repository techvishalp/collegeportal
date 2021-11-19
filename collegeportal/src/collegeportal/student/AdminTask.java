package collegeportal.student;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import collegeportal.beans.Login_Credentials;
import collegeportal.beans.News_bean;
import collegeportal.beans.Parent;
import collegeportal.beans.Student_bean;
import collegeportal.dbinfo.CrudOperation;
import collegeportal.servlets.News;
public class AdminTask {
	
	ArrayList<Parent>parentlist=new ArrayList<Parent>();
	ArrayList<News_bean>newslist=new ArrayList<News_bean>();
	
	
	private Connection con;
	
	
	
	
	
	
	
	
	
	
	
	public boolean addnews(News_bean n)
	{
		
		con=CrudOperation.createConnection();
		PreparedStatement ps=null;
		
		String snews="insert into news( subject, content, date) values(?,?,?)";
		try {
			ps=con.prepareStatement(snews);
			ps.setString(1, n.getSubject());
			ps.setString(2,n.getContent());
		    ps.setString(3,n.getDate() );
			System.out.println(ps);
			
			int data=ps.executeUpdate();
			  System.out.println(data);
			
			


		
			
		}
		catch(SQLException se) 
		{
		
		se.printStackTrace();
		}
		return true;
	}
	
	
	
	
	public boolean deleteParents(String[]ids)
	{
		con=CrudOperation.createConnection();
		boolean status=false;
		try {
			String strdelete_parent="delete from parent_details where id=?";
			String strdelete_login="delete from login where userid=?";
			PreparedStatement psparent =con.prepareStatement(strdelete_parent);
			PreparedStatement pslogin=con.prepareStatement(strdelete_login);
			for(int i=0;i<ids.length;i++)
			{
				psparent.setString(1,ids[i]);
				pslogin.setString(1,ids[i]);
				System.out.println(psparent);
				System.out.println(pslogin);
				psparent.addBatch();
				pslogin.addBatch();
			}
			int[] parent_status=psparent.executeBatch();
			int[] login_status=pslogin.executeBatch();
			
			int pflag=0,lflag=0;
			
			for(int i=0;i<parent_status.length;i++)
			{
				
				
				if(parent_status[i]<0) 
				
				{
					
					lflag=1;
					break;
				}
			}
			
			for(int i=0;i<login_status.length;i++)
			{
				
				
				if(login_status[i]<0) 
				
				{
					
					lflag=1;
					break;
				}
			}
			
			if(pflag==0 && lflag==0)
				status=true;
		}
		catch(SQLException se)

		{
			
			try {
			con.rollback();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			
		se.printStackTrace();	
		}
		return status;
	}
	
	
	
	public int editProfile(Student_bean st)
	{
		int updatestatus=0;
		con=CrudOperation.createConnection();
		
		String strupdate="update student_table set loginid=?,password=? ,name=? ,email=? ,phone=?  where loginid=?";
		try {
		PreparedStatement ps=con.prepareStatement(strupdate);
		ps.setString(1, st.getLoginid());
		ps.setString(2, st.getPassword());
		ps.setString(3, st.getName());
		ps.setString(3, st.getEmail());
		ps.setString(3, st.getPhone());
		System.out.println(ps);
		updatestatus=ps.executeUpdate();
		System.out.println(updatestatus);
		
		
		}
		catch(SQLException se)
		{
			
			se.printStackTrace();
		}
		return updatestatus;
	}
	
	
	
	
	public  ArrayList<Parent> viewParents()
	{
		
		if(!parentlist.isEmpty())
			parentlist.clear();
		con=CrudOperation.createConnection();
		
		try {
			String strsql="select * from parent_details";
					
					PreparedStatement ps=con.prepareStatement(strsql);
					ResultSet rs=ps.executeQuery();
					
					while (rs.next()) {
						
						Parent p=new Parent();
						p.setName(rs.getString("name"));
						String city=rs.getString("city");
						p.setCity(city);
						String Id=rs.getString("id");
						p.setId(Id);
						p.setPhone(rs.getString("phone"));
						parentlist.add(p);
						
					}
					
		}
		catch(SQLException se)
		{
			se.printStackTrace();	
		}
		return parentlist;
	}
	
	
	
	
	
	public  ArrayList<News_bean> viewNews()
	{
		
		if(!newslist.isEmpty())
			newslist.clear();
		con=CrudOperation.createConnection();
		
		try {
			String strsql="select * from news order by date desc limit 1";
					
					PreparedStatement ps=con.prepareStatement(strsql);
					ResultSet rs=ps.executeQuery();
					
					while (rs.next()) {
						
					News_bean news=new News_bean();
					news.setNewsid(rs.getInt("newsId"));
					news.setSubject(rs.getString("subject"));
					news.setContent(rs.getString("content"));
					news.setDate(rs.getString("date"));
					newslist.add(news);
									
					}
					
		}
		catch(SQLException se)
		{
			se.printStackTrace();	
		}
		return newslist;
	}
	
	
	
	
	
	public  News_bean viewNews(int id)
	{
		
		
		con=CrudOperation.createConnection();
		News_bean news=null;
		
		try {
			String strsql="select * from news where newsId=?";
					
					PreparedStatement ps=con.prepareStatement(strsql);
					ps.setInt(1, id);
					ResultSet rs=ps.executeQuery();
					
					if (rs.next()) {
				
						
						news=new News_bean();
					news.setNewsid(rs.getInt("newsId"));
					news.setSubject(rs.getString("subject"));
					news.setContent(rs.getString("content"));
					news.setDate(rs.getString("date"));
					
									
					}
					
		}
		catch(SQLException se)
		{
			se.printStackTrace();	
		}
		return news;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	ArrayList<Student_bean>studentlist=new ArrayList<Student_bean>();
	public  ArrayList<Student_bean> viewStudents()
	{
		
		if(!studentlist.isEmpty())
			studentlist.clear();
		con=CrudOperation.createConnection();
		
		try {
			String strsql="select * from Student_table";
					
					PreparedStatement ps=con.prepareStatement(strsql);
					ResultSet rs=ps.executeQuery();
					
					while (rs.next()) {
						
						Student_bean  st=new Student_bean();
						st.setName(rs.getString("name"));
						
						st.getName();
						st.setPhone(rs.getString("phone"));
						studentlist.add(st);
						
					}
					
		}
		catch(SQLException se)
		{
			se.printStackTrace();	
		}
		return studentlist;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
public Student_bean viewProfile(String userid)
	
	{
		
	PreparedStatement ps=null;
	ResultSet rs=null;
	String strsql="select * from student_table where loginid=?";
	con=CrudOperation.createConnection();
	try {
		ps=con.prepareStatement(strsql);
		ps.setString(1, userid);
		
		
		rs=ps.executeQuery();
		if(rs.next())
		{
			
		String loginid=rs.getString("loginid")	;
		String pswrd=rs.getString("password");
		String name=rs.getString("name");
		String email=rs.getString("email");
		String phone=rs.getString("phone");
		
		
		 Student_bean s=new Student_bean(loginid,pswrd,name,email,phone);
		return s;
		}
			
			
	}
		catch(SQLException se)
	{
			se.printStackTrace();
			
	}
		return null;
		
		
	}
	
	
	
	
	
	
	
	public boolean accountcreation(Student_bean s,Login_Credentials lc)
	{
	con=CrudOperation.createConnection();
	PreparedStatement pslogin=null,psstudent=null;
	String strlogin="insert into login values(?,?,?)";
	String strstudent="insert into student_table(loginid, password, name, email, phone) values(?,?,?,?,?)";
	try {
		pslogin=con.prepareStatement(strlogin);
		psstudent=con.prepareStatement(strstudent);
		pslogin.setString(1, s.getLoginid());
		pslogin.setString(2, s.getPassword());
	    pslogin.setString(3, lc.getRole());
		System.out.println(pslogin);
		
		psstudent.setString(1, s.getLoginid());
		psstudent.setString(2, s.getPassword());
		psstudent.setString(3, s.getName());
		psstudent.setString(4, s.getEmail());
		psstudent.setString(5, s.getPhone());
		System.out.println(psstudent);
		int login_status=pslogin.executeUpdate();
		  System.out.println(login_status);
		  
		  
		int student_status=psstudent.executeUpdate();
		System.out.println(student_status);
		if(login_status>0 && student_status>0) {
		return true;
		}
	
		
	}
	catch(SQLException se) 
	{
	
	se.printStackTrace();
	}
	
	finally {
		try {
			if(pslogin!=null)
				pslogin.close();
			if(psstudent!=null)
				psstudent.close();
			
			
			
		}
		
		
		catch(SQLException se){
			se.printStackTrace();
		}
	}
	
	
	return false;

}
}