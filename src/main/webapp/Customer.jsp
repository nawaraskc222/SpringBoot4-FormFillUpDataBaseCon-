<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Form Fill up</title>
    <style>
        body {
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
        }

        form {
            width: 50%; /* Adjust the width as needed */
            text-align: left; /* Align the form elements to the left within the centered form */
        }
    </style>
</head>
<body>
<h1>Fill Up The Form:</h1>
    
    <form method="post" action="cdetails">
    Enter cid: <input type="number" id="cid" name="cid"><br>
    Enter cname: <input type="text" id="cname" name="cname"><br>
    Enter cmail: <input type="email" id="cmail" name="cmail"><br>
    <input type="submit" value="submit"><br>
</form>
    

</body>
</html>
