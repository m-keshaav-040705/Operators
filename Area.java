package operators;
import java.util.Scanner;
public class Area {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Triangle");

        System.out.print("Choose a shape: ");
        int choice = sc.nextInt();

        double area;

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                area = 3.14 * r * r;
                System.out.println("Area of Circle = " + area);
                break;

            case 2:
                System.out.print("Enter length and breadth: ");
                double l = sc.nextDouble();
                double b = sc.nextDouble();
                area = l * b;
                System.out.println("Area of Rectangle = " + area);
                break;

            case 3:
                System.out.print("Enter side: ");
                double s = sc.nextDouble();
                area = s * s;
                System.out.println("Area of Square = " + area);
                break;

            case 4:
                System.out.print("Enter base and height: ");
                double base = sc.nextDouble();
                double h = sc.nextDouble();
                area = 0.5 * base * h;
                System.out.println("Area of Triangle = " + area);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
