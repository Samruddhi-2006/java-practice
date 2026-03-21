import java.util.Scanner;

public class Day11_PrintNumbers {
  
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter value of N:");
    int n= sc.nextInt();

    System.out.println("Numbers from 1 to " + n +" are:");

    for(int i =1; i<=n; i++){
      System.out.println(i);
    }
    sc.close();
  }
}
