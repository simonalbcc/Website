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
                    <div class="col-md-2">
                        <img class="product-image" src='<spring:url value="/images/${categoriesChosenInFrench[lineOrder.getValue().getProduct().getCategory().getId()-1]}/${lineOrder.getValue().getProduct().getName()}.png"/>' class="img-responsive"/>
                    </div>

                    <!-- name -->
                    <div class="col-md-2 col-lg-3 col-xl-3">
                        <p class="lead fw-normal mb-2">${lineOrder.getValue().getProduct().getName()}</p>
                    </div>

                    <!-- quantity manager -->
                    <div class="col-md-3 col-lg-3 col-xl-2 d-flex">
                        <p class="lead fw-normal mb-2"><spring:message code="quantity"/> : ${lineOrder.getValue().getQuantity()}</p>
                    </div>
                    <div class="col-md-3 col-lg-3 col-xl-2 d-flex">
                        <button id="modifyButton" class="btn btn-light btn-rounded"><spring:message code="modifyButton"/></button>
                    </div>
                    <!-- price -->
                    <div class="col-md-1 col-lg-2 col-xl-2">
                        <h5 class="mb-0"><spring:message code="price"/> : ${lineOrder.getValue().getRealPrice()}</h5>
                    </div>

                    <!-- quantity remover -->
                    <div class="col-md-1 col-lg-1 col-xl-1">
                        <form:form
                                action="/foodWebsite/cart/delete/${lineOrder.getValue().getProduct().getId()}"
                                method="POST"
                                modelAttribute="lineOrder">
                            <form:button id="deleteButton">
                                <img class="bin" src='<spring:url value="/images/Logos/bin.png"/>'/>
                            </form:button>

                        </form:form>
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
                        id="modifyQuantityForm"
                        action="/foodWebsite/cart/update/${lineOrder.getValue().getProduct().getId()}"
                        method="POST"
                        modelAttribute="lineOrder">
                    <form:label path="quantity"><spring:message code="quantitySelectLabel"/></form:label>
                    <form:input path="quantity" type="number" value="${lineOrder.getValue().getQuantity()}" step="1" min="0"/>
                    <form:button id="confirmButton" class="btn btn-light"><spring:message code="add"/></form:button> <!-- ce bouton gère l'ajout au panier -->
                </form:form>
            </div>
        </div>
    </c:forEach>
</section>
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
<!-- ========================= END SECTION CONTENT ========================= -->