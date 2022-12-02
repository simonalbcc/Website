<!DOCTYPE html>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>


<!-- ========================= SECTION PRODUCT DETAIL CONTENT ========================= -->

<section>
    <div class="container">
        <div class="card">
            <div class="card-body">
                <h3 class="card-title">${product.getName()}</h3>
                <div class="row">
                    <div class="col-lg-5 col-md-5 col-sm-6">
                        <div class="white-box text-center"><img id = "product-image" src='<spring:url value="/images/${categoryChosenInFrench}/${product.getName()}.png"/>' class="img-responsive"/></div>
                    </div>
                    <div class="col-lg-7 col-md-5 col-sm-6">
                        <h4 class="box-title mt-5">Description:</h4>
                        <p>${product.getDescription()}</p>
                        <h2 class="mt-4">${product.getPriceCatalog()}€</h2>
                        <button class="btn btn-light btn-rounded"><spring:message code="addCartButton"/></button>
                    </div>
                </div>
            </div>
        </div>
    </div>

</section>


<!-- ========================= END SECTION PRODUCT DETAIL CONTENT ========================= -->