import java.util.Scanner;

public class oddEvenCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean bool = scanner.nextBoolean();
        int even = 0;
        int odd = 0;
        while (n > 0) {
            int r = n % 10;
            if (r % 2 == 0) {
                even++;
                n /= 10;
            } else {

                odd++;
                n /= 10;
            }
        }
        if (bool) {
            System.out.println(even);
        } else {
            System.out.println(odd);
        }
        else {
            System.out.println("Invalid input.");
        }

    }

}
