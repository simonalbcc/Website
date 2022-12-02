<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>

<!-- ========================= SECTION WELCOME CONTENT ========================= -->
<section>
    <div id = "middle-container">
        <!-- image -->
        <div>
            <img src='<spring:url value="/images/Logos/welcomeBear.png"/>'/>
        </div>

        <!-- button  -->
        <div>
            <a class="btn btn-light btn-lg" href='<spring:url value="/contact"/>'><spring:message code="aboutUsButton"/></a>
        </div>

    </div>
</section>
<!-- ========================= END SECTION WELCOME CONTENT ========================= -->

