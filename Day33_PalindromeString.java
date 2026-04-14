import java.util.Scanner;

public class Day33_PalindromeString {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a string:");
    String str =sc.nextLine();

    String orignal= str;
    String reversed = "";

    for(int i=str.length()-1; i>=0; i--){
      reversed = reversed +str.charAt(i);
    }
    if(orignal.equalsIgnoreCase(reversed)) {
      System.out.println("palindrome String");
    } else{
      System.out.println("Not a palindrome String");
    }
    sc.close();
  }
}
