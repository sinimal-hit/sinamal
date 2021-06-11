<%--
  Created by IntelliJ IDEA.
  User: 86189
  Date: 2021/5/22
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
$END$

<br>

<%--JSP表达式--%>
<%--作用:用来将程序的结果输出到客户端
<%= 变量表达式%>
--%>
<%= new java.util.Date()%>
<hr>

<%--jsp脚本片段--%>
<%
    int sum = 0;
    for (int i = 1; i < 100; i++) {
        sum+=i;
    }
    out.println("<h1>Sum=" + sum + "<h1>");
%>






</body>
</html>
