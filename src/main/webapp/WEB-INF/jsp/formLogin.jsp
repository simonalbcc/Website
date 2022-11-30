<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>

<!-- ========================= SECTION CONTENT ========================= -->
<section>
<%--@elvariable id="user" type=""--%>
    <div id ="middle-container">

        <!-- form -->
        <div id="form-container">
            <form:form
                    id="form"
                    method="POST"
                    modelAttribute="user">

                <!-- email field -->
                <div class="col-md-8">
                    <form:label path="emailAddress" class="form-label"><spring:message code="emailFormLabel"/></form:label>
                    <form:input type="email" class="form-control" path="emailAddress"/>
                </div>

                <!-- password field -->
                <div class="col-md-8">
                    <form:label path="password" class="form-label"><spring:message code="passwordFormLabel"/></form:label>
                    <form:input type="password" class="form-control" path="password"/>
                </div>

                <!-- submit button -->
                <div class="col-12" style="padding-top: 20px">
                    <button type="submit" class="btn btn-outline-warning"><spring:message code="validateButtonLabel"/></button>
                </div>

                <!-- signup button -->
                <div style="padding-top: 5px; font-size: 12px;">
                    <a class="link-secondary" href='<spring:url value="/inscription"/>'><spring:message code="signUpButton"/></a>
                </div>

            </form:form>
        </div>

        <!--image -->
        <img src='<spring:url value="/images/Logos/bearWaving.png"/>' alt="welcome bear image"/>

    </div>
</section>
<!-- ========================= END SECTION CONTENT ========================= -->
