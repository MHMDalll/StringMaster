
import java.util.Scanner;

public class firstWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        int minLength = Math.min(a.length(), b.length());
        for (int i = 0; i < minLength; i++) {
            char char1 = a.charAt(i);
            char char2 = b.charAt(i);

            if (char1 > char2) {
                System.out.println(b);
                break;
            } else if (char1 < char2) {
                System.out.println(a);
                break;
            } else if (i == --minLength) {
                minLength++;
                for (int j = 0; j <= minLength; j++) {
                    char c = a.charAt(j);
                    System.out.print(c);
                }
            }
        }
        scanner.close();
    }
}
