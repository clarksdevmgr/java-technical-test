<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="products" scope="request" type="java.util.List<com.clarks.technicaltest.domain.Product >"/>

<html>
<head>
    <title>Clarks Technical Test</title>
</head>
<body>
    <p><strong>Example products</strong></p>
    <c:forEach items="${products}" var="product">
        ${product}<br>
    </c:forEach>
</body>
</html>
