package com.struts_example.HelloWorldMVC.model;

public class MessageStore {
    private String message;
    public MessageStore(){
        message = "Hello From struts";
    }
    
    public String getMessage() {
        return message;
    }
}
