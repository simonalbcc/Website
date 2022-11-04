<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>
<html>
<head>
    <meta charset="utf-8">
    <title>Welcome</title>
    <link rel="stylesheet" href='<spring:url value="/css/welcome.css"/>' type="text/css">
    <link rel="stylesheet" href='<spring:url value="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"/>' type="text/css">
</head>
    <body>
    <div>
        <div id ="img">
            <img class="" src='<spring:url value="/images/welcomeBear.png"/>'/>
        </div>
        <div id = "imgButton">
            <button type="button" class="btn btn-light">A propos de nous</button>
        </div>
    </div>
    </body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
</html>
