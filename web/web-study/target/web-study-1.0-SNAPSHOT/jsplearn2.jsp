<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--定制错误页面--%>

<%@page errorPage="error/500.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    int x = 1;
%>
<%--jsp标签--%>
<jsp:include page="index.jsp"/>


</body>
</html>
