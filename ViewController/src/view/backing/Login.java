package view.backing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;

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
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;
import oracle.adf.view.rich.component.rich.nav.RichButton;

import oracle.jdbc.OracleDriver;


public class Login {
    
    // generating static variables to use in different scopes
    private static String role_master_id;
    private static String role_detail_id;
    private static String role_master_name;
    private static String pages_id;
    private static String view_rights;
    private static String add_rights;
    private static String edit_rights;
    private static String delete_rights;
    private static String save_rights;
    private static String page_name;
    
    private RichForm f1;
    private RichDocument d1;
    private RichPanelAccordion pa1;
    private RichShowDetailItem pane1;
    private RichPanelGridLayout pgl1;
    private RichGridRow gr1;
    private RichGridCell gc1;
    private RichGridCell gc2;
    private RichGridCell gc3;
    private RichGridCell gc4;
    private RichGridCell gc5;
    private RichGridRow gr2;
    private RichGridCell gc6;
    private RichGridCell gc7;
    private RichGridCell gc8;
    private RichGridCell gc9;
    private RichGridCell gc10;
    private RichGridRow gr3;
    private RichGridCell gc11;
    private RichGridCell gc12;
    private RichGridCell gc13;
    private RichGridCell gc14;
    private RichGridCell gc15;
    private RichGridRow gr4;
    private RichGridCell gc16;
    private RichGridCell gc17;
    private RichGridCell gc18;
    private RichGridCell gc19;
    private RichGridCell gc20;
    private RichGridRow gr5;
    private RichGridCell gc21;
    private RichGridCell gc22;
    private RichGridCell gc23;
    private RichGridCell gc24;
    private RichGridCell gc25;
    private RichGridRow gr6;
    private RichGridCell gc26;
    private RichGridCell gc27;
    private RichGridCell gc28;
    private RichGridCell gc29;
    private RichGridCell gc30;
    private RichGridRow gr7;
    private RichGridCell gc31;
    private RichGridCell gc32;
    private RichGridCell gc33;
    private RichGridCell gc34;
    private RichGridCell gc35;
    private RichGridRow gr8;
    private RichGridCell gc36;
    private RichGridCell gc37;
    private RichGridCell gc38;
    private RichGridCell gc39;
    private RichGridCell gc40;
    private RichInputText it1;
    private RichInputText it2;
    private RichButton b1;
    private RichButton b2;
    private RichButton b3;

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

    public void setGc2(RichGridCell gc2) {
        this.gc2 = gc2;
    }

    public RichGridCell getGc2() {
        return gc2;
    }

    public void setGc3(RichGridCell gc3) {
        this.gc3 = gc3;
    }

    public RichGridCell getGc3() {
        return gc3;
    }

    public void setGc4(RichGridCell gc4) {
        this.gc4 = gc4;
    }

    public RichGridCell getGc4() {
        return gc4;
    }

    public void setGc5(RichGridCell gc5) {
        this.gc5 = gc5;
    }

    public RichGridCell getGc5() {
        return gc5;
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

    public void setGc7(RichGridCell gc7) {
        this.gc7 = gc7;
    }

    public RichGridCell getGc7() {
        return gc7;
    }

    public void setGc8(RichGridCell gc8) {
        this.gc8 = gc8;
    }

    public RichGridCell getGc8() {
        return gc8;
    }

    public void setGc9(RichGridCell gc9) {
        this.gc9 = gc9;
    }

    public RichGridCell getGc9() {
        return gc9;
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

    public void setGc12(RichGridCell gc12) {
        this.gc12 = gc12;
    }

    public RichGridCell getGc12() {
        return gc12;
    }

    public void setGc13(RichGridCell gc13) {
        this.gc13 = gc13;
    }

    public RichGridCell getGc13() {
        return gc13;
    }

    public void setGc14(RichGridCell gc14) {
        this.gc14 = gc14;
    }

    public RichGridCell getGc14() {
        return gc14;
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

    public void setGc17(RichGridCell gc17) {
        this.gc17 = gc17;
    }

    public RichGridCell getGc17() {
        return gc17;
    }

    public void setGc18(RichGridCell gc18) {
        this.gc18 = gc18;
    }

    public RichGridCell getGc18() {
        return gc18;
    }

    public void setGc19(RichGridCell gc19) {
        this.gc19 = gc19;
    }

    public RichGridCell getGc19() {
        return gc19;
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

    public void setGc22(RichGridCell gc22) {
        this.gc22 = gc22;
    }

    public RichGridCell getGc22() {
        return gc22;
    }

    public void setGc23(RichGridCell gc23) {
        this.gc23 = gc23;
    }

    public RichGridCell getGc23() {
        return gc23;
    }

    public void setGc24(RichGridCell gc24) {
        this.gc24 = gc24;
    }

    public RichGridCell getGc24() {
        return gc24;
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

    public void setGc27(RichGridCell gc27) {
        this.gc27 = gc27;
    }

    public RichGridCell getGc27() {
        return gc27;
    }

    public void setGc28(RichGridCell gc28) {
        this.gc28 = gc28;
    }

    public RichGridCell getGc28() {
        return gc28;
    }

    public void setGc29(RichGridCell gc29) {
        this.gc29 = gc29;
    }

    public RichGridCell getGc29() {
        return gc29;
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

    public void setGc32(RichGridCell gc32) {
        this.gc32 = gc32;
    }

    public RichGridCell getGc32() {
        return gc32;
    }

    public void setGc33(RichGridCell gc33) {
        this.gc33 = gc33;
    }

    public RichGridCell getGc33() {
        return gc33;
    }

    public void setGc34(RichGridCell gc34) {
        this.gc34 = gc34;
    }

    public RichGridCell getGc34() {
        return gc34;
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

    public void setGc37(RichGridCell gc37) {
        this.gc37 = gc37;
    }

    public RichGridCell getGc37() {
        return gc37;
    }

    public void setGc38(RichGridCell gc38) {
        this.gc38 = gc38;
    }

    public RichGridCell getGc38() {
        return gc38;
    }

    public void setGc39(RichGridCell gc39) {
        this.gc39 = gc39;
    }

    public RichGridCell getGc39() {
        return gc39;
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
                //return "/faces/mainPage.jsf?faces-redirect=true";
                return role_master_id;
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
        String thinConn = "jdbc:oracle:thin:@192.168.1.236:1521:orcl";
        DriverManager.registerDriver(new OracleDriver());
        Connection conn = DriverManager.getConnection(thinConn, username, password);
        conn.setAutoCommit(false);
        return conn;
    }

    //logging out and clearing all variables data
    public String logout_action() {
        // Add event code here...
        role_master_id = "";
        role_detail_id = "";
        role_master_name = "";
        pages_id = "";
        view_rights = "";
        add_rights = "";
        edit_rights = "";
        delete_rights = "";
        save_rights = "";
        page_name = "";
        
        System.out.println("You are logged out successfully");
        return "logged out";
    }
   

   //testing all functions
    public void checkSession(String pageName) {
       
       //String checkRole = login_action();
//        System.out.println(checkRole);
        page_name = pageName;
        //Gettting user role master name by role master id
        String Role_Name = get_user_role_master_name();
        System.out.println("Role Name is : "+ Role_Name);
        
        //Gettting page id by page name
        String Page_Id = get_page_id();
        System.out.println("Page Id is : "+ Page_Id);
        
        //Gettting role detail id by page id and role master id
        String Role_Detail_Id = get_role_detail_id();
        System.out.println("Role Detail Id is : "+ Role_Detail_Id);
        
//        //Gettting view rights by role detail id
//        String View_Rights = get_page_view_rights();
//        System.out.println("View Rights is : "+ View_Rights);  
//        
//        //Gettting add rights by role detail id
//        String Add_Rights = get_add_view_rights();
//        System.out.println("Add Rights is : "+ Add_Rights);
//        
//        //Gettting add rights by role detail id
//        String Edit_Rights = get_edit_view_rights();
//        System.out.println("Edit Rights is : "+ Edit_Rights);
//        
//        //Gettting add rights by role detail id
//        String Delete_Rights = get_delete_view_rights();
//        System.out.println("Delete Rights is : "+ Delete_Rights);
//        
//        //Gettting add rights by role detail id
//        String Save_Rights = get_save_view_rights();
//        System.out.println("Save Rights is : "+ Save_Rights);
//        
//        
        
        System.out.println(role_master_id+"....Role Master ID");
        System.out.println(page_name+"..........Page Name");
    }
    

    // returning view privilidges to page
//    public String pageViewPrivilidge() {
//        
//        //Gettting user role master name by role master id
////        get_user_role_master_name();
//        
//        //Gettting page id by page name
//        get_page_id();
//        
//        //Gettting role detail id by page id and role master id
//        get_role_detail_id();
//        
//        //Gettting view rights by role detail id
//        String View_Rights = get_page_view_rights();
//        System.out.println("View Rights is : "+ View_Rights);
//        
//        System.out.println(role_master_id+"....Role Master ID");
//        System.out.println(page_name+"..........Page Name");
//        
//     return View_Rights;
//    }
//    
//
//    // returning add privilidges to page
//    public String addViewPrivilidge() {
//        
//        //Gettting user role master name by role master id
////        get_user_role_master_name();
//        
//        //Gettting page id by page name
////        get_page_id();
//        
//        //Gettting role detail id by page id and role master id
////        get_role_detail_id();
//        
//        //Gettting view rights by role detail id
//        String Add_Rights = get_add_view_rights();
//        System.out.println("Add Rights is : "+ Add_Rights);
//        
//        System.out.println(role_master_id+"....Role Master ID");
//        System.out.println(page_name+"..........Page Name");
//        
//     return Add_Rights;
//    }
//
//    // returning edit privilidges to page
//    public String editViewPrivilidge() {
//        
//        //Gettting user role master name by role master id
////        get_user_role_master_name();
//        
//        //Gettting page id by page name
////        get_page_id();
//        
//        //Gettting role detail id by page id and role master id
////        get_role_detail_id();
//        
//        //Gettting view rights by role detail id
//        String Edit_Rights = get_edit_view_rights();
//        System.out.println("Edit Rights is : "+ Edit_Rights);
//        
//        System.out.println(role_master_id+"....Role Master ID");
//        System.out.println(page_name+"..........Page Name");
//        
//     return Edit_Rights;
//    }
//
//    // returning delete privilidges to page
//    public String deleteViewPrivilidge() {
//        
//        //Gettting user role master name by role master id
////        get_user_role_master_name();
//        
//        //Gettting page id by page name
////        get_page_id();
//        
//        //Gettting role detail id by page id and role master id
////        get_role_detail_id();
//        
//        //Gettting view rights by role detail id
//        String Delete_Rights = get_delete_view_rights();
//        System.out.println("Delete Rights is : "+ Delete_Rights);
//        
//        System.out.println(role_master_id+"....Role Master ID");
//        System.out.println(page_name+"..........Page Name");
//        
//     return Delete_Rights;
//    }
//
//    // returning save privilidges to page
//    public String saveViewPrivilidge() {
//        
//        //Gettting user role master name by role master id
////        get_user_role_master_name();
//        
//        //Gettting page id by page name
////        get_page_id();
//        
//        //Gettting role detail id by page id and role master id
////        get_role_detail_id();
//        
//        //Gettting save rights by role detail id
//        String Save_Rights = get_save_view_rights();
//        System.out.println("Save Rights is : "+ Save_Rights);
//        
//        System.out.println(role_master_id+"....Role Master ID");
//        System.out.println(page_name+"..........Page Name");
//        
//     return Save_Rights;
//    }
//    
    
    
    
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
    public String get_role_detail_id() {
        
        Connection con_det;

        try {
            con_det = getConnection();
            Statement stmt = con_det.createStatement();
            ResultSet rset =
            stmt.executeQuery("SELECT * FROM tbl_role_detail where pages_id = '" + pages_id + "' and role_master_id = '" + role_master_id +"'");

            if (rset.next()) {
                
                role_detail_id = (rset.getString("role_detail_id")).toString();

                System.out.println(".........get_role_detail_id.........function called");
                System.out.println(".........Page ID is :..." + pages_id + "...");
                System.out.println(".........Role Master ID is :..." + role_master_id + "...");
                System.out.println(".........Role Detail ID is :..." + role_detail_id + "...");
                con_det.close();

                return role_detail_id;
            } else {
                System.out.println("........NO ROLE DETAIL FOUND........");
            }
            con_det.close();

        } catch (SQLException e) {
            System.out.println(e);
        }

        return role_detail_id;
    }
    
    //Gettting page view rights by role detail id
    public String get_page_view_rights() {
        
        Connection con_right;

        try {
            con_right = getConnection();
            Statement stmt = con_right.createStatement();
            ResultSet rset =
            stmt.executeQuery("SELECT * FROM tbl_role_detail where role_detail_id = '" + role_detail_id + "'");

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
            stmt.executeQuery("SELECT * FROM tbl_role_detail where role_detail_id = '" + role_detail_id + "'");

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
            stmt.executeQuery("SELECT * FROM tbl_role_detail where role_detail_id = '" + role_detail_id + "'");

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
            stmt.executeQuery("SELECT * FROM tbl_role_detail where role_detail_id = '" + role_detail_id + "'");

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
 
        if(add_rights.equals("1")){
            save_rights = "1";
            System.out.println("Save right sue to add is : 1");
        }
        else if(edit_rights.equals("1")){
            save_rights = "1";
            System.out.println("Save right due to edit is : 1");
        }
        else if(delete_rights.equals("1")){
            save_rights = "1";
            System.out.println("Save right due to delete is : 1");
        }
        else {
            save_rights = "0";
            System.out.println("Save right due to nothing is : 0");
        }
         
         return save_rights;

    }


}


