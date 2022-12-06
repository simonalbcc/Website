<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!-- ========================= SECTION CONTENT ========================= -->
<section>
    <c:forEach items="${cart}" var="lineOrder" >
        <!-- line cart -->
        <div class="card rounded-3 mb-4">
            <div class="card-body p-4">
                <div class="row d-flex justify-content-between align-items-center">
                    <!-- image product -->
                    <div class="col-md-2 col-lg-2 col-xl-2">
                        <img id = "product-image" src='<spring:url value="/images/${categoriesChosenInFrench[0]}/${lineOrder.getValue().getProduct().getName()}.png"/>' class="img-responsive"/>
                    </div>

                    <!-- name -->
                    <div class="col-md-3 col-lg-3 col-xl-3">
                        <p class="lead fw-normal mb-2">${lineOrder.getValue().getProduct().getName()}</p>
                    </div>

                    <!-- quantity manager -->
                    <div class="col-md-3 col-lg-3 col-xl-2 d-flex">
                        <p>Quantité : ${lineOrder.getValue().getQuantity()}</p>
                        <button id="modifyButton" class="btn btn-light btn-rounded">Modifier</button>
                    </div>
                    <!-- popup quantity-->
                    <div id="addModal">
                        <div id="modalContent">
                            <span class="close">&times;</span>
                                <%--@elvariable id="lineOrder" type=""--%>
                            <form:form
                                    id="modifyQuantityForm"
                                    action="/foodWebsite/cart/update/${lineOrder.getValue().getProduct().getId()}"
                                    method="POST"
                                    modelAttribute="lineOrder">
                                <form:label path="quantity"><spring:message code="quantitySelectLabel"/></form:label>
                                <form:input path="quantity" type="number" value="5" step="1" min="0"/>
                                <form:button id="confirmButton" class="btn btn-light"><spring:message code="add"/></form:button> <!-- ce bouton gère l'ajout au panier -->
                            </form:form>
                        </div>
                    </div>
                    <!-- price -->
                    <div class="col-md-3 col-lg-2 col-xl-2 offset-lg-1">
                        <h5 class="mb-0">${lineOrder.getValue().getRealPrice()}</h5>
                    </div>

                    <!-- quantity remover -->
                    <div class="col-md-1 col-lg-1 col-xl-1 text-end">
                        <!-- TODO Image poubelle -->
                    </div>
                </div>
            </div>
        </div>
        <script>
            // Get the modal
            let modal = document.getElementById("addModal");

            // Get the button that opens the modal
            let btn = document.getElementById("modifyButton");

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
    </c:forEach>

</section>
<!-- ========================= END SECTION CONTENT ========================= -->