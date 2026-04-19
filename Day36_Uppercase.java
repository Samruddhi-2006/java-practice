import java.util.Scanner;

public class Day36_Uppercase {
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);

    System.out.print("Enter a string: ");
    String input = sc.nextLine();
   
    String upper = input.toUpperCase();

    System.out.println("Uppercase string: "+ upper);
    sc.close();
  }
}
