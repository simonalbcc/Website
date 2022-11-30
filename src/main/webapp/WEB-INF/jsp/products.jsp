<!DOCTYPE html>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>

<!-- js custom script -->
<script>
    // Get the modal
    let modal = document.getElementById("addModal");

    // Get the button that opens the modal
    let btns = document.getElementsByClassName("addButtons");

    // Get the <span> element that closes the modal
    let span = document.getElementsByClassName("close")[0];

    // When the user clicks on the button, open the modal
    for(let btn of btns) {
        btn.onclick = function () {
            modal.style.display = "block";
        }
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

<!-- ========================= SECTION PRODUCTS CONTENT ========================= -->
    <section>

        <!-- title -->
        <h2>Les ${categoryChosen}</h2>
        <!-- products -->
        <table>
            <c:forEach items="${products}" var="product">
            <tr>
                <!-- product -->
                <div class="card">
                    <!-- product photo -->
                    <div class="photo">
                        <img src='<spring:url value="/images/Sandwichs/${product.getName()}.png"/>'>
                    </div>

                    <!-- product description -->
                    <div class="description">
                        <h2>${product.getName()}</h2>
                        <p>${product.getPriceCatalog()}</p>
                        <button class="addButtons"><spring:message code="addCartButton"/></button>
                    </div>

                </div>
            </tr>
            </c:forEach>
        </table>

        <!-- details modal -->
        <div id="addModal">
            <div id="modalContent">
                <span class="close">&times;</span>
                <p><spring:message code ="quantitySelectLabel"/></p>
                <input type="number" placeholder="1" step="1" min="1"/>
                <button id="confirmButton" class="btn btn-light">Ajouter</button>
            </div>
        </div>

    </section>
<!-- ========================= SECTION PRODUCTS CONTENT END ========================= -->