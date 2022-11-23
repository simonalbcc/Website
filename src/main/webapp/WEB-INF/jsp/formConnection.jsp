<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>
<html>
<head>
    <meta charset="utf-8">
    <title>${title}</title>
    <link rel="stylesheet" href='<spring:url value="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"/>' type="text/css">
    <link rel="stylesheet" href='<spring:url value="/css/form.css"/>' type="text/css">
</head>
<body>
<%--@elvariable id="user" type=""--%>
    <div id ="container">
        <div id="form">
            <form:form
                    id="form"
                    method="POST"
                    action="/foodWebsite/connection/send"
                    modelAttribute="user">
                <div class="col-md-8">
                    <form:label path="emailAddress" class="form-label"><spring:message code="emailFormLabel"/></form:label>
                    <form:input type="email" class="form-control" path="emailAddress"/>
                </div>
                <div class="col-md-8">
                    <form:label path="password" class="form-label"><spring:message code="passwordFormLabel"/></form:label>
                    <form:input type="password" class="form-control" path="password"/>
                </div>
                <div class="col-12" style="padding-top: 20px">
                    <button type="submit" class="btn btn-outline-warning"><spring:message code="validateButtonLabel"/></button>
                </div>
                <div style="padding-top: 5px; font-size: 12px;">
                    <a class="link-secondary" href='<spring:url value="/inscription"/>'><spring:message code="signUpButton"/></a>
                </div>
            </form:form>
        </div>
        <img src='<spring:url value="/images/Logos/bearWaving.png"/>' alt="welcome bear image"/>
    </div>
</body>
</html>