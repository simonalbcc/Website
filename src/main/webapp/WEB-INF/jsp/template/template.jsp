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
        <link rel="stylesheet" href='<spring:url value="/css/styleTemplate.css"/>' type="text/css">
    <body class = "mainContainer">
        <header>
            <nav>
                <a href="index.html"><img src='<spring:url value="/images/bearEating.png"/>'/></a>
                <h1>La sandwicherie des ours</h1>
                <div class="nav-links">
                    <ul>
                        <li><a href="">MENU</a></li>
                        <li><a href="">panier</a></li>
                        <li><a href="">langue</a></li>
                        <li><a href="">profile</a></li>
                    </ul>
                </div>
            </nav>
        <div class = "text-box">
            <img src='<spring:url value="/images/welcomeBear.png"/>'/>
        </div>
        </header>


    </body>

</html>