<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>
<html>
<head>
    <meta charset="utf-8">
    <title>Contact</title>
    <link rel="stylesheet" href='<spring:url value="/css/contact.css"/>' type="text/css">
    <link rel="stylesheet" href='<spring:url value="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"/>' type="text/css">
</head>
<body>
<div id = "wrapperContact">
    <div id="contact"> La sandwicherie des ours <br> <br>
        Cette sandwicherie 100% Andennaise offre ses services depuis 2022. Reconnue pour sa bonne humeur et ses produits d'exception.

    </div>

    <div>
        <a class="btn btn-light" style="--bs-btn-padding-y: 1rem; --bs-btn-padding-x: 1rem; --bs-btn-font-size: 2rem;" href='<spring:url value="/welcome"/>'>Retour</a>
    </div>
</div>
</body>
</html>