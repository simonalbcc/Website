<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@include file="../include/importTags.jsp"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>

    <head>
        <meta charset="UTF-8">
        <title>Food Website</title>
        <link rel="stylesheet" href='<spring:url value="/css/styleTemplate.css"/>' type="text/css">
        <link rel="stylesheet" href='<spring:url value="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css"/>' integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    </head>
    <body>
        <div>
            <nav class="navbar navbar-light" style = "background-color: #ff9500;">

                <a class="navbar-brand" href="#">
                    <div id = "leftCorner">
                        <img id = "logo" src= '<spring:url value ="/images/bearEating.png"/>' >
                        <h2 class="text-uppercase font-weight-bold">La sandwicherie de l'ours</h2>
                    </div>
                </a>

                <ul class="nav">
                    <li class="nav-item">
                        <a class="nav-link text-uppercase font-weight-bold" href="#">menu</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link text-uppercase font-weight-bold" href="#">Contact</a>
                    </li>
                </ul>



                <form class="form-inline">
                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-light my-1 my-sm-0" type="submit">Rechercher</button>
                </form>
            </nav>
        </div>
        <div>
            <tiles:insertAttribute name="main-content"/>
        </div>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.3/dist/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
    <footer>ici on met des trucs</footer>
</html>