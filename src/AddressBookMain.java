import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to AddressBooks");
        Scanner sc = new Scanner(System.in);
        AdressBook adressBook1 = new AdressBook();

        System.out.println("1. Add Contact 2. Edit Contact 3. Delete Contact");
        System.out.println("Enter Option");
        int option = sc.nextInt();

        switch (option){
            case 1:
                adressBook1.addContact();
                break;
            case 2:
                adressBook1.editContact();
                break;
            case 3:
                adressBook1.deleteContact();
                break;
        }

 


    }
}
