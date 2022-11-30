<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>

<!-- ========================= SECTION CONTENT ========================= -->
<section>
    <div id = "middle-container">
        <!-- button left -->
        <a class="btn btn-light" style="--bs-btn-padding-y: 1rem; --bs-btn-padding-x: 1rem; --bs-btn-font-size: 2rem;" href='<spring:url value="/products/1"/>'><spring:message code ="pastaButton"/></a>

        <!-- image -->
        <img src='<spring:url value="/images/Logos/welcomeBear.png"/>' alt="welcome bear image"/>

        <!-- button right -->
        <a class="btn btn-light" style="--bs-btn-padding-y: 1rem; --bs-btn-padding-x: 1rem; --bs-btn-font-size: 2rem;" href='<spring:url value="/products/2"/>'><spring:message code ="sandwichButton"/></a>
    </div>
</section>
<!-- ========================= END SECTION CONTENT ========================= -->
