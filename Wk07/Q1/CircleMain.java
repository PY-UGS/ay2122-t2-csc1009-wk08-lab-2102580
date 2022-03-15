import java.util.Scanner;

public class CircleMain {

    public static void main(String[] args) {

        CircleWithException Circle = new CircleWithException();
        Scanner in = new Scanner(System.in);

        try (in) {
            System.out.print("Enter Radius: ");
            double radius = in.nextDouble();

            Circle.setRadius(radius);

            double area = Circle.getArea();
            double diameter = Circle.getDiameter();

            System.out.printf("Radius of the circle is %.2f\n", radius);
            System.out.printf("Area of the circle is %.2f\n", area);
            System.out.printf("Diameter of the circle is %.2f\n", diameter);

        } catch (IllegalArgumentException e) {
            System.out.println("Illegal Argument: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        }

    }

}
