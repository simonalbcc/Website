package foodWebsiteProject.dataAccess.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "order_user")
public class OrderEntity {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="date")
    private Date date;

    @Column(name="is_paid")
    private Boolean isPaid;

    @JoinColumn(name="user", referencedColumnName="email")
    @ManyToOne
    private UserEntity user;

    public OrderEntity(){

    }

    //region getter
    public Integer getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public Boolean getPaid() {
        return isPaid;
    }

    public UserEntity getUser() {
        return user;
    }
    //endregion

    //region setter
    public void setId(Integer id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPaid(Boolean paid) {
        isPaid = paid;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
    //endregion
}
