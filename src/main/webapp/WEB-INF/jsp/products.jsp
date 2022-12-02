<!DOCTYPE html>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>


<!-- ========================= SECTION PRODUCTS CONTENT ========================= -->
    <section id = "products">

        <!-- title -->
        <h1>${categoryChosen.toLowerCase()}</h1>
        <!-- products -->
        <ul id = "container">
            <c:forEach items="${products}" var="product">
                <!-- product -->
                <li class="card">
                    <!-- product photo -->
                    <img src='<spring:url value="/images/${categoryChosenInFrench}/products/${product.getName()}.png"/>' alt="${product.getName()}.png">
                    <h2>${product.getName()}</h2>
                    <a class="btn btn-light" style="--bs-btn-padding-y: 1rem; --bs-btn-padding-x: 1rem; --bs-btn-font-size: 2rem;" href='<spring:url value="/detailsProduct/${product.getId()}"/>'><spring:message code="productDetails"/></a>
                </li>
            </c:forEach>
        </ul>

    </section>
<!-- ========================= SECTION PRODUCTS CONTENT END ========================= -->