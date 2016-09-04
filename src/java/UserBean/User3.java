
package UserBean;


public class User3 
{
    
    public String uname;
    public String uname1;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUname1() {
        return uname1;
    }

    public void setUname1(String uname1) {
        this.uname1 = uname1;
    }

   

    public String execute() {
        int i = UpdateDao.update(this);
        if (i > 0) {
            return "success";
        }
        return "error";

    }
    
}
