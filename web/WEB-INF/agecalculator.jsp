<%-- 
    Document   : agecalculator
    Created on : 24-Sep-2022, 10:20:11 PM
    Author     : kurtm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="text" name="age"><br>
            <input type="submit" value="Age next birthday"><br>
            ${ageString}
        </form>
            <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
