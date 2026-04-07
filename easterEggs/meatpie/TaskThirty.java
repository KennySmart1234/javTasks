import java.util.Scanner;

public class TaskThirty{
public static void main(String[] args){


        Scanner userInput = new Scanner(System.in);
           System.out.print("Enter an integer: ");
              int number1 = userInput.nextInt();

           System.out.print("Enter another integer: ");
              int number2 = userInput.nextInt();

                int sum = number1 + number2;
                int product = number1 * number2;
            

                System.out.print("Sum = " + sum + "\n" + "Product = "+ product + "\n");

    }
}
