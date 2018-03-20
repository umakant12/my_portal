package login.db;
import java.sql.Connection;
import java.sql.DriverManager;
public class Provider {

	public static Connection con=null;
	public static Connection getConnection()
	{
		if(con==null)
		{
			try
			{
				Class.forName("oracle.jdbc.OracleDriver");
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		return con;
		
		
	}
}
