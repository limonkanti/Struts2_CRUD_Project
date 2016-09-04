package UserBean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class FetchRecords {

    ArrayList<User> list = new ArrayList<User>();
    
    public ArrayList<User> getList() {
        return list;
    }
    
    public void setList(ArrayList<User> list) {
        this.list = list;
    }

    public String execute() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e_prescription", "root", "12345");
            PreparedStatement ps = con.prepareStatement("select * from user_registration");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setUname(rs.getString(1));
                u.setUpass(rs.getString(2));
                list.add(u);
                
            }
            
        } catch (Exception e) {
            System.out.println("Error is:\t" + e.toString());
        }
        return "view";
        
    }
    
}
