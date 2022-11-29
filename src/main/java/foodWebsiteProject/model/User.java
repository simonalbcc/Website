package foodWebsiteProject.model;
import javax.validation.constraints.*;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class User implements UserDetails{
    @Size(max = 15)
    @Pattern(regexp = "[A-ZÀ-ÖØà-ÿa-z'-]{0,6}\\s[A-ZÀ-ÖØà-ÿa-z'-]{0,9}|[A-ZÀ-ÖØà-ÿa-z'-]{0,14}")
    @NotEmpty
    private String firstName;

    @Size(max = 15)
    @Pattern(regexp = "[A-ZÀ-ÖØà-ÿa-z'-]{0,6}\\s[A-ZÀ-ÖØà-ÿa-z'-]{0,9}|[A-ZÀ-ÖØà-ÿa-z'-]{0,14}")
    @NotEmpty
    private String lastName;

    @Size(max = 30)
    @NotEmpty
    private String password;

    @Size(max = 30)
    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")
    @NotEmpty
    private String emailAddress;

    @Size(max = 30)
    @NotEmpty
    private String address;

    @Size(max = 10)
    @Pattern(regexp = "\\+?\\d*")
    private String numberPhone;

    private Integer fidelityCard;

    private Boolean enabled;
    private Boolean accountNonExpired;
    private Boolean accountNonLocked;
    private Boolean credentialsNonExpired;
    private String authorities;
    public User(){}

    //region security
    @Override
    public Collection<GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();

        if (authorities != null && !authorities.isEmpty()) {
            String[] authoritiesAsArray = authorities.split(",");

            for (String authority : authoritiesAsArray) {
                if (authority != null && !authority.isEmpty()) {
                    grantedAuthorities.add(new SimpleGrantedAuthority(authority));
                }
            }
        }

        return grantedAuthorities;
    }

    @Override
    public boolean isEnabled(){
        return enabled;
    }
    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }
    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }
    @Override
    public String getUsername() {
        return emailAddress;
    }
    @Override
    public String getPassword() {
        return password;
    }
    //endregion
    //region getters

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
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

    public Boolean getEnabled() {
        return enabled;
    }

    public Boolean getAccountNonExpired() {
        return accountNonExpired;
    }

    public Boolean getAccountNonLocked() {
        return accountNonLocked;
    }

    public Boolean getCredentialsNonExpired() {
        return credentialsNonExpired;
    }


    //endregion

    //region setters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setAccountNonExpired(Boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public void setAccountNonLocked(Boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public void setCredentialsNonExpired(Boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }


    //endregion

}
