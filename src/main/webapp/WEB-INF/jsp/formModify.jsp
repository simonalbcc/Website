<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>

<!-- ========================= SECTION INSCRIPTION FORM CONTENT ========================= -->
<section>
    <%--@elvariable id="user" type=""--%>
    <div id="middle-container">
        <form:form
                id="form"
                method="POST"
                action="/foodWebsite/editProfile/send"
                modelAttribute="user"
                class="row g-3">

            <!-- title -->
            <h2><spring:message code="signUpFormLabel"/></h2>

            <!-- email field -->
            <div class="col-md-6">
                <form:label path="emailAddress" class="form-label"><spring:message code="emailFormLabel"/></form:label>
                <form:input class="form-control" path="emailAddress" readonly="true" value="${user.getEmailAddress()}"/>
                <form:errors path="emailAddress"/>
            </div>

            <!-- last name field -->
            <div class="col-md-6">
                <form:label path="lastName" class="form-label"><spring:message code="lastNameFormLabel"/></form:label>
                <form:input type="text" class="form-control" path="lastName" value="${user.getLastName()}"/>
                <form:errors path="lastName"/>
            </div>

            <!-- password field -->
            <div class="col-md-6">
                <form:label path="password" class="form-label"><spring:message code="passwordFormLabel"/></form:label>
                <form:password  class="form-control" path="password" autocomplete="false" />
                <form:errors path="password"/>
            </div>

            <!-- first name field -->
            <div class="col-md-6">
                <form:label path="firstName" class="form-label"><spring:message code="firstNameFormLabel"/></form:label>
                <form:input type="text" class="form-control" path="firstName" value="${user.getFirstName()}"/>
                <form:errors path="firstName"/>
            </div>

            <!-- confirmedPassword field -->
            <div class="col-md-6">
                <form:label path="confirmedPassword" class="form-label"><spring:message code="confirmedPassword"/></form:label>
                <form:password  class="form-control" path="confirmedPassword" autocomplete="false" />
                <form:errors path="confirmedPassword"/>
            </div>

            <!-- address field -->
            <div class="col-12">
                <form:label path="address" class="form-label"><spring:message code="addressFormLabel"/></form:label>
                <spring:message code ="defaultAddressForm" var="placeHolder"/>
                <form:input type="text" class="form-control" path="address" value="${user.getAddress()}"/>
                <form:errors path="address"/>
            </div>

            <!-- phone number field -->
            <div class="col-12">
                <form:label path="numberPhone" class="form-label"><spring:message code="phoneNumberFormLabel"/></form:label>
                <form:input type="text" class="form-control" path="numberPhone" value="${user.getNumberPhone()}"/>
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
