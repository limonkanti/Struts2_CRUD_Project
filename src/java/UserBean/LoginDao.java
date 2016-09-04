package UserBean;
import java.sql.*;


public class LoginDao 
{
    public static boolean validate(String username,String password)
    {
        boolean status =true;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_ms","root","12345");
            PreparedStatement ps=con.prepareStatement("select username,password from registration where username=? and password=?");
            ps.setString(1, username);
            ps.setString(2, password);
           ResultSet rs=ps.executeQuery();
           status=rs.next();
        }
        catch(Exception e)
        {
            System.out.println("Error is:\t"+e.toString());
        }
        return status;
    }
    
}
