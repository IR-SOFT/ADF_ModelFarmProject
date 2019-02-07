package view.backing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;

import javax.faces.component.html.HtmlPanelGroup;
import javax.faces.context.FacesContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichGridCell;
import oracle.adf.view.rich.component.rich.layout.RichGridRow;
import oracle.adf.view.rich.component.rich.layout.RichPanelAccordion;
import oracle.adf.view.rich.component.rich.layout.RichPanelGridLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;
import oracle.adf.view.rich.component.rich.nav.RichButton;

import oracle.adf.view.rich.component.rich.output.RichImage;
import oracle.adf.view.rich.component.rich.output.RichSpacer;

import oracle.jdbc.OracleDriver;


public class Login {
    
    // generating static variables to use in different scopes
    private static String role_master_id;
    private static String role_detail_pages_id;
    private static String role_detail_modules_id;
    private static String role_master_name;
    private static String pages_id;
    private static String page_name;
    private static String module_menu_id;
    private static String module_name;
    private static String view_rights;
    private static String module_view_rights;
    private static String add_rights;
    private static String edit_rights;
    private static String delete_rights;
    private static String save_rights;
    
    
    private RichForm f1;
    private RichDocument d1;
    private RichPanelAccordion pa1;
    private RichShowDetailItem pane1;
    private RichPanelGridLayout pgl1;
    private RichGridRow gr1;
    private RichGridCell gc1;
    private RichGridCell gc3;
    private RichGridRow gr2;
    private RichGridCell gc6;
    private RichGridCell gc8;
    private RichGridCell gc10;
    private RichGridRow gr3;
    private RichGridCell gc11;
    private RichGridCell gc13;
    private RichGridCell gc15;
    private RichGridRow gr4;
    private RichGridCell gc16;
    private RichGridCell gc18;
    private RichGridCell gc20;
    private RichGridRow gr5;
    private RichGridCell gc21;
    private RichGridCell gc23;
    private RichGridCell gc25;
    private RichGridRow gr6;
    private RichGridCell gc26;
    private RichGridCell gc28;
    private RichGridCell gc30;
    private RichGridRow gr7;
    private RichGridCell gc31;
    private RichGridCell gc33;
    private RichGridCell gc35;
    private RichGridRow gr8;
    private RichGridCell gc36;
    private RichGridCell gc38;
    private RichGridCell gc40;
    private RichInputText it1;
    private RichInputText it2;
    private RichButton b1;
    private RichButton b2;
    private RichButton b3;
    private RichPanelAccordion pa2;
    private RichShowDetailItem pane2;
    private RichSpacer s1;
    private RichSpacer s2;
    private RichSpacer s3;
    private HtmlPanelGroup pg1;
    private RichButton b4;
    private RichImage i1;
    private HtmlPanelGroup pg2;

    private RichPanelGroupLayout pgl2;

    private RichSpacer s5;
    private RichSpacer s6;
    private RichPanelGroupLayout pgl3;
    private RichImage i3;
    private RichSpacer s7;
    private RichSpacer s8;
    private RichSpacer s9;
    private RichPanelGroupLayout pgl4;
    private RichImage i4;


    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }


    public void setPa1(RichPanelAccordion pa1) {
        this.pa1 = pa1;
    }

    public RichPanelAccordion getPa1() {
        return pa1;
    }

    public void setPane1(RichShowDetailItem pane1) {
        this.pane1 = pane1;
    }

    public RichShowDetailItem getPane1() {
        return pane1;
    }

    public void setPgl1(RichPanelGridLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGridLayout getPgl1() {
        return pgl1;
    }

    public void setGr1(RichGridRow gr1) {
        this.gr1 = gr1;
    }

    public RichGridRow getGr1() {
        return gr1;
    }

    public void setGc1(RichGridCell gc1) {
        this.gc1 = gc1;
    }

    public RichGridCell getGc1() {
        return gc1;
    }


    public void setGc3(RichGridCell gc3) {
        this.gc3 = gc3;
    }

    public RichGridCell getGc3() {
        return gc3;
    }


    public void setGr2(RichGridRow gr2) {
        this.gr2 = gr2;
    }

    public RichGridRow getGr2() {
        return gr2;
    }

    public void setGc6(RichGridCell gc6) {
        this.gc6 = gc6;
    }

    public RichGridCell getGc6() {
        return gc6;
    }


    public void setGc8(RichGridCell gc8) {
        this.gc8 = gc8;
    }

    public RichGridCell getGc8() {
        return gc8;
    }


    public void setGc10(RichGridCell gc10) {
        this.gc10 = gc10;
    }

    public RichGridCell getGc10() {
        return gc10;
    }

    public void setGr3(RichGridRow gr3) {
        this.gr3 = gr3;
    }

    public RichGridRow getGr3() {
        return gr3;
    }

    public void setGc11(RichGridCell gc11) {
        this.gc11 = gc11;
    }

    public RichGridCell getGc11() {
        return gc11;
    }


    public void setGc13(RichGridCell gc13) {
        this.gc13 = gc13;
    }

    public RichGridCell getGc13() {
        return gc13;
    }


    public void setGc15(RichGridCell gc15) {
        this.gc15 = gc15;
    }

    public RichGridCell getGc15() {
        return gc15;
    }

    public void setGr4(RichGridRow gr4) {
        this.gr4 = gr4;
    }

    public RichGridRow getGr4() {
        return gr4;
    }

    public void setGc16(RichGridCell gc16) {
        this.gc16 = gc16;
    }

    public RichGridCell getGc16() {
        return gc16;
    }


    public void setGc18(RichGridCell gc18) {
        this.gc18 = gc18;
    }

    public RichGridCell getGc18() {
        return gc18;
    }


    public void setGc20(RichGridCell gc20) {
        this.gc20 = gc20;
    }

    public RichGridCell getGc20() {
        return gc20;
    }

    public void setGr5(RichGridRow gr5) {
        this.gr5 = gr5;
    }

    public RichGridRow getGr5() {
        return gr5;
    }

    public void setGc21(RichGridCell gc21) {
        this.gc21 = gc21;
    }

    public RichGridCell getGc21() {
        return gc21;
    }


    public void setGc23(RichGridCell gc23) {
        this.gc23 = gc23;
    }

    public RichGridCell getGc23() {
        return gc23;
    }


    public void setGc25(RichGridCell gc25) {
        this.gc25 = gc25;
    }

    public RichGridCell getGc25() {
        return gc25;
    }

    public void setGr6(RichGridRow gr6) {
        this.gr6 = gr6;
    }

    public RichGridRow getGr6() {
        return gr6;
    }

    public void setGc26(RichGridCell gc26) {
        this.gc26 = gc26;
    }

    public RichGridCell getGc26() {
        return gc26;
    }


    public void setGc28(RichGridCell gc28) {
        this.gc28 = gc28;
    }

    public RichGridCell getGc28() {
        return gc28;
    }


    public void setGc30(RichGridCell gc30) {
        this.gc30 = gc30;
    }

    public RichGridCell getGc30() {
        return gc30;
    }

    public void setGr7(RichGridRow gr7) {
        this.gr7 = gr7;
    }

    public RichGridRow getGr7() {
        return gr7;
    }

    public void setGc31(RichGridCell gc31) {
        this.gc31 = gc31;
    }

    public RichGridCell getGc31() {
        return gc31;
    }


    public void setGc33(RichGridCell gc33) {
        this.gc33 = gc33;
    }

    public RichGridCell getGc33() {
        return gc33;
    }


    public void setGc35(RichGridCell gc35) {
        this.gc35 = gc35;
    }

    public RichGridCell getGc35() {
        return gc35;
    }

    public void setGr8(RichGridRow gr8) {
        this.gr8 = gr8;
    }

    public RichGridRow getGr8() {
        return gr8;
    }

    public void setGc36(RichGridCell gc36) {
        this.gc36 = gc36;
    }

    public RichGridCell getGc36() {
        return gc36;
    }


    public void setGc38(RichGridCell gc38) {
        this.gc38 = gc38;
    }

    public RichGridCell getGc38() {
        return gc38;
    }


    public void setGc40(RichGridCell gc40) {
        this.gc40 = gc40;
    }

    public RichGridCell getGc40() {
        return gc40;
    }


    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }
    
    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
    }

    public void setB3(RichButton b3) {
        this.b3 = b3;
    }

    public RichButton getB3() {
        return b3;
    }
    
    
    

    //user logging in
    public String login_action() {
        // Add event code here...
        String username = this.getIt1()
                              .getValue()
                              .toString();
        String password = this.getIt2()
                              .getValue()
                              .toString();
        Connection conn;

        try {
            conn = getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rset =
                stmt.executeQuery("SELECT * FROM tbl_user_master where user_master_name = '" + username + "' and user_master_pwd = '" + password +"'");

            if (rset.next()) {
                //                conn.close();
                //getting data against column from table
                role_master_id = (rset.getString("role_master_id")).toString();

                //Storing value in session username from input text field and role_master_id from DB
                
                System.out.println(".........User Name stored in session is :..." + username + "...");
                System.out.println(".........User Password stored in session is :..." + password + "...");
                System.out.println(".........User Role stored in session is :..." + role_master_id + "...");

                //Redirecting to home page after successfull authentication
                //System.out.println("....... here we go /// you are redirecting now to DASHBOARD ......");
                //                return "good";
                
                conn.close();
                return "/faces/mainPage.jsf?faces-redirect=true";
            } else {
                System.out.println("........wrong login credentials........");

            }
            conn.close();

        } catch (SQLException e) {
            System.out.println(e);
        }

        return role_master_id;
        //        return "/faces/login.jsf?faces-redirect=true";
    }


    // creating generic database connection
    public static Connection getConnection() throws SQLException {
        String username = "mfp";
        String password = "mfp";
        String thinConn = "jdbc:oracle:thin:@192.168.1.192:1521:orcl";
        DriverManager.registerDriver(new OracleDriver());
        Connection conn = DriverManager.getConnection(thinConn, username, password);
        conn.setAutoCommit(false);
        return conn;
    }

    //logging out and clearing all variables data
    public String logout_action() {
        // Clearing all variable data here...
        role_master_id = null;
        role_detail_pages_id = null;
        role_detail_modules_id = null;
        role_master_name = null;
        pages_id = null;
        module_menu_id = null;
        module_name = null;
        view_rights = null;
        module_view_rights = null;
        add_rights = null;
        edit_rights = null;
        delete_rights = null;
        save_rights = null;
        page_name = null;
        
        System.out.println("You are logged out successfully");
        return "/faces/login.jsf?faces-redirect=true";
    }
   

   //page load all functions
    public String checkSession(String pageName) {
       
//                //String checkRole = login_action();
                //        System.out.println(checkRole);
                 page_name = pageName;
                 //Gettting user role master name by role master id
                 String Role_Name = get_user_role_master_name();
                 System.out.println("Role Name is : "+ Role_Name);
                 
                 //Gettting page id by page name
                 String Page_Id = get_page_id();
                 System.out.println("Page Id is : "+ Page_Id);
                 
                 //Gettting role detail id by page id and role master id
                 String role_detail_pages_id = get_role_detail_pages_id();
                 System.out.println("Role Detail Id is : "+ role_detail_pages_id);
                System.out.println(role_master_id+"....Role Master ID");
                System.out.println(page_name+"..........Page Name");
            
        return "good";
        
    }
    

    //pge for module load all functions
     public String checkmoduleSession(String moduleName) {
        
    //                //String checkRole = login_action();
                 //        System.out.println(checkRole);
//                  page_name = pageName;
         module_name = moduleName;
                  //Gettting user role master name by role master id
//                  String Role_Name = get_user_role_master_name();
//                  System.out.println("Role Name is : "+ Role_Name);
//                  
//                  //Gettting page id by page name
                  String Module_Id = get_module_menu_id();
                  System.out.println("Module Id is : "+ Module_Id);
//                  
//                  //Gettting role detail id by page id and role master id
//                  String role_detail_pages_id = get_role_detail_pages_id();
//                  System.out.println("Role Detail Id is : "+ role_detail_pages_id);
//                 System.out.println(role_master_id+"....Role Master ID");
//                 System.out.println(page_name+"..........Page Name");
//             
         return module_view_rights;
         
     }
     
     
    
    //Gettting user role master name by role master id
    public String get_user_role_master_name() {
        
        Connection con_role;

        try {
            con_role = getConnection();
            Statement stmt = con_role.createStatement();
            ResultSet rset =
                stmt.executeQuery("SELECT * FROM tbl_role_master where role_master_id = '" + role_master_id +  "'");

            if (rset.next()) {
                
                role_master_name = (rset.getString("role_master_name")).toString();
                
                System.out.println(".........get_user_role_master_name.........function called");
                System.out.println(".........Role Master ID is :..." + role_master_id + "...");
                System.out.println(".........Role Master NAME is :..." + role_master_name + "...");
                
                con_role.close();
                
                return role_master_name;
            } else {
                System.out.println("........NO ROLE FOUND........");
            }
            con_role.close();

        } catch (SQLException e) {
            System.out.println(e);
        }

        return role_master_name;
    }
    
    
    //Gettting module id by module name
    public String get_module_menu_id() {
        
        Connection con_mod;

        try {
            con_mod = getConnection();
            Statement stmt = con_mod.createStatement();
            ResultSet rset =
                stmt.executeQuery("SELECT * FROM tbl_module_menu where module_menu_name = '" + module_name +  "'");

            if (rset.next()) {
                
                module_menu_id = (rset.getString("module_menu_id")).toString();

                System.out.println(".........get_module_menu_id.........function called");
                System.out.println(".........Module ID is :..." + module_menu_id + "...");
                System.out.println(".........Module NAME is :..." + module_name + "...");

                con_mod.close();
                get_role_detail_module_id();
                return module_menu_id;
                
            } else {
                System.out.println("........NO Module FOUND........");
            }
            con_mod.close();

        } catch (SQLException e) {
            System.out.println(e);
        }

        return module_menu_id;
    }
    
    //Gettting role detail module id by module menu id and role master id
    public String get_role_detail_module_id() {
        
        Connection con_det;

        try {
            con_det = getConnection();
            Statement stmt = con_det.createStatement();
            ResultSet rset =
            stmt.executeQuery("SELECT * FROM tbl_role_detail_modules where module_menu_id = '" + module_menu_id + "' and role_master_id = '" + role_master_id +"'");

            if (rset.next()) {
                
                role_detail_modules_id = (rset.getString("role_detail_modules_id")).toString();

                System.out.println(".........get_role_detail_module_id.........function called");
                System.out.println(".........Module Menu ID is :..." + module_menu_id + "...");
                System.out.println(".........Role Master ID is :..." + role_master_id + "...");
                System.out.println(".........Role Detail Module ID is :..." + role_detail_modules_id + "...");
                con_det.close();
                
                get_module_view_rights();
                return role_detail_modules_id;
            } else {
                System.out.println("........NO ROLE DETAIL FOUND........");
            }
            con_det.close();

        } catch (SQLException e) {
            System.out.println(e);
        }

        return role_detail_modules_id;
    }
    
    
    //Gettting module view rights by role detail module id
    public String get_module_view_rights() {
        
        Connection con_mod_right;

        try {
            con_mod_right = getConnection();
            Statement stmt = con_mod_right.createStatement();
            ResultSet rset =
            stmt.executeQuery("SELECT * FROM tbl_role_detail_modules where role_detail_modules_id = '" + role_detail_modules_id + "'");

            if (rset.next()) {
                
                module_view_rights = (rset.getString("r_view")).toString();

                System.out.println(".........get_page_view_rights.........function called");
                System.out.println(".........View Rights for Module Menu ID : " + role_detail_modules_id + " against Role Master ID : " + role_master_id );
                System.out.println(".........Your Module view rights is : " + module_view_rights);
                
                con_mod_right.close();
                
                return module_view_rights;
            } else {
                System.out.println("........NO RIGHTS DATA FOUND........");
            }
            con_mod_right.close();

        } catch (SQLException e) {
            System.out.println(e);
        }

        return module_view_rights;
    }
    
    
    //Gettting page id by page name
    public String get_page_id() {
        
        Connection con_pg;

        try {
            con_pg = getConnection();
            Statement stmt = con_pg.createStatement();
            ResultSet rset =
                stmt.executeQuery("SELECT * FROM tbl_pages where pages_name = '" + page_name +  "'");

            if (rset.next()) {
                
                pages_id = (rset.getString("pages_id")).toString();

                System.out.println(".........get_page_id.........function called");
                System.out.println(".........Page ID is :..." + pages_id + "...");
                System.out.println(".........Page NAME is :..." + page_name + "...");

                con_pg.close();
                return pages_id;
                
            } else {
                System.out.println("........NO PAGE FOUND........");
            }
            con_pg.close();

        } catch (SQLException e) {
            System.out.println(e);
        }

        return pages_id;
    }
    
    
    //Gettting role detail id by page id and role master id
    public String get_role_detail_pages_id() {
        
        Connection con_det;

        try {
            con_det = getConnection();
            Statement stmt = con_det.createStatement();
            ResultSet rset =
            stmt.executeQuery("SELECT * FROM tbl_role_detail_pages where pages_id = '" + pages_id + "' and role_master_id = '" + role_master_id +"'");

            if (rset.next()) {
                
                role_detail_pages_id = (rset.getString("role_detail_pages_id")).toString();

                System.out.println(".........get_role_detail_pages_id.........function called");
                System.out.println(".........Page ID is :..." + pages_id + "...");
                System.out.println(".........Role Master ID is :..." + role_master_id + "...");
                System.out.println(".........Role Detail ID is :..." + role_detail_pages_id + "...");
                con_det.close();

                return role_detail_pages_id;
            } else {
                System.out.println("........NO ROLE DETAIL FOUND........");
            }
            con_det.close();

        } catch (SQLException e) {
            System.out.println(e);
        }

        return role_detail_pages_id;
    }
    
    
    //Gettting page view rights by role detail id
    public String get_page_view_rights() {
        
        Connection con_right;

        try {
            con_right = getConnection();
            Statement stmt = con_right.createStatement();
            ResultSet rset =
            stmt.executeQuery("SELECT * FROM tbl_role_detail_pages where role_detail_pages_id = '" + role_detail_pages_id + "'");

            if (rset.next()) {
                
                view_rights = (rset.getString("r_view")).toString();

                System.out.println(".........get_page_view_rights.........function called");
                System.out.println(".........View Rights for Page ID : " + pages_id + " against Role Master ID : " + role_master_id );
                System.out.println(".........Your Page view rights is : " + view_rights);
                
                con_right.close();
                
                return view_rights;
            } else {
                System.out.println("........NO RIGHTS DATA FOUND........");
            }
            con_right.close();

        } catch (SQLException e) {
            System.out.println(e);
        }

        return view_rights;
    }
    
    //Gettting add button view rights by role detail id
    public String get_add_view_rights() {
        
        Connection con_add;

        try {
            con_add = getConnection();
            Statement stmt = con_add.createStatement();
            ResultSet rset =
            stmt.executeQuery("SELECT * FROM tbl_role_detail_pages where role_detail_pages_id = '" + role_detail_pages_id + "'");

            if (rset.next()) {
                
                add_rights = (rset.getString("r_add")).toString();

                System.out.println(".........get_add_view_rights.........function called");
                System.out.println(".........Add View Rights for Page ID : " + pages_id + " against Role Master ID : " + role_master_id );
                System.out.println(".........Your Add rights is : " + add_rights);
                
                con_add.close();
                return add_rights;
            } else {
                System.out.println("........NO RIGHTS DATA FOUND........");
            }
            con_add.close();

        } catch (SQLException e) {
            System.out.println(e);
        }

        return add_rights;
    }
    
    //Gettting edit button view rights by role detail id
    public String get_edit_view_rights() {
        
        Connection con_edit;

        try {
            con_edit = getConnection();
            Statement stmt = con_edit.createStatement();
            ResultSet rset =
            stmt.executeQuery("SELECT * FROM tbl_role_detail_pages where role_detail_pages_id = '" + role_detail_pages_id + "'");

            if (rset.next()) {
                
                edit_rights = (rset.getString("r_edit")).toString();

                System.out.println(".........get_edit_view_rights.........function called");
                System.out.println(".........Add View Rights for Page ID : " + pages_id + " against Role Master ID : " + role_master_id );
                System.out.println(".........Your Edit rights is : " + edit_rights);
                
                con_edit.close();
                return edit_rights;
            } else {
                System.out.println("........NO RIGHTS DATA FOUND........");
            }
            con_edit.close();

        } catch (SQLException e) {
            System.out.println(e);
        }

        return edit_rights;
    }
    
    //Gettting delete button view rights by role detail id
    public String get_delete_view_rights() {
        
        Connection con_del;

        try {
            con_del = getConnection();
            Statement stmt = con_del.createStatement();
            ResultSet rset =
            stmt.executeQuery("SELECT * FROM tbl_role_detail_pages where role_detail_pages_id = '" + role_detail_pages_id + "'");

            if (rset.next()) {
                
                delete_rights = (rset.getString("r_delete")).toString();

                System.out.println(".........get_delete_view_rights.........function called");
                System.out.println(".........Add View Rights for Page ID : " + pages_id + " against Role Master ID : " + role_master_id );
                System.out.println(".........Your Delete rights is : " + delete_rights);
                
                con_del.close();
                return delete_rights;
            } else {
                System.out.println("........NO RIGHTS DATA FOUND........");
            }
            con_del.close();

        } catch (SQLException e) {
            System.out.println(e);
        }

        return delete_rights;
    }    
    
    
    //Gettting save button view rights > hard coded if add,edit or delete privilige found
    public String get_save_view_rights() {
 
        if(add_rights.equals("Y")){
            save_rights = "Y";
            System.out.println("Save right due to add is : Y");
        }
        else if(edit_rights.equals("Y")){
            save_rights = "Y";
            System.out.println("Save right due to edit is : Y");
        }
        else if(delete_rights.equals("Y")){
            save_rights = "Y";
            System.out.println("Save right due to delete is : Y");
        }
        else {
            save_rights = "N";
            System.out.println("Save right due to nothing is : N");
        }
         
         return save_rights;

    }


    public void setPa2(RichPanelAccordion pa2) {
        this.pa2 = pa2;
    }

    public RichPanelAccordion getPa2() {
        return pa2;
    }

    public void setPane2(RichShowDetailItem pane2) {
        this.pane2 = pane2;
    }

    public RichShowDetailItem getPane2() {
        return pane2;
    }


    public void setS1(RichSpacer s1) {
        this.s1 = s1;
    }

    public RichSpacer getS1() {
        return s1;
    }

    public void setS2(RichSpacer s2) {
        this.s2 = s2;
    }

    public RichSpacer getS2() {
        return s2;
    }

    public void setS3(RichSpacer s3) {
        this.s3 = s3;
    }

    public RichSpacer getS3() {
        return s3;
    }

    public void setPg1(HtmlPanelGroup pg1) {
        this.pg1 = pg1;
    }

    public HtmlPanelGroup getPg1() {
        return pg1;
    }

    public void setB4(RichButton b4) {
        this.b4 = b4;
    }

    public RichButton getB4() {
        return b4;
    }


    public void setI1(RichImage i1) {
        this.i1 = i1;
    }

    public RichImage getI1() {
        return i1;
    }

    public void setPg2(HtmlPanelGroup pg2) {
        this.pg2 = pg2;
    }

    public HtmlPanelGroup getPg2() {
        return pg2;
    }

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setS5(RichSpacer s5) {
        this.s5 = s5;
    }

    public RichSpacer getS5() {
        return s5;
    }

    public void setS6(RichSpacer s6) {
        this.s6 = s6;
    }

    public RichSpacer getS6() {
        return s6;
    }

    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }

    public void setI3(RichImage i3) {
        this.i3 = i3;
    }

    public RichImage getI3() {
        return i3;
    }

    public void setS7(RichSpacer s7) {
        this.s7 = s7;
    }

    public RichSpacer getS7() {
        return s7;
    }

    public void setS8(RichSpacer s8) {
        this.s8 = s8;
    }

    public RichSpacer getS8() {
        return s8;
    }

    public void setS9(RichSpacer s9) {
        this.s9 = s9;
    }

    public RichSpacer getS9() {
        return s9;
    }

    public void setPgl4(RichPanelGroupLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGroupLayout getPgl4() {
        return pgl4;
    }

    public void setI4(RichImage i4) {
        this.i4 = i4;
    }

    public RichImage getI4() {
        return i4;
    }
}


