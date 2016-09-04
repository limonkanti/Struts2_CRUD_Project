
package UserBean;


public class User 
{
    private String uname;
    private String upass;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

   
    public String execute(){  
    int i=RegisterDao.register(this);
    if(i>0){  
    return "success";  
    }  
    return "error";  
}  
    
    
   
        
}
