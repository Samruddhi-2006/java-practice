import java.util.Scanner;

public class Day08_MultiplicationTable {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int number;

    System.out.print("Enter a number:");
    number = sc.nextInt();

    System.out.print("Multiplication Table of"+ number + " : ");

    for( int i=1; i<=10; i++){
      System.out.println(number +" x " + i+ "="+ (number* i));
    }
    sc.close();
  }
}
