public class Contact {

    private String firstName;
    private String lastName;
    private String addressofPerson;
    private String cityName;
    private String stateName;
    private String zipCode;
    private String phoneNumber;
    private String emailAdress;

    public Contact(String firstName, String lastName, String addressofPerson, String cityName, String stateName, String zipCode, String phoneNumber, String emailAdress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressofPerson = addressofPerson;
        this.cityName = cityName;
        this.stateName = stateName;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.emailAdress = emailAdress;
    }

    public Contact() {

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddressofPerson() {
        return addressofPerson;
    }

    public String getCityName() {
        return cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddressofPerson(String addressofPerson) {
        this.addressofPerson = addressofPerson;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", addressofPerson='" + addressofPerson + '\'' +
                ", cityName='" + cityName + '\'' +
                ", stateName='" + stateName + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAdress='" + emailAdress + '\'' +
                '}';
    }
}
