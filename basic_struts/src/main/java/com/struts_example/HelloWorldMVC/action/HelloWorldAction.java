package com.struts_example.HelloWorldMVC.action;

import com.opensymphony.xwork2.ActionSupport;
import com.struts_example.HelloWorldMVC.model.MessageStore;

public class HelloWorldAction extends ActionSupport{
    private MessageStore messageStore;
    @Override
    public String execute() throws Exception {
        messageStore = new MessageStore();
        return SUCCESS;
    }
    public MessageStore getMessageStore() {
        return messageStore;
    }
}
