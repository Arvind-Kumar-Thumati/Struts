package com.struts_example.LoginMVC.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;

public class LoginAction extends ActionSupport implements SessionAware{
    private String uName, pass;
    private Map<String, Object> session;
    
    public String home(){        
        // session is taken care by interceptor
        // if(session == null || (session.containsKey("root") && !session.get("root").equals("loggedIn"))){
        //     return LOGIN;
        // }        
        return SUCCESS;
    }

    public String loginRegisterUser(){
        System.out.println(uName + pass);
        if( uName==null || pass==null){            
            return LOGIN;        
        }
        if( uName.equals("root") && pass.equals("root")){
            session.put("root", "loggedIn");
            session.put("uName", "root");
            return SUCCESS;
        }        
        else{            
            addActionError("Invalid username or password");
            return LOGIN;
        }
    }

    public String logOut(){
        session.remove("root");
        session.remove("uName");
        addActionMessage("You have been succesfully logged out");
        return SUCCESS;
    }

    public Map<String, Object> getSession() {
        return session;
    }
    
    public void setSession(Map<String, Object> map){
        this.session = map;
    }

    public String getuName() {
        return uName;
    }

    public String getPass() {
        return pass;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
