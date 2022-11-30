<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!-- ========================= SECTION CONTENT ========================= -->
<section>

    <!-- line cart -->
    <div class="card rounded-3 mb-4">
        <div class="card-body p-4">
            <div class="row d-flex justify-content-between align-items-center">
                <!-- image product -->
                <div class="col-md-2 col-lg-2 col-xl-2">
                    <!-- TODO Image produit -->
                </div>

                <!-- name -->
                <div class="col-md-3 col-lg-3 col-xl-3">
                    <p class="lead fw-normal mb-2"><!-- TODO nom produit --></p>
                    <p><span class="text-muted"><!-- TODO détails --></span>  <span class="text-muted"><!-- TODO détails --></span><!-- TODO détails --></p>
                </div>

                <!-- quantity manager -->
                <div class="col-md-3 col-lg-3 col-xl-2 d-flex">
                    <button class="btn btn-link px-2" onclick="this.parentNode.querySelector('input[type=number]').stepDown()">
                        <i class="fas fa-minus"></i>
                    </button>

                    <input id="form1" min="0" name="quantity" value="2" type="number" class="form-control form-control-sm" />

                    <button class="btn btn-link px-2" onclick="this.parentNode.querySelector('input[type=number]').stepUp()">
                        <i class="fas fa-plus"></i>
                    </button>
                </div>

                <!-- price -->
                <div class="col-md-3 col-lg-2 col-xl-2 offset-lg-1">
                    <h5 class="mb-0"><!-- TODO prix --></h5>
                </div>

                <!-- quantity remover -->
                <div class="col-md-1 col-lg-1 col-xl-1 text-end">
                    <!-- TODO Image poubelle -->
                </div>
            </div>
        </div>
    </div>

</section>
<!-- ========================= END SECTION CONTENT ========================= -->