<%--
  Created by IntelliJ IDEA.
  User: lingxing
  Date: 2019/10/4
  Time: 7:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>student</title>
</head>
<body>
<%!
    String name = "333";
%>
<%
    Object name = request.getAttribute("name");
    out.println(name.toString());
%>

    <h2>学生的信息如下 - </h2>
    <table>
        <tr>
            <td>名字：</td>
            <td><%= request.getAttribute("name") %></td>
        </tr>
        <tr>
            <td>编号：</td>
            <td><%=request.getAttribute("id")%></td>
        </tr>
    </table>

</body>

</html>
