<!DOCTYPE html>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>


<!-- ========================= SECTION PRODUCT DETAIL CONTENT ========================= -->

<section>
    <!-- main container -->
    <div class="container">
        <!-- card container -->
        <div class="card">
            <!-- body -->
            <div class="card-body">
                <!-- title -->
                <h3 class="card-title">${product.getName()}</h3>
                <!-- product -->
                <div class="row">
                    <div class="col-lg-5 col-md-5 col-sm-6">
                        <div class="white-box text-center"><img id = "product-image" src='<spring:url value="/images/${categoryChosenInFrench}/${product.getName()}.png"/>' class="img-responsive"/></div>
                    </div>
                    <!-- description -->
                    <div class="col-lg-7 col-md-5 col-sm-6">
                        <h4 class="box-title mt-5">Description:</h4>
                        <p>${product.getDescription()}</p>
                        <!-- price -->
                        <h2 class="mt-4">${product.getPriceCatalog()}€</h2>
                        <button id="addButton" class="btn btn-light btn-rounded"><spring:message code="addCartButton"/></button>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- popup quantity-->
    <div id="addModal">
        <div id="modalContent">
            <span class="close">&times;</span>
            <%--@elvariable id="lineOrder" type=""--%>
            <form:form
                    id="addToCartForm"
                    action="/foodWebsite/cart/add/${idProduct}"
                    method="POST"
                    modelAttribute="lineOrder">
                <form:label path="quantity"><spring:message code="quantitySelectLabel"/></form:label>
                <form:input path="quantity" type="number" value="1" step="1" min="1"/>
                <form:errors path="quantity"/>
                <form:button id="confirmButton" class="btn btn-light"><spring:message code="add"/></form:button> <!-- ce bouton gère l'ajout au panier -->
            </form:form>
        </div>
    </div>
    <script>
        // Get the modal
        let modal = document.getElementById("addModal");

        // Get the button that opens the modal
        let btn = document.getElementById("addButton");

        // Get the <span> element that closes the modal
        let span = document.getElementsByClassName("close")[0];

        // When the user clicks on the button, open the modal
        btn.onclick = function () {
            modal.style.display = "block";
        }

        // When the user clicks on <span> (x), close the modal
        span.onclick = function() {
            modal.style.display = "none";
        }

        // When the user clicks anywhere outside of the modal, close it
        window.onclick = function(event) {
            if (event.target == modal) {
                modal.style.display = "none";
            }
        }
    </script>

</section>


<!-- ========================= END SECTION PRODUCT DETAIL CONTENT ========================= -->