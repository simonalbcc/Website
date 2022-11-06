<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>
<html>
<head>
    <meta charset="utf-8">
    <title>Inscription</title>
    <link rel="stylesheet" href='<spring:url value="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"/>' type="text/css">
</head>
<body>
<%--@elvariable id="user" type=""--%>
<form:form
        id="form"
        method="POST"
        action="/foodWebsite/inscription/send"
        modelAttribute="user"
        class="row g-3">
    <div class="col-md-6">
        <form:label path="mailAddress" class="form-label">Email</form:label>
        <form:input class="form-control" path="mailAddress"/>
    </div>
    <div class="col-md-6">
        <form:label path="password" class="form-label">Mot de passe</form:label>
        <form:input type="password" class="form-control" path="password"/>
    </div>
    <div class="col-md-6">
        <form:label path="lastName" class="form-label">Nom</form:label>
        <form:input type="email" class="form-control" path="lastName"/>
    </div>
    <div class="col-md-6">
        <form:label path="firstName" class="form-label">Prénom</form:label>
        <form:input class="form-control" path="firstName"/>
    </div>
    <div class="col-12">
        <form:label path="address" class="form-label">Adresse</form:label>
        <form:input type="text" class="form-control" path="address" placeholder="123 Rue des écoles"/>
    </div>
    <div class="col-12">
        <form:label path="numberPhone" class="form-label">Numéro de téléphone</form:label>
        <form:input type="text" class="form-control" path="numberPhone" placeholder="0490225687"/>
    </div>
    <div class="col-12">
        <button type="submit" class="btn btn-primary">Valider</button>
    </div>
</form:form>

</body>
</html>