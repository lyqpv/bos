package web.action;

import com.opensymphony.xwork2.ActionSupport;

/**  
 * 
 */
public class UserAction extends ActionSupport {

    private String uid;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
    
   public String getUser() {
       
       return SUCCESS;
   }
   
    
}
  
