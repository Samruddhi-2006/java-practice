import java.util.Scanner;

public class Day05_SimpleInterest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double principal, rate, time,simpleInterest;

    System.out.print("Enter Principle Amount:");
    principal = sc.nextDouble();

    System.out.print("Enter Rate of Interest:");
    rate= sc.nextDouble();

    System.out.print("Enter time (in years):");
    time = sc.nextDouble();

    simpleInterest = (principal * rate * time)/ 100;

    System.out.println("Simple Interest =" + simpleInterest);

    sc.close();
  
  }
}
