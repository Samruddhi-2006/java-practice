import java.util.Scanner;

public class Day12_SumofN {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n, sum =0;

    System.out.print("Enter a number:");
    n= sc.nextInt();

    for(int i =1; i<=n;  i++) {
      sum+=i;
    }

    System.out.println("Sum of first "+ n+ " numbers is:" +sum);
  }
}
