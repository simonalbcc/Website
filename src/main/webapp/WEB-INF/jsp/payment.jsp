<!DOCTYPE html>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>

<c:set scope="page" var="total" value="${Math.round(cart.values().stream().map(value -> value.getQuantity() * value.getProduct().getPriceCatalog()).reduce(0, (a, b) -> a + b) * 100.) / 100.}" />


<section>

        <header>
            <h1><spring:message code="checkout"/></h1>
        </header>

        <div>
            <h2><spring:message code="informations"/></h2>

            <div class="card">
                <!-- mettre les infos de l'utilisateur -> pb avec pageContext.request.userPrincipal.principal.lastName -->
            </div>
        </div>

        <fieldset>
            <legend><spring:message code="paymentMethod"/></legend>
                <label class="paymentsMethods">
                    <svg class="icon">
                        <use xlink:href="#icon-paypal" />
                    </svg>PayPal
                </label>
        </fieldset>

        <div>
            <h2><spring:message code="shoppingBill"/></h2>
            <table>
                <tbody>
                <tr>
                    <td><spring:message code="discount"/></td>
                    <td>-${total}<spring:message code="currencySymbol"/></td>
                </tr>
                <tr>
                    <td><spring:message code="totalPrice"/></td>
                    <td>${total}<spring:message code="currencySymbol"/></td>
                </tr>
                </tbody>
                <tfoot>
                <tr>
                    <td><spring:message code="total"/></td>
                    <td>${total}<spring:message code="currencySymbol"/></td>
                </tr>
                </tfoot>
            </table>
        </div>

        <div id = "button-container">
            <form action="https://www.sandbox.paypal.com/cgi-bin/webscr" method="post">
                <input hidden name="business" value="fabriceLeGiletJaune@business.example.com"/>
                <input hidden name="cert_id" value="emilienAssiette@personal.example.com" />
                <input hidden name="cmd" value="_xclick" />
                <input hidden name="amount" value="${total}" />
                <input hidden name="lc" value="fr_BE" />
                <input hidden name="currency_code" value="EUR" />
                <input hidden name="return" value="http://localhost:8082/foodWebsite/welcome" />
                <input hidden name="cancel_return" value="http://localhost:8082/foodWebsite/menu" />
                <input id="button" type="image" style="margin: auto" onclick="" src="<spring:url value='/images/paypal_logo.png' />" />
            </form>
        </div>

        <svg xmlns="http://www.w3.org/2000/svg" style="display: none">
        <symbol id="icon-shopping-bag" viewBox="0 0 24 24">
            <path d="M20 7h-4v-3c0-2.209-1.791-4-4-4s-4 1.791-4 4v3h-4l-2 17h20l-2-17zm-11-3c0-1.654 1.346-3 3-3s3 1.346 3 3v3h-6v-3zm-4.751 18l1.529-13h2.222v1.5c0 .276.224.5.5.5s.5-.224.5-.5v-1.5h6v1.5c0 .276.224.5.5.5s.5-.224.5-.5v-1.5h2.222l1.529 13h-15.502z" />
        </symbol>
        <symbol id="icon-paypal" viewBox="0 0 491.2 491.2">
            <path d="m392.049 36.8c-22.4-25.6-64-36.8-116-36.8h-152.8c-10.4 0-20 8-21.6 18.4l-64 403.2c-1.6 8 4.8 15.2 12.8 15.2h94.4l24-150.4-.8 4.8c1.6-10.4 10.4-18.4 21.6-18.4h44.8c88 0 156.8-36 176.8-139.2.8-3.2.8-6.4 1.6-8.8-2.4-1.6-2.4-1.6 0 0 5.6-38.4 0-64-20.8-88" fill="#263b80" />
            <path d="m412.849 124.8c-.8 3.2-.8 5.6-1.6 8.8-20 103.2-88.8 139.2-176.8 139.2h-44.8c-10.4 0-20 8-21.6 18.4l-29.6 186.4c-.8 7.2 4 13.6 11.2 13.6h79.2c9.6 0 17.6-7.2 19.2-16l.8-4 15.2-94.4.8-5.6c1.6-9.6 9.6-16 19.2-16h12c76.8 0 136.8-31.2 154.4-121.6 7.2-37.6 3.2-69.6-16-91.2-6.4-7.2-13.6-12.8-21.6-17.6" fill="#139ad6" />
            <path d="m391.249 116.8c-3.2-.8-6.4-1.6-9.6-2.4s-6.4-1.6-10.4-1.6c-12-2.4-25.6-3.2-39.2-3.2h-119.2c-3.2 0-5.6.8-8 1.6-5.6 2.4-9.6 8-10.4 14.4l-25.6 160.8-.8 4.8c1.6-10.4 10.4-18.4 21.6-18.4h44.8c88 0 156.8-36 176.8-139.2.8-3.2.8-6.4 1.6-8.8-4.8-2.4-10.4-4.8-16.8-7.2-1.6 0-3.2-.8-4.8-.8" fill="#232c65" />
            <path d="m275.249 0h-152c-10.4 0-20 8-21.6 18.4l-36.8 230.4 246.4-246.4c-11.2-1.6-23.2-2.4-36-2.4z" fill="#2a4dad" />
            <path d="m441.649 153.6c-2.4-4-4-8-7.2-12-5.6-6.4-13.6-12-21.6-16.8-.8 3.2-.8 5.6-1.6 8.8-20 103.2-88.8 139.2-176.8 139.2h-44.8c-10.4 0-20 8-21.6 18.4l-25.6 161.6z" fill="#0d7dbc" />
            <path d="m50.449 436.8h94.4l23.2-145.6c0-2.4.8-4 1.6-5.6l-131.2 131.2-.8 4.8c-.8 8 4.8 15.2 12.8 15.2z" fill="#232c65" />
            <path d="m246.449 0h-123.2c-3.2 0-5.6.8-8 1.6l-12 12c-.8 1.6-1.6 3.2-1.6 4.8l-24 150.4z" fill="#436bc4" />
            <path d="m450.449 232.8c2.4-12 3.2-23.2 3.2-34.4l-156 156c76-.8 135.2-32 152.8-121.6z" fill="#0cb2ed" />
            <path d="m248.849 471.2 12.8-80-100 100h68c9.6 0 17.6-7.2 19.2-16z" fill="#0cb2ed" />
            <g fill="#33e2ff" opacity=".6">
                <path d="m408.049 146.4 45.6 45.6c0-5.6-1.6-11.2-2.4-16.8l-40-40c-1.6 4-2.4 7.2-3.2 11.2z" />
                <path d="m396.849 180c-1.6 3.2-3.2 6.4-4.8 9.6l55.2 55.2c.8-4 1.6-8 2.4-12z" />
                <path d="m431.249 287.2c1.6-3.2 3.2-6.4 4.8-9.6l-60.8-60.8c-2.4 2.4-4 5.6-6.4 8z" />
                <path d="m335.249 250.4 69.6 69.6 7.2-7.2-68-68c-3.2 1.6-5.6 3.2-8.8 5.6z" />
                <path d="m292.849 266.4 76 76c3.2-1.6 6.4-3.2 9.6-4.8l-74.4-74.4c-4 .8-7.2 2.4-11.2 3.2z" />
                <path d="m320.849 353.6c4-.8 8.8-.8 12.8-1.6l-80-80c-4.8 0-8.8.8-13.6.8z" />
                <path d="m196.049 272.8h-6.4c-2.4 0-4.8.8-6.4.8l86.4 87.2c2.4-2.4 5.6-4.8 8.8-5.6z" />
                <path d="m164.049 314.4 94.4 94.4 2.4-12.8-94.4-94.4z" />
                <path d="m156.049 364.8 94.4 94.4 2.4-12-94.4-94.4z" />
                <path d="m150.449 403.2-1.6 12.8 75.2 75.2h5.6c2.4 0 4.8-.8 7.2-1.6z" />
                <path d="m140.049 466.4 24.8 24.8h14.4l-36.8-36.8z" />
            </g>
        </symbol>
    </svg>

</section>