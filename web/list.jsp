<%--
  Created by IntelliJ IDEA.
  User: mayn
  Date: 2018/6/7
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tbody>
    <tr>
        <th>ID</th>
        <th>姓名</th>
        <th>年龄</th>
    </tr>
    </tbody>
    <c:if test="${!empty list}">
        <c:forEach items="${list}" var="user">
            <tr>
                <td>${user.userid }</td>
                <td>${user.username }</td>
                <td>${user.age }</td>
            </tr>
        </c:forEach>
    </c:if>
</table>
</body>
</html>
