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

    @Column(name = "authorities")
    private String authorities;

    @Column(name = "non_expired")
    private Boolean nonExpired;

    @Column(name = "non_locked")
    private Boolean nonLocked;

    @Column(name ="credentials_non_expired")
    private Boolean credentialsNonExpired;

    @Column(name = "enabled")
    private Boolean enabled;

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

    public String getAuthorities() {
        return authorities;
    }

    public Boolean getNonExpired() {
        return nonExpired;
    }

    public Boolean getNonLocked() {
        return nonLocked;
    }

    public Boolean getCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    public Boolean getEnabled() {
        return enabled;
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

    public void setNonExpired(Boolean nonExpired) {
        this.nonExpired = nonExpired;
    }

    public void setNonLocked(Boolean nonLocked) {
        this.nonLocked = nonLocked;
    }

    public void setCredentialsNonExpired(Boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    //endregion
}

