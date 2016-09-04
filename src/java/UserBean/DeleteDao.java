
package UserBean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class DeleteDao {
    
     public static int delete(User2 u)
    {
        int status =0;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_prescription","root","12345");
            PreparedStatement ps=con.prepareStatement("delete from user_registration where uname=?");
            ps.setString(1, u.getUname());
           
            status=ps.executeUpdate();
            
        }
        catch(Exception e)
        {
            System.out.println("Error is:\t"+e.toString());
        }
        return status;
    }
    
}
