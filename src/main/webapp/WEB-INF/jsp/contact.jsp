<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>
<html>
<head>
    <meta charset="utf-8">
    <title>${title}</title>
    <link rel="stylesheet" href='<spring:url value="/css/contact.css"/>' type="text/css">
    <link rel="stylesheet" href='<spring:url value="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"/>' type="text/css">
</head>
    <body>
    <div id = "container">
        <div id="contact">
            <spring:message code ="contactText"/>
        </div>
        <a class="btn btn-light" href='<spring:url value="/welcome"/>'><spring:message code ="backButton"/></a>
    </div>
    </body>
</html>