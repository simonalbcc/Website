package foodWebsiteProject.dataAccess.entity;

import foodWebsiteProject.model.LineOrder;

import javax.persistence.*;
import javax.sound.sampled.Line;

@Entity
@Table(name = "line_order")
public class LineOrderEntity {

    @Id
    @Column(name="id_line")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLine;

    @Column(name="real_price")
    private Float realPrice;

    @Column(name ="quantity")
    private Integer quantity;

    @JoinColumn(name="product", referencedColumnName = "id")
    @ManyToOne
    private ProductEntity product;

    @JoinColumn(name="order_user", referencedColumnName = "id")
    @ManyToOne
    private OrderEntity order;

    public LineOrderEntity(){

    }

    //region getter
    public Integer getIdLine() {
        return idLine;
    }

    public Float getRealPrice() {
        return realPrice;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public OrderEntity getOrder() {
        return order;
    }

    public Integer getQuantity() {
        return quantity;
    }

    //endregion

    //region setter
    public void setIdLine(Integer idLine) {
        this.idLine = idLine;
    }

    public void setRealPrice(Float realPrice) {
        this.realPrice = realPrice;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }

    public void setOrder(OrderEntity order) {
        this.order = order;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    //endregion
}
