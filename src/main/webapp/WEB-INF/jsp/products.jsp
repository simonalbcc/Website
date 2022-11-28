<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>
<html>
<head>
    <meta charset="utf-8">
    <title>${title}</title>
    <link rel="stylesheet" href='<spring:url value="/css/product.css"/>' type="text/css">
</head>
    <body>
        <h2>Les ${title}</h2>
        <table>
            <c:forEach items="${products}" var="product">
            <tr>
                <div class="card">
                    <div class="photo">
                        <img src='<spring:url value="/images/Sandwichs/${product.getName()}.png"/>'>
                    </div>
                    <div class="description">
                        <h2>${product.getName()}</h2>
                        <h4>${product.getDescription()}</h4>
                        <h4>Taille: ${product.getSize()}</h4>
                        <p>${product.getPriceCatalog()}</p>
                        <button class="addButtons"><spring:message code="addCartButton"/></button>
                    </div>
                </div>
            </tr>
            </c:forEach>
        </table>
        <div id="addModal">
            <div id="modalContent">
                <span class="close">&times;</span>
                <p><spring:message code ="quantitySelectLabel"/></p>
                <input type="number" placeholder="1" step="1" min="1"/>
                <button id="confirmButton" class="btn btn-light">Ajouter</button>
            </div>
        </div>
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
    </body>
</html>