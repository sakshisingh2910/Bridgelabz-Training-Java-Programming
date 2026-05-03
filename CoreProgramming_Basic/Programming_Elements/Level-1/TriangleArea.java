import java.util.Scanner;

public class TriangleArea {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double base, height;
        System.out.print("Enter base in inches : ");
        base = sc.nextDouble();

        System.out.print("Enter height in inches : ");
        height = sc.nextDouble();
        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516;

        System.out.println("The area of triangle is " + areaInInches + " square inches and " + areaInCm + " square centimeters");

    }
}
