package view.backing;

import javax.faces.context.FacesContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class CheckPriviliges {
    public CheckPriviliges() {
        super();
        HttpSession session= null;
    }
    
    public String checkSession() {
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        HttpSession session = request.getSession(false);
        if (session == null) {
            
            System.out.println("No session available");
            return "good";
        } else {
         
            System.out.println("This is old session");
           return "bad";
        }
    }
}
