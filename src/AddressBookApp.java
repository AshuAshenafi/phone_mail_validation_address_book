import java.util.Scanner;

public class AddressBookApp {
    public static void main(String[] args) {
        Scanner keybrd = new Scanner(System.in);
        boolean more = true;

        while(more){
            AddressBook ab = new AddressBook();
            System.out.print("Enter Phone number: \nThe Format has to be like (xxx)xxx-xxxx: ");
            String phoneNum = keybrd.nextLine();
            ab.setPhone(phoneNum);

            System.out.println("Enter email address: \nThe Format has to be like name@domain.com: ");
            String email = keybrd.nextLine();
            ab.setEmail(email);

            System.out.print("Enter (q/Q) to EXIT or anykey to continue. ");
            String reply = keybrd.nextLine();
            if(reply.equalsIgnoreCase("q")){
                more = false;
            System.out.println("Thank you!");
            }
        }
    }
}
