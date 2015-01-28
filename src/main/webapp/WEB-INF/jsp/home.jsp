<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="products" scope="request" type="java.util.List<com.clarks.technicaltest.domain.Product >"/>

<html>
<head>
    <title></title>
</head>
<body>
    <c:forEach items="${products}" var="product">
        <h1>${product}</h1>
    </c:forEach>
</body>
</html>
