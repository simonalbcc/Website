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
        <link rel="stylesheet" href='<spring:url value="/css/template.css"/>' type="text/css">
    <body class = "mainContainer">
        <header>
            <nav>
                <a href="index.html"><img src='<spring:url value="/images/bearEating.png"/>'/></a>
                <h1>La sandwicherie des ours</h1>
                <div class="nav-links">
                    <ul>
                        <li><a href="">MENU</a></li>
                        <li><a href="">PANIER</a></li>
                        <li><a href="">LANGUE</a></li>
                        <li><a href="">PROFILE</a></li>
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

</html>