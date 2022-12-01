<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>

<!-- ========================= SECTION CONTENT ========================= -->
<section>
    <div id = "middle-container">
        <!-- button left -->
        <a class="btn btn-light" style="--bs-btn-padding-y: 1rem; --bs-btn-padding-x: 1rem; --bs-btn-font-size: 2rem;" href='<spring:url value="/products/${categories.get(0).getCategoryName()}"/>'>${categories.get(0).getCategoryName()}</a>

        <!-- image -->
        <img src='<spring:url value="/images/Logos/welcomeBear.png"/>' alt="welcome bear image"/>

        <!-- button right -->
        <a class="btn btn-light" style="--bs-btn-padding-y: 1rem; --bs-btn-padding-x: 1rem; --bs-btn-font-size: 2rem;" href='<spring:url value="/products/${categories.get(0).getCategoryName()}"/>'>${categories.get(1).getCategoryName()}</a>
    </div>
</section>
<!-- ========================= END SECTION CONTENT ========================= -->
