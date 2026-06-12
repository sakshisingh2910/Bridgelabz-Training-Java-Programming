import java.util.Scanner;

public class PowerWhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        if (number <= 0 || power < 0) {
            System.out.println("Please enter a positive number and non-negative power.");
        } else {

            int result = 1;
            int counter = 0;

            while (counter < power) {
                result = result * number;
                counter++;
            }

            System.out.println("Result = " + result);
        }

        sc.close();
    }
}