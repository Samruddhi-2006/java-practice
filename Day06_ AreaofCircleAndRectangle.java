import java.util.Scanner;

public class Day06_AreaOfCircleAndRectangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double radius, length, width;
        double areaCircle, areaRectangle;

  
        System.out.print("Enter radius of circle: ");
        radius = sc.nextDouble();

        areaCircle = 3.14 * radius * radius;

        System.out.println("Area of Circle = " + areaCircle);

    
        System.out.print("Enter length of rectangle: ");
        length = sc.nextDouble();

        System.out.print("Enter width of rectangle: ");
        width = sc.nextDouble();

        areaRectangle = length * width;

        System.out.println("Area of Rectangle = " + areaRectangle);

        sc.close();
    }
}
