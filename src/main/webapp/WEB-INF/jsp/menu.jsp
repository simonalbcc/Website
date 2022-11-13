<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>
<html>
<head>
    <meta charset="utf-8">
    <title>Menu</title>
    <link rel="stylesheet" href='<spring:url value="/css/menu.css"/>' type="text/css">
    <link rel="stylesheet" href='<spring:url value="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"/>' type="text/css">
</head>
<body>
    <div id = "menu">
        <div>
            <a class="btn btn-light" style="--bs-btn-padding-y: 1rem; --bs-btn-padding-x: 1rem; --bs-btn-font-size: 2rem;" href='<spring:url value="/products"/>'><spring:message code ="pastaButton"/></a>
        </div>
        <img src='<spring:url value="/images/welcomeBear.png"/>'/>
        <div>
            <a class="btn btn-light" style="--bs-btn-padding-y: 1rem; --bs-btn-padding-x: 1rem; --bs-btn-font-size: 2rem;" href='<spring:url value="/products"/>'><spring:message code ="sandwichButton"/></a>
        </div>
    </div>
</body>
</html>