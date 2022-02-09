<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Home</title>
  </head>
  <body>      
      Hello <s:property value="%{#session['uName']}"/><br> <!-- How this works ???-->
      <a href="<s:url action='logoutAction' />">LogOut</a> <br><br>
      <a href="<s:url action='showVisitsAction' />">ShowVisits</a>
    <h2><s:property value="messageStore.message" /></h2>
  </body>
</html>