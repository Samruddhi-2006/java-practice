import java.util.Scanner;

public class Day09_SimpleCalculator {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    char op;
    double num1, num2;

    System.out.print("Enter operator(+, -, *, /):");
    op = sc.next().charAt(0);

    System.out.print("Enter two numbers:");
    num1= sc.nextDouble();
    num2= sc.nextDouble();

    switch(op) {
      
      case '+':
          System.out.println("Result = "+(num1 + num2));
          break;
        
      case '-':
          System.out.println("Result="+(num1 - num2));
          break;
        
      case '*':
          System.out.println("Result="+(num1 * num2));
          break;
        
      case '/':
          if(num2 != 0)
              System.out.println("Result=" +(num1 / num2));
          else
              System.out.println("Error! Division by zero.");
          break;
        
        default :
            System.out.println("Invalid operator!");
    }
    sc.close();
  }
}
