<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 26/03/2024
  Time: 10:49 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <ul>
        <c:forEach items="${categories}" var="c">
            <li>
                ${c.name}
            </li>
        </c:forEach>
    </ul>
</body>
</html>
