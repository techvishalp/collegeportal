package collegeportal.parent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import collegeportal.beans.City;
import collegeportal.beans.Feedback_Bean;
import collegeportal.beans.Login_Credentials;
import collegeportal.beans.Parent;
import collegeportal.dbinfo.CrudOperation;

public class ParentTask

    {
	Connection con;
	
	
	
	
	
	
	
	ArrayList<Hostel>hostelList=new ArrayList<Hostel>();
	
	public ArrayList<Hostel> viewHostel(String cityid)
	
	{
		Hostel h=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	String strsql="select * from parent_details where id=?";
	
	con=CrudOperation.createConnection();
	try {
		ps=con.prepareStatement(strsql);
		ps.setString(1, cityid);
		
		
		rs=ps.executeQuery();
		while(rs.next())
		{
			
		String name=rs.getString("hostelname")	;
		String address=rs.getString("address");
		int id=rs.getInt("hostelid");
		
		
		 h=new Hostel(id,name,address);
		  hostelList.add(h);
		
		
		}
			
			
	}
		catch(SQLException se)
	{
			se.printStackTrace();
			
	}
		return hostelList;
		
		
	}
	
	
	
	
	
	
	

	
	ArrayList<City>citylist=new ArrayList<City>();
	public  ArrayList<City> viewcity()
	{
		
		if(!citylist.isEmpty())
			citylist.clear();
		con=CrudOperation.createConnection();
		
		try {
			String strsql="select * from city";
					
					PreparedStatement ps=con.prepareStatement(strsql);
					ResultSet rs=ps.executeQuery();
					
					while (rs.next()) {
						
						City  c=new City();
						c.setName(rs.getString("cityname"));
						String city=rs.getString("cityid");
						c.setId(rs.getString("cityid"));
						
						
						citylist.add(c);
						
					}
					
		}
		catch(SQLException se)
		{
			se.printStackTrace();	
		}
		return citylist;
	}
	
	
	
	
	
	
	public int editProfile(Parent p)
	{
		int updatestatus=0;
		con=CrudOperation.createConnection();
		
		String strupdate="update parent_details set city=?,phone=? where id=?";
		try {
		PreparedStatement ps=con.prepareStatement(strupdate);
		ps.setString(1, p.getCity());
		ps.setString(2, p.getPhone());
		ps.setString(3, p.getId());
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
	
	
	
	public Parent viewProfile(String userid)
	
	{
		
	PreparedStatement ps=null;
	ResultSet rs=null;
	String strsql="select * from parent_details where id=?";
	con=CrudOperation.createConnection();
	try {
		ps=con.prepareStatement(strsql);
		ps.setString(1, userid);
		
		
		rs=ps.executeQuery();
		if(rs.next())
		{
			
		String name=rs.getString("name")	;
		String phone=rs.getString("phone");
		String city=rs.getString("city");
		String gender=rs.getString("gender");
		String language=rs.getString("languages");
		
		
		Parent p=new Parent(userid,name,phone,gender,language,city);
		p.setPicname(rs.getString("picname"));
		return p;
		}
			
			
	}
		catch(SQLException se)
	{
			se.printStackTrace();
			
	}
		return null;
		
		
	}
	
	
	
    
	
	
	
	
	
	
	
	
	
	
	public boolean registration(Parent p,Login_Credentials lc)
	{
		con=CrudOperation.createConnection();
		PreparedStatement pslogin,psparent=null;
		
		String strlogin="insert into login values(?,?,?)";
		String strparent="insert into parent_details(id, name, phone, languages, gender, city)values(?,?,?,?,?,?)";
		
		
		try {
			pslogin=con.prepareStatement(strlogin);
			psparent =con.prepareStatement(strparent);
			
			pslogin.setString(1, lc.getId());
			pslogin.setString(2, lc.getPassword());
			pslogin.setString(3,lc.getRole());
			System.out.println(pslogin);
			
			psparent.setString(1, p.getId());
			psparent.setString(2, p.getName());
			psparent.setString(3, p.getPhone());
			psparent.setString(4, p.getLanguages());
			psparent.setString(5, p.getGender());
			psparent.setString(6, p.getCity());
			System.out.println(psparent);
			
			int login_status=pslogin.executeUpdate();
			
			System.out.println(login_status);
			int parent_status=psparent.executeUpdate();
			System.out.println(parent_status);
			if(login_status>0&&parent_status>0)
			{
				
				return true;
			}
			
			
		}
		catch(SQLException se)
		{
			
			se.printStackTrace();
		}
		return false;
	}
	public boolean login(Login_Credentials lc)
	{
		
		return true;
	}

    









public boolean Feedback(Feedback_Bean fb)
{
	con=CrudOperation.createConnection();
PreparedStatement psfeedback=null;
	
	String strfeedback="insert into feedbackdata values(?,?,?,?)";
	
	try {
	
	
	psfeedback=con.prepareStatement(strfeedback);
	
	
	psfeedback.setString(1, fb.getFname());
	psfeedback.setString(2, fb.getEmailid());
	psfeedback.setString(3,fb.getPhone());
	System.out.println(psfeedback);
	
	int feedback_status=psfeedback.executeUpdate();
	
	System.out.println(feedback_status);
	
	
	if(feedback_status>0)
	{
		
		return true;
	}
	
	}
	


catch(SQLException se) {
	
	se.printStackTrace();
}
	return false;




}



public boolean uploadDocs(InputStream is,File f, String filename ) 
{
	
	try {
		int size= is.available();
		byte[]data=new byte[size];
		int status=is.read(data);
		FileOutputStream fos=new FileOutputStream(f+File.separator+filename);
		fos.write(data);
		fos.close();
		System.out.println("pic uploaded");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	return true;
}
public boolean updateProfilePic(String filename,String id)
{
	int updatestatus=0;
	
	con=CrudOperation.createConnection();
	
	String strupdate="update parent_details set picname=? where id=?";
	try {
	PreparedStatement ps=con.prepareStatement(strupdate);
	ps.setString(1, filename);
	ps.setString(2,id);
	System.out.println(ps);
	updatestatus=ps.executeUpdate();
	System.out.println(updatestatus);
	
	}
	catch(SQLException se)
	{
		
		se.printStackTrace();
	}
	
	
return true;

}
    }

	