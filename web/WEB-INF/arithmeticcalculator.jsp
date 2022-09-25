<%-- 
    Document   : arithmeticcalculator
    Created on : 24-Sep-2022, 11:44:32 PM
    Author     : kurtm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="first"><br>
            Second: <input type="text" name="second"><br>
            <input type="submit" name="operation" value="+">
            <input type="submit" name="operation" value="-">
            <input type="submit" name="operation" value="*">
            <input type="submit" name="operation" value="%">
            <br>
            Result: ${result}
        </form>
        <a href="age">Age Calculator</a>
    </body>
</html>
