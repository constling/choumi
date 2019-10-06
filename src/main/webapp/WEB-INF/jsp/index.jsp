<%@ page contentType="text/html;charset=utf-8"%>
<%
    request.setCharacterEncoding("utf-8");
%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>homepage</title>
    <style>
        .centerXY{
            position: relative;
            margin: auto auto;
            overfloat:hidden;
            width:200px;
            heigth:100px;
            background-color: red;
        }
    </style>
</head>

<body>
<div class = "centerXY">
    <form action="login" method="get">
        name: <input type="text" name="name"><br>
        nick: <input type="text" name="password"><br>
        <input type="submit" value="提交">
    </form>
</div>
</body>
</html>
