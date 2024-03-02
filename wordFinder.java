import java.util.Scanner;

public class wordFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int n = scanner.nextInt();
        String[] str = word.split(" ");
        if (n >= 1 && n <= str.length) {
            System.out.println(str[n - 1]);
        } else {
            System.out.println("Invalid input: Word not found.");
        }
        scanner.close();
    }

}
