<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>
<html>
<head>
    <meta charset="utf-8">
    <title>Connexion</title>
    <link rel="stylesheet" href='<spring:url value="/css/menu.css"/>' type="text/css">
    <link rel="stylesheet" href='<spring:url value="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"/>' type="text/css">
</head>
<body>
<%--@elvariable id="user" type=""--%>
<div id="form">
    <form:form
            id="form"
            method="POST"
            action="/foodWebsite/connection/send"
            modelAttribute="user">
        <div class="mb-3">
            <form:label path="emailAddress" class="form-label"><spring:message code="emailFormLabel"/></form:label>
            <form:input type="email" class="form-control" path="emailAddress"/>
        </div>
        <div class="mb-3">
            <form:label path="password" class="form-label"><spring:message code="passwordFormLabel"/></form:label>
            <form:input type="password" class="form-control" path="password"/>
        </div>
        <button type="submit" class="btn btn-primary"><spring:message code="validateButtonLabel"/></button>
        <div>
            <a href='<spring:url value="/inscription"/>'><spring:message code="signUpButton"/></a>
        </div>
    </form:form>
</div>
</body>
</html>