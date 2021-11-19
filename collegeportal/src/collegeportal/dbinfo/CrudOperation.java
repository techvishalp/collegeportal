package collegeportal.dbinfo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CrudOperation 
{
private static Connection connection;
public static Connection createConnection()
{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/collegedb","root","root");
		
		
	}
	catch(ClassNotFoundException|SQLException se)
	
	{
		se.printStackTrace();
		
		
	}
	return connection;
	

}}
/*public static void main(String[] args) {
	System.out.println(createConnection());
}*/
