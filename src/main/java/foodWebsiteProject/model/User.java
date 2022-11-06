package foodWebsiteProject.model;

public class User {
    private String firstName;
    private String lastName;
    private String password;
    private String mailAddress;
    private String address;
    private Integer numberPhone;
    private Integer fidelityCard;

    public User(){

    }
    //getters

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public String getAddress() {
        return address;
    }

    public Integer getNumberPhone() {
        return numberPhone;
    }

    public Integer getFidelityCard() {
        return fidelityCard;
    }
    //setters
}
