<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

    <html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Get User Information:</title>
    </head>
    <body>
        <div align="center">
            <form:form action="result" method="post" modelAttribute="userSearch">
                <table border ="1">
                    <tr>
                        <td colspan="2" align="center"><h2>Input Username to search database.</h2></td>
                    </td>
                    <tr>
                        <td>Username:</td>
                     <td><form:input path="username" /></td>
                    </tr>
                    <tr>
                       <td colspan="2" align="center"><input type="submit" value="Search" /></td>
                    </tr>
                </table>
            </form:form>
         </div>
    </body>
</html>