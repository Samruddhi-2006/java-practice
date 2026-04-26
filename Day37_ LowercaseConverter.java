import java.util.Scanner;

public class LowercaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String lowerText = text.toLowerCase();

        System.out.println("Lowercase string: " + lowerText);

        sc.close();
    }
}
