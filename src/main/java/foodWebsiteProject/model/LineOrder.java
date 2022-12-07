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

    private Order orderUser;

    public LineOrder(){

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

    public Order getOrderUser() {
        return orderUser;
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

    public void setOrderUser(Order orderUser) {
        this.orderUser = orderUser;
    }
}
