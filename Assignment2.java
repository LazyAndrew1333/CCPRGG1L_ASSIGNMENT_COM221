// import the Scanner class
import java.util.Scanner;

public class Order {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("\nTake your time and think what you would like to orders\n");

        System.out.print("What is your first order? ");
        String myFirstOrder = scan.next();
        System.out.print("How much does it cost? ");
        double firstOrderPrice = scan.nextDouble();

        System.out.print("\nWhat is your second order? ");
        String mySecondOrder = scan.next();
        System.out.print("How much does it cost? ");
        double secondOrderPrice = scan.nextDouble();

        System.out.print("\nWhat is your third order? ");
        String myThirdOrder = scan.next();
        System.out.print("How much does it cost? ");
        double thirdOrderPrice = scan.nextDouble();

        double totalPrice = firstOrderPrice + secondOrderPrice + thirdOrderPrice;

        System.out.println("\nYour orders are " + myFirstOrder + ", " + mySecondOrder + ", " + myThirdOrder + " with the total of " + totalPrice);

        // Close scanner
        scan.close();
    }
}
