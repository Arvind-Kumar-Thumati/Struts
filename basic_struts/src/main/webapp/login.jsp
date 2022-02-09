<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello World!</title>
  </head>
  
  <body>
    <s:actionmessage />
    <s:actionerror />
    <s:form id="idLoginForm" action="loginAction">
        <s:textfield name="uName" aria-placeholder="Username" label="Username" />
        <s:password name="pass" aria-placeholder="Password" label="Password" />
        <s:submit value="Submit"/>
    </s:form>    
  </body>
</html>