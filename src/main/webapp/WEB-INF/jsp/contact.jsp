<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>

<!-- ========================= SECTION CONTENT ========================= -->
<section>
    <div id = "middle-container">
        <div id="contact-text">
            <p><spring:message code ="contactText"/></p>
            <p><spring:message code ="mail"/></p>
            <p><spring:message code ="phoneNumber"/></p>
        </div>
        <a class="btn btn-light" href='<spring:url value="/welcome"/>'><spring:message code ="backButton"/></a>
    </div>
</section>
<!-- ========================= END SECTION CONTENT ========================= -->
