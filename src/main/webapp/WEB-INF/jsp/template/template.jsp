<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@include file="../include/importTags.jsp"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<!-- ========================= SECTION HEAD ========================= -->
<head>
    <meta charset="UTF-8">
    <!-- Custom fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,700;1,300;1,400&display=swap" rel="stylesheet">

    <!-- Bootstrap5 files & bootstrap javascript -->
    <link rel="stylesheet" href='<spring:url value="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"/>' type="text/css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous" ></script>

    <!-- css files -->
    <link rel="stylesheet" href='<spring:url value="/css/${cssName}.css"/>' type="text/css">
    <link rel="stylesheet" href='<spring:url value="/css/template.css"/>' type="text/css">

    <!-- translate section -->
    <section>
        <spring:url var="localFr" value="">
            <spring:param name="local" value="fr"/>
        </spring:url>

        <spring:url var="localEn" value="">
            <spring:param name="local" value="en"/>
        </spring:url>
    </section>


    <!-- tab title -->
    <title>${tabTitle}</title>

</head>
<!-- ========================= END SECTION HEAD ========================= -->


<!-- ========================= SECTION BODY ========================= -->
    <body>
        <!-- top -->
        <section id = "top-container">
            <nav>

                <!-- logo -->
                <a href='<spring:url value="/welcome"/>'>
                    <img src='<spring:url value="/images/Logos/bearEating.png"/>'/>
                </a>

                <!-- shop name -->
                <h1><spring:message code ="shopName" /></h1>

                <!-- navigation bar -->
                <div class="nav-links">
                    <ul>
                        <!-- menu -->
                        <li><a href='<spring:url value="/menu"/>'><spring:message code="menuNavBarLabel"/></a></li>

                        <!-- cart -->
                        <li><a href='<spring:url value="/cart"/>'><spring:message code="cartNavBarLabel"/></a></li>

                        <!-- languages -->
                        <li class = "nav-item dropdown">
                            <a role="button" style= "color:white" data-bs-toggle="dropdown" aria-expanded="false">
                                <spring:message code="languagesNavBarLabel"/>
                            </a>
                            <ul class="dropdown-menu">
                                <li><button class="dropdown-item" onclick="location.href='${localFr}'"> <img class ="flag" src='<spring:url value="/images/Logos/france.png"/>'/></button></li>
                                <li><button class="dropdown-item" onclick="location.href='${localEn}'"> <img class ="flag" src='<spring:url value="/images/Logos/united-kingdom.png"/>'/></button></li>
                            </ul>
                        </li>

                        <!-- profile  -->
                        <li class = "nav-item dropdown">
                            <a role="button" style= "color:white" data-bs-toggle="dropdown" aria-expanded="false">
                                <spring:message code="profileNavBarLabel"/>
                            </a>
                            <ul class="dropdown-menu">
                                <sec:authorize access="!isAuthenticated()">
                                    <li><a class="dropdown-item" style="color:white" href='<spring:url value="/login"/>'><spring:message code="logInButton"/></a></li>
                                </sec:authorize>
                                <sec:authorize access="isAuthenticated()">
                                    <li><a class="dropdown-item" style="color:white" href='<spring:url value="/logout"/>'><spring:message code="logOutButton"/></a></li>
                                    <li><a class="dropdown-item" style="color:white" href='<spring:url value="/editProfile"/>'><spring:message code="editProfileButton"/></a></li>
                                </sec:authorize>
                            </ul>
                        </li>
                    </ul>
                </div>
            </nav>

            <!-- personnalized message -->
            <sec:authorize access="isAuthenticated()">
                <div id ="userBanner">
                    <p><spring:message code="welcomeMessage"/> ${pageContext.request.userPrincipal.principal.firstName} </p>
                </div>
            </sec:authorize>

        </section>

        <!-- main content -->
        <section id = "main-container">
            <div class = "container">
                <tiles:insertAttribute name="main-content"/>
            </div>
        </section>

        <!-- footer -->
        <div id = "spacer"></div>
        <div id = "footer-container">
            <p><spring:message code="contactLabel"/></p>
        </div>
    </body>
<!-- ========================= END SECTION BODY ========================= -->
</html>