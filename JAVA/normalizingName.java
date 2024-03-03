import java.util.Scanner;

public class normalizingName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstname = scanner.nextLine();
        String lastname = scanner.nextLine();
        firstname = firstname.substring(0, 1).toUpperCase() + firstname.substring(1).toLowerCase();
        lastname = lastname.substring(0, 1).toUpperCase() + lastname.substring(1).toLowerCase();
        System.out.println(firstname + " " + lastname);
    }  
}
