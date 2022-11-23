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
    <div id="container">
        <form:form
                id="form"
                method="POST"
                action="/foodWebsite/inscription/send"
                modelAttribute="user"
                class="row g-3">
            <h2><spring:message code="signUpFormLabel"/></h2>
            <div class="col-md-6">
                <form:label path="emailAddress" class="form-label"><spring:message code="emailFormLabel"/></form:label>
                <form:input class="form-control" path="emailAddress"/>
                <form:errors path="emailAddress"/>
            </div>
            <div class="col-md-6">
                <form:label path="password" class="form-label"><spring:message code="passwordFormLabel"/></form:label>
                <form:input type="password" class="form-control" path="password"/>
                <form:errors path="password"/>
            </div>
            <div class="col-md-6">
                <form:label path="lastName" class="form-label"><spring:message code="lastNameFormLabel"/></form:label>
                <form:input type="text" class="form-control" path="lastName"/>
                <form:errors path="lastName"/>
            </div>
            <div class="col-md-6">
                <form:label path="firstName" class="form-label"><spring:message code="firstNameFormLabel"/></form:label>
                <form:input type="text" class="form-control" path="firstName"/>
                <form:errors path="firstName"/>
            </div>
            <div class="col-12">
                <form:label path="address" class="form-label"><spring:message code="addressFormLabel"/></form:label>
                <spring:message code ="defaultAddressForm" var="placeHolder"/>
                <form:input type="text" class="form-control" path="address" placeholder='${placeHolder}'/>
                <form:errors path="address"/>
            </div>
            <div class="col-12">
                <form:label path="numberPhone" class="form-label"><spring:message code="phoneNumberFormLabel"/></form:label>
                <form:input type="text" class="form-control" path="numberPhone" placeholder="0490225687"/>
                <form:errors path="numberPhone"/>
            </div>
            <div class="col-12">
                <button type="submit"class="btn btn-outline-warning"><spring:message code="validateButtonLabel"/></button>
            </div>
        </form:form>
    </div>
</body>
</html>