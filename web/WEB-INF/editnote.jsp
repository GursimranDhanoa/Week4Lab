<%-- 
    Document   : viewnote
    Created on : Feb 4, 2021, 2:25:52 PM
    Author     : 821214
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <form method="post" action="note">

            <Strong>Title: </Strong> <input type="text" name="title" value="${title}"><br>
            <strong>Contents:</strong> <textarea  name="content" value="${content}"></textarea><br>
            <input type="submit" value="Save">
        </form>


    </body>
</html>
