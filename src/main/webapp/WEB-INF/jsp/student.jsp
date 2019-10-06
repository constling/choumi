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
    <script>
        var xmlHttpRequest;

        function getContextPath(){   //这个方法是获取项目上下文路径以及返回等会form表单提交要用到的action的url路径
            var curWwwPath = window.document.location.href;
            var pathName =  window.document.location.pathname;
            var pos = curWwwPath.indexOf(pathName);
            var localhostPath = curWwwPath.substring(0,pos);
            var projectName = pathName.substring(0,pathName.substr(1).indexOf('/')+1);
            return (localhostPath + projectName + "/user/action" );
        }

        function onreadystatechange() {
            if (xmlHttpRequest.readyState == 4) {
                if(xmlHttpRequest.status==200) {
                    var text = xmlHttpRequest.responseText;
                    console.log(text);
                }
            }
        }

        function myFunction() {
            var url = getContextPath();
            xmlHttpRequest = new XMLHttpRequest();
            xmlHttpRequest.onreadystatechange = onreadystatechange;
            xmlHttpRequest.open("GET", url);
            xmlHttpRequest.send();
        }
    </script>
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
    <button id ="clickButton" type="button" onclick="myFunction()">Click Me!</button>
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
