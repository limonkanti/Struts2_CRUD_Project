package UserBean;

public class User2 {

    public String uname;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String execute() {
        int i = DeleteDao.delete(this);
        if (i > 0) {
            return "success";
        }
        return "error";

    }
}
