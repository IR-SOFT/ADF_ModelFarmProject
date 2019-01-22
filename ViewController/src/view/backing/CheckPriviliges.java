package view.backing;

import java.util.Map;

import javax.faces.context.FacesContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import oracle.adf.share.ADFContext;

public class CheckPriviliges {
    public CheckPriviliges() {
        super();
    }
    
    public String checkSession() {
        
//        FacesContext facesContext = FacesContext.getCurrentInstance();
//        HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);
//        session.setAttribute("userName", username);
//        session.setAttribute("userRole", userrole);

        //Testing/Getting value from session and printing in console
//        String usrName = session.getAttribute("userName").toString();
//        System.out.println(".........User Name stored in session is :..." + usrName + "...");

        
//        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
//        HttpSession session = request.getSession(false);
//        
//        if (session == null) {
//            
//            System.out.println("No session available from setup wala");
//            return "good";
//        } else {
//         
//            System.out.println("This is old session from setup wala");
//           return "bad";
//        }
        return  "okay";
    }
}
