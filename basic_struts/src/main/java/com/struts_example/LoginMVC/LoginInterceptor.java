package com.struts_example.LoginMVC;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import java.util.Map;

public class LoginInterceptor implements Interceptor {

    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void init() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        Map<String, Object> session = invocation.getInvocationContext().getSession();
        if(session == null || session.get("root") == null){
            return "login";
        }
        else if(session.get("root").equals("loggedIn")){
            return invocation.invoke();
        }

     return null;
    }
    
}
