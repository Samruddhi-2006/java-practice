import java.util.Scanner;

public class Day23_AverageArray {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in) ;

    System.out.print("Enter number of element:");
    int n = sc.nextInt();

    int arr[] = new int[n];
    int sum =0;

    System.out.println("Enter elements:");
    for(int i=0; i<n; i++){
      arr[i]= sc.nextInt();
      sum+= arr[i];
    }
    double average = (double) sum/n;

    System.out.println("Avearge="+ average);

    sc.close();
  }
}
