package foodWebsiteProject.model;

public class LineOrder {
    private Integer idLine;
    private Float realPrice;
    private Integer quantity;
    private Product product;
    private User orderUser;

    public LineOrder(){

    }

    // getters
    public Integer getIdLine() {
        return idLine;
    }

    public Float getRealPrice() {
        return realPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public User getOrderUser() {
        return orderUser;
    }

    // setters
    public void setIdLine(Integer idLine) {
        this.idLine = idLine;
    }

    public void setRealPrice(Float realPrice) {
        this.realPrice = realPrice;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setOrderUser(User orderUser) {
        this.orderUser = orderUser;
    }
}
