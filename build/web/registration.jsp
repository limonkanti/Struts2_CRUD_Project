<%-- 
    Document   : registration
    Created on : Sep 3, 2016, 4:12:38 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body>
        <%@ taglib uri="/struts-tags" prefix="s" %>  

    <s:form action="register">  
           
           <s:textfield name="uname" label="UserName"></s:textfield>
            <s:password name="upass" label="Password"></s:password>
            <s:submit value="Registration"></s:submit>
        <s:reset value="Reset"></s:reset>

    </s:form>  
</body>
</html>
