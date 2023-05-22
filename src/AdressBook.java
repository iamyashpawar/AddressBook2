import java.util.Scanner;

public class AdressBook {

    Contact contact = new Contact();

    public void addContact()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first Name: ");
        String firstName = sc.next();

        System.out.print("Enter Last Name:");
        String lastName = sc.next();

        System.out.print("Enter Address: ");
        String addressofPerson = sc.next();

        System.out.print("Enter City Name: ");
        String cityName = sc.next();

        System.out.println("Enter State name: ");
        String stateName = sc.next();

        System.out.println("Enter Zip Code: ");
        String zipCode = sc.next();

        System.out.println("Enter Phone Number: ");
        String phoneNumber = sc.next();

        System.out.println("Enter email Address: ");
        String emailAddress = sc.next();

        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setAddressofPerson(addressofPerson);
        contact.setCityName(cityName);
        contact.setStateName(stateName);
        contact.setZipCode(zipCode);
        contact.setPhoneNumber(phoneNumber);
        contact.setEmailAdress(emailAddress);

    }
//    Contact contact2 = new Contact("Prashant", "Patil", "35,Vinod Nagar near walwadi shivar dhule", "Pune", "Maharashtra", "424002", "9637549995", "imyashpawar@gmail.com");
//    Contact contact3 = new Contact("Harshal", "Thakur", "54,Patbandhare Colony walwadi shivar", "Nashik", "Maharashtra", "424002", "9637549995", "imyashpawar@gmail.com");
//    Contact contact4 = new Contact("Piyush", "Bhoye", "29,Maulipada near cinemaa hall", "Nandurbar", "Maharashtra", "424002", "9637549995", "imyashpawar@gmail.com");
//

}

