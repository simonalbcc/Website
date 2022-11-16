package foodWebsiteProject.model;
import javax.validation.constraints.*;

public class User {

    @Size(max = 15)
    @Pattern(regexp = "[A-ZÀ-ÖØà-ÿa-z'-]{1,6}\\s[A-ZÀ-ÖØà-ÿa-z'-]{1,9}|[A-ZÀ-ÖØà-ÿa-z'-]{1,14}")
    private String firstName;

    @Size(max = 15)
    @Pattern(regexp = "[A-ZÀ-ÖØà-ÿa-z'-]{1,6}\\s[A-ZÀ-ÖØà-ÿa-z'-]{1,9}|[A-ZÀ-ÖØà-ÿa-z'-]{1,14}")
    private String lastName;

    @Size(max = 30)
    private String password;

    @Size(max = 30)
    private String emailAddress;

    @Size(max = 30)
    private String address;

    @Size(max = 10)
    private String numberPhone;
    private Integer fidelityCard;

    public User(){

    }
    //region getters

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

    //region setters
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
