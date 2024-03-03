import java.util.Scanner;

public class wordCensor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence =scanner.nextLine();
        String oldWord = scanner.nextLine();
        String newWord = scanner.nextLine();
        String[] words =sentence.split("\\s+");
        for(int i = 0 ; i<=words.length ; i++)
        {
            if (words[i].equals(oldWord)) {
                System.out.print(newWord+" ");
            }
            else{
                System.out.print(words[i]+" ");
            }
        }
    }

}
