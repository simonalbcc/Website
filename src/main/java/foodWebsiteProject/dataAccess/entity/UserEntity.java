package foodWebsiteProject.dataAccess.entity;

import javax.persistence.*;


@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @Column(name = "email")
    private String emailAddress;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "password")
    private String password;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String numberPhone;

    @Column(name = "fidelity_card")
    private Integer fidelityCard;

    //region getter
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getAddress() {
        return address;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public Integer getFidelityCard() {
        return fidelityCard;
    }
//endregion

//region setter
    public void setFirstName(String firstName) {
    this.firstName = firstName;
}

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public void setFidelityCard(Integer fidelityCard) {
        this.fidelityCard = fidelityCard;
    }
    //endregion
}

