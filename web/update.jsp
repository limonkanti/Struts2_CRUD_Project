<%-- 
    Document   : update
    Created on : Sep 4, 2016, 4:16:27 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
       <%@ taglib uri="/struts-tags" prefix="s" %>  
    <body>
        <%@ taglib uri="/struts-tags" prefix="s" %>  
        <s:form action="update">  
           <s:textfield name="uname" label="New Name"></s:textfield>
           <s:textfield name="uname1" label="Old Name"></s:textfield>
            <s:submit value="Update"></s:submit>
        <s:reset value="Reset"></s:reset>

    </s:form>  
    </body>
</html>
