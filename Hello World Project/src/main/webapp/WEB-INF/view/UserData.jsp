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
            <form:form action = "#" method="get" modelAttribute="userSearch">
                <table border ="1">
                    <tr>
                        <td colspan="2" align="center"><h2>Database Result:</h2></td>
                    </td>
                    <tr>
                        <td>ID:</td>
                        <td>${userSearch.id}</td>
                    </tr>
                    <tr>
                        <td>Username:</td>
                     <td>${userSearch.username}</td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td>${userSearch.password}</td>
                    </tr>
                    <tr>
                        <td>Date Created:</td>
                        <td>${userSearch.date_created}</td>
                    </tr>
                    <tr>
                       <td colspan="2" align="center"></td>
                    </tr>
                </table>
            </form:form>
         </div>
    </body>
</html>