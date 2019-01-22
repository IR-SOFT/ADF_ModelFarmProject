package view.backing;

import javax.annotation.PostConstruct;

import javax.faces.context.FacesContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import oracle.adf.share.http.HttpServletRequestScopeAdapter;

public class Logout {
    public Logout() {
    }

    public String logout_action() {
        // Add event code here...
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();  
        System.out.println("User logged out successfully... Session Cleared");
//            return "/faces/login.jsf?faces-redirect=true";
        
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        HttpSession session = request.getSession(false);
        if (session == null) {
            System.out.println("No session available");
        } else {
            System.out.println("This is old session");
        }

        return "logged out";
    }
}
