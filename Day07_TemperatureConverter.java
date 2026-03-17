import java.util.Scanner;

public class Day07_TemperatureConveter {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    double celsius, fahrenheit;

    System.out.print("Enter temperature in Celsius:");
    celsius = sc. nextDouble();

    fahrenheit = (celsius * 9/5)+32;

    System.out.println("Temperature in fahrenheit ="+ fahrenheit);

    sc.close();
  }
}
