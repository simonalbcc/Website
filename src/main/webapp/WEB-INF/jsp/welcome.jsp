<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>
<html>
<head>
    <meta charset="utf-8">
    <title>Welcome</title>
    <link rel="stylesheet" href='<spring:url value="/css/welcome.css"/>' type="text/css">
</head>
    <body>
    <div>
        <div id ="img">
            <img class="" src='<spring:url value="/images/Logos/welcomeBear.png"/>'/>
        </div>
        <div id = "imgButton">
            <a class="btn btn-light" href='<spring:url value="/contact"/>'><spring:message code="aboutUsButton"/></a>
        </div>
    </div>
    </body>

</html>
