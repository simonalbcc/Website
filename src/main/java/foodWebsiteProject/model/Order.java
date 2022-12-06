package foodWebsiteProject.model;

import java.util.Date;

public class Order {
    private Integer id;
    private Date date;
    private Boolean isPaid;
    private User user;

    public Order(){

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

    public User getUser() {
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

    public void setUser(User user) {
        this.user = user;
    }
    //endregion
}
