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

        <spring:url var="localFr" value="">
            <spring:param name="local" value="fr"/>
        </spring:url>

        <spring:url var="localEn" value="">
            <spring:param name="local" value="en"/>
        </spring:url>

    </head>
    <body class = "mainContainer">
        <header>
            <nav>
                <a href='<spring:url value="/welcome"/>'><img src='<spring:url value="/images/Logos/bearEating.png"/>'/></a>
                <h1><spring:message code ="shopName" /></h1>
                <div class="nav-links">
                    <ul>
                        <li><a href='<spring:url value="/menu"/>'><spring:message code="menuNavBarLabel"/></a></li>
                        <li><a href='<spring:url value="/panier"/>'><spring:message code="cartNavBarLabel"/></a></li>
                        <li class = "nav-item dropdown">
                            <a class="nav-link dropdown-toggle" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                <spring:message code="languagesNavBarLabel"/>
                            </a>
                            <ul class="dropdown-menu">
                                <li><button class="dropdown-item" onclick="location.href='${localFr}'"> <img class ="flag" src='<spring:url value="/images/Logos/france.png"/>'/></button></li>
                                <li><button class="dropdown-item" onclick="location.href='${localEn}'"> <img class ="flag" src='<spring:url value="/images/Logos/united-kingdom.png"/>'/></button></li>
                            </ul>
                        </li>

                        <li class = "nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                <spring:message code="profileNavBarLabel"/>
                            </a>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" style="color:black" href='<spring:url value="/connection"/>'><spring:message code="logInButton"/></a></li>
                            </ul>
                        </li>

                        <li><input type="text" placeholder="<spring:message code="searchBarDefaultText"/>"></li>
                    </ul>
                </div>
            </nav>
            <div id ="userBanner">
                <p><spring:message code="welcomeMessage"/> {user} </p>
            </div>
        </header>
        <div id = "mainContent">
            <tiles:insertAttribute name="main-content"/>
        </div>
        <footer>
            <p><spring:message code="contactLabel"/></p>
        </footer>
    </body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous" ></script>
</html>