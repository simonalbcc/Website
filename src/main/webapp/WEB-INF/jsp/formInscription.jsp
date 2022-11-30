<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>

<!-- ========================= SECTION INSCRIPTION FORM CONTENT ========================= -->
<section>
<%--@elvariable id="user" type=""--%>
    <div id="middle-container">
        <form:form
                id="form"
                method="POST"
                action="/foodWebsite/inscription/send"
                modelAttribute="user"
                class="row g-3">

            <!-- title -->
            <h2><spring:message code="signUpFormLabel"/></h2>

            <!-- email field -->
            <div class="col-md-6">
                <form:label path="emailAddress" class="form-label"><spring:message code="emailFormLabel"/></form:label>
                <form:input class="form-control" path="emailAddress"/>
                <form:errors path="emailAddress"/>
            </div>

            <!-- password field -->
            <div class="col-md-6">
                <form:label path="password" class="form-label"><spring:message code="passwordFormLabel"/></form:label>
                <form:input type="password" class="form-control" path="password"/>
                <form:errors path="password"/>
            </div>

            <!-- last name field -->
            <div class="col-md-6">
                <form:label path="lastName" class="form-label"><spring:message code="lastNameFormLabel"/></form:label>
                <form:input type="text" class="form-control" path="lastName"/>
                <form:errors path="lastName"/>
            </div>

            <!-- first name field -->
            <div class="col-md-6">
                <form:label path="firstName" class="form-label"><spring:message code="firstNameFormLabel"/></form:label>
                <form:input type="text" class="form-control" path="firstName"/>
                <form:errors path="firstName"/>
            </div>

            <!-- address field -->
            <div class="col-12">
                <form:label path="address" class="form-label"><spring:message code="addressFormLabel"/></form:label>
                <spring:message code ="defaultAddressForm" var="placeHolder"/>
                <form:input type="text" class="form-control" path="address" placeholder='${placeHolder}'/>
                <form:errors path="address"/>
            </div>

            <!-- phone number field -->
            <div class="col-12">
                <form:label path="numberPhone" class="form-label"><spring:message code="phoneNumberFormLabel"/></form:label>
                <form:input type="text" class="form-control" path="numberPhone" placeholder="0490225687"/>
                <form:errors path="numberPhone"/>
            </div>

            <!-- submit button -->
            <div class="col-12">
                <button type="submit"class="btn btn-outline-warning"><spring:message code="validateButtonLabel"/></button>
            </div>

        </form:form>
    </div>
</section>
<!-- ========================= END SECTION INSCRIPTION FORM CONTENT ========================= -->
