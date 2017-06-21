<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title2</title>
</head>
<body>
<h2>Woman List</h2><br><br>
<c:forEach items="${womanlist}" var="element">
    <c:out value="${element.name}"></c:out>
    <c:out value="${element.addres}"></c:out>
    <c:out value="${element.mobile}"></c:out>
    <c:out value="${element.age}"></c:out>
    <br>
</c:forEach>
</body>
</html>