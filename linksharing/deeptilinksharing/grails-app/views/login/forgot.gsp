<%--
  Created by IntelliJ IDEA.
  User: DJB
  Date: 18-06-2015
  Time: 14:22
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<g:form controller="login" action="reset" method="post" align="center">
    USERNAME: <g:textField name="userName"/><br><br>
    EMAIL ID:  <g:textField name="email"/><br><br>
    NEW PASSWORD: <g:passwordField name="password"/><br><br>

    <g:submitButton name="submit" />
    </g:form>
</body>
</html>