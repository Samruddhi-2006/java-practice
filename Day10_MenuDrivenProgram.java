import java.util.Scanner;

public class Day10_MenuDrivenProgram {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int choice;

    do{
      System.out.println("\n======MENU=====");
      System.out.println("1. Simple Interest");
      System.out.println("2. Area of circle");
      System.out.println("3. Area of Rectangle");
      System.out.println("4. Temperature Converter(Celsius to fahrenheit)");
      System.out.println("5. Multiplication Table");
      System.out.println("6. Exit");
      System.out.println("Enter your choice:");

      choice = sc.nextInt();
      switch (choice) {

        case 1:

          System.out.print("Enter Principal:");
          double p = sc.nextDouble();

          System.out.print("Enter Rate:");
          double r = sc.nextDouble();
          System.out.print("Enter Time:");
          double t = sc.nextDouble();
          double si = (p*r*t)/100;
          System.out.println("Simple Interest =" + si);
          break;

        case 2:

          System.out.print("Enter radius:");
          double radius = sc.nextDouble();
          double areaCircle = Math.PI * radius * radius;
          System.out.println("area of Circle ="+ areaCircle);
          break;

        case 3:

          System.out.print("Enter length:");
          double length = sc.nextDouble();
          System.out.print("Enter width:");
          double width = sc.nextDouble();
          double areaRectangle = length * width;
          System.out.println("Area of Reactangle =" + areaRectangle);
          break;

        case 4:
          System.out.print("Enter Temperature in Celsius:");
          double celsius = sc.nextDouble();
          double fahrenheit = (celsius * 9/5)+32;
          System.out.println("Temperature in Fahrenheit ="+  fahrenheit);
          break;

        case 5:

          System.out.print("Enter number:");
          int num = sc .nextInt();
          System.out.println("Multiplication Table:");
          for(int i =1; i<= 10; i++){
          System.out.println(num + " x" + i + " = "+(num*i));
          }
          break;

        case 6:

          System.out.println("Exiting Program....");
          break;

        default:
          System.out.println("Invalid choice ! Please try again.");

      }
    } while (choice != 6);
    sc.close();
  } 
}
