import java.util.Scanner;

public class Day03_MaxofThreeNumbers {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a, b, c, max;

    System.out.print("Enter first number: ");
    a= sc.nextInt();

    System.out.print("Enter second number: ");
    b= sc.nextInt();

    System.out.print("Enter third number: ");
    c= sc.nextInt();

    if(a>=b && a>=c) {
        max=a;
    } else if(b>=a && b>=c) {
        max=b;
    } else {
        max =c;
    }
    System.out.println("Maximum number is:"+ max);

    sc.close();
  }
}
