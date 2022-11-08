<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@include file="../include/importTags.jsp"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>

    <head>
        <meta charset="UTF-8">
        <title>Food Website</title>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,700;1,300;1,400&display=swap" rel="stylesheet">
        <link rel="stylesheet" href='<spring:url value="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"/>' type="text/css">
        <link rel="stylesheet" href='<spring:url value="/css/template.css"/>' type="text/css">
    <body class = "mainContainer">
        <header>
            <nav>
                <a href='<spring:url value="/welcome"/>'><img src='<spring:url value="/images/bearEating.png"/>'/></a>
                <h1>La sandwicherie des ours</h1>
                <div class="nav-links">
                    <ul>
                        <li><a href='<spring:url value="/menu"/>'>MENU</a></li>
                        <li><a href='<spring:url value="/panier"/>'>PANIER</a></li>

                        <li class = "nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            LANGUES
                            </a>
                            <ul class="dropdown-menu">
                                <li><button class="dropdown-item"> <img class ="flag" src='<spring:url value="/images/france.png"/>'/></button></li>
                                <li><button class="dropdown-item"> <img class ="flag" src='<spring:url value="/images/united-kingdom.png"/>'/></button></li>
                            </ul>
                        </li>

                        <li class = "nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                PROFILE
                            </a>
                            <ul class="dropdown-menu">
                                <li><button class="btn btn-warning dropdown-item">CONNEXION</button></li>
                            </ul>
                        </li>

                        <li><input type="text" placeholder="Rechercher.."></li>
                    </ul>
                </div>
            </nav>
            <div id ="userBanner">
                <p>Bonjour {user} </p>
            </div>
            <div id = "content">
                <tiles:insertAttribute name="main-content"/>
            </div>
        </header>


    </body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
</html>