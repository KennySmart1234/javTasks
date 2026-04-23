import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();
        int factorialNumber = 1;

        for (int counter = 1; counter <= number; counter++) {
            factorialNumber *= counter;
        }

        System.out.println(factorialNumber);
    }
}
