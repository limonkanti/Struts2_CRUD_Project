
package UserBean;

import java.sql.*;


public class RegisterDao 
{
    public static int register(User u)
    {
        int status =0;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_prescription","root","12345");
            PreparedStatement ps=con.prepareStatement("insert into user_registration(uname,upass) values (?,?)");
            ps.setString(1, u.getUname());
            ps.setString(2, u.getUpass());
            status=ps.executeUpdate();
            
        }
        catch(Exception e)
        {
            System.out.println("Error is:\t"+e.toString());
        }
        return status;
    }
    
}
