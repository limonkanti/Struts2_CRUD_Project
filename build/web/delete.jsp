<%-- 
    Document   : delete
    Created on : Sep 4, 2016, 3:50:09 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete</title>
    </head>
    <body>
        <%@ taglib uri="/struts-tags" prefix="s" %>  
        <s:form action="delete">  
           <s:textfield name="uname" label="UserName"></s:textfield>
            <s:submit value="Delete"></s:submit>
        <s:reset value="Reset"></s:reset>

    </s:form>  
    </body>
</html>
