<%--
  Created by IntelliJ IDEA.
  User: DJB
  Date: 16-06-2015
  Time: 22:16
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body bgcolor="#AFEEEE">

<br>
<h4 align="right"/><b>LOGIN</b></h4>
<g:form name="LOGIN" controller="login" action="signin" method="post" align="right">
    Username:-  <g:textField name="userName" required=""/><br><br>
    Password:-      <g:passwordField name="password" required=""/><br><br>

    <g:link controller="login" action="forgot" method="post">forgot password</g:link>  &nbsp <g:submitButton
        name="Login"/>
</g:form>
<br><br>
<h4 align="right"><b>REGISTER</b></h4>
<g:form controller="login" action="register" method="post" align="right">
    First Name:-  <g:textField name="fname"/><br><br>
    Last Name:-  <g:textField name="lname"/><br><br>
    Email Id:-  <g:textField name="email"/><br><br>
    User Name:-  <g:textField name="userName"/><br><br>
    Password:-   <g:passwordField name="password"/><br><br>
    Confirm Password:-<g:passwordField name="confirmPassword"/><br><br>
    Photo:- <g:field type="File" name="photo"/><br><br>



    <g:submitButton name="Submit"/>

</g:form>

<g:form controller="login" action="recent" method="post" align="left-top " >

</g:form>

</body>
</html>