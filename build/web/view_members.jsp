<%-- 
    Document   : view_members
    Created on : Sep 4, 2016, 3:18:07 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ taglib uri="/struts-tags" prefix="s" %>  

        <h3>All Records:</h3>  

        <table border="1">
            <tr>
                <th>USER Name</th>
                <th>USER PASS</th>

            </tr>
            <s:iterator value="list">
                <tr>
                    <td><s:property value="uname"/></td>
                    <td><s:property value="upass"/></td>

                </tr>
            </s:iterator>

        </table>


    </body>
</html>
