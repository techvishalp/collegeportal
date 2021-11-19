package college.commontask;


import collegeportal.beans.Login_Credentials;
import collegeportal.dbinfo.CrudOperation;

import java.sql.*;

public class LoginTask 
{
	private Connection con;
public String login(Login_Credentials lc)
{
	con=CrudOperation.createConnection();
	PreparedStatement ps=null;
	
	String role="invalid";
	String strlogin="select * from login where userid=? and userpass=?";
	try {
	ps=con.prepareStatement(strlogin);
	ps.setString(1, lc.getId());
	ps.setString(2, lc.getPassword());
	System.out.println(ps);
	
	ResultSet rs =ps.executeQuery();
	
	
	
	
	if(rs.next())
	{
		
		role=rs.getString("usertype");
		return role;
		
	}
	}
	catch(SQLException se)
	{
		se.printStackTrace();
	}
return role;

}
}
