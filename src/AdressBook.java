import java.util.ArrayList;
import java.util.Scanner;

public class AdressBook {

    Contact contact = new Contact();
    Scanner sc = new Scanner(System.in);

    ArrayList<Contact> contactList = new ArrayList<>();

    

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

        contactList.add(contact);
    }

    public void editContact(){

        System.out.println("Search Contact ");
        String editContact = sc.next();

        if(editContact.equalsIgnoreCase(contact.getFirstName())){
            System.out.println("Contact Found");
            System.out.println("Enter New First Name: ");
            String firstName = sc.next();
            contact.setFirstName(firstName);
        }else {
            System.out.println("Contact Not found");
        }
    }
    public void deleteContact(){

        System.out.println("Search Contact for delete ");
        String deleteContact = sc.next();
        if(deleteContact.equalsIgnoreCase(contact.getFirstName())){

            contact = null;

        }else {
            System.out.println("Contact not found ");
        }

    }




//    Contact contact2 = new Contact("Prashant", "Patil", "35,Vinod Nagar near walwadi shivar dhule", "Pune", "Maharashtra", "424002", "9637549995", "imyashpawar@gmail.com");
//    Contact contact3 = new Contact("Harshal", "Thakur", "54,Patbandhare Colony walwadi shivar", "Nashik", "Maharashtra", "424002", "9637549995", "imyashpawar@gmail.com");
//    Contact contact4 = new Contact("Piyush", "Bhoye", "29,Maulipada near cinemaa hall", "Nandurbar", "Maharashtra", "424002", "9637549995", "imyashpawar@gmail.com");
//

}

