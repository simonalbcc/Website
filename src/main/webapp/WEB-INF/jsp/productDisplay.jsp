<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>
<html>
<head>
    <meta charset="utf-8">
    <title>Menu</title>
    <link rel="stylesheet" href='<spring:url value="/css/product.css"/>' type="text/css">
    <link rel="stylesheet" href='<spring:url value="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"/>' type="text/css">
</head>
    <body>
        <h2>Les {produits sélectionnés}</h2>
        <table id = "produits">
            <tr>
                <div class="card">
                    <div class="photo">
                        <img src='<spring:url value="/images/san1.jpg"/>'>
                    </div>
                    <div class="description">
                        <h2>Le classique</h2>
                        <h4>ingrédients</h4>
                        <h1>7€</h1>
                        <p>Le classique. Il fait l'affaire.</p>
                        <button>Ajouter au panier</button>
                    </div>
                </div>
            </tr>
            <tr>
                <div class="card">
                    <div class="photo">
                        <img src='<spring:url value="/images/san1.jpg"/>'>
                    </div>
                    <div class="description">
                        <h2>Le classique</h2>
                        <h4>ingrédients</h4>
                        <h1>7€</h1>
                        <p>Le classique. Il fait l'affaire.</p>
                        <button>Ajouter au panier</button>
                    </div>
                </div>
            </tr>
        </table>
    </body>
</html>