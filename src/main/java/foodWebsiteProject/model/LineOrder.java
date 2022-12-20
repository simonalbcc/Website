package foodWebsiteProject.model;

import javax.validation.constraints.Min;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class LineOrder {

    private Integer idLine;

    private Double realPrice;
    @Min(value = 1)
    @NotNull
    private Integer quantity;

    private Product product;

    private Order order;

    public LineOrder(){

    }

    public LineOrder(Double realPrice, Integer quantity){
        this.realPrice = realPrice;
        this.quantity = quantity;
    }

    // getters
    public Integer getIdLine() {
        return idLine;
    }

    public Double getRealPrice() {
        return realPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public Order getOrder() {
        return order;
    }

    // setters
    public void setIdLine(Integer idLine) {
        this.idLine = idLine;
    }

    public void setRealPrice(Double realPrice) {
        this.realPrice = realPrice;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
