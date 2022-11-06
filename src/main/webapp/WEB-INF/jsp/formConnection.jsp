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
<form:form>
    <div class="mb-3">
        <form:label path="exampleInputEmail1" class="form-label">Email</form:label>
        <form:input type="email" class="form-control" path="exampleInputEmail1" aria-describedby="emailHelp"/>
    </div>
    <div class="mb-3">
        <form:label path="exampleInputPassword1" class="form-label">Mot de passe</form:label>
        <form:input type="password" class="form-control" path="exampleInputPassword1"/>
    </div>
    <button type="submit" class="btn btn-primary">Valider</button>
</form:form>

</body>
</html>