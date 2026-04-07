import java.util.Scanner;

public class TaskFour{
public static void main(String[] args){


        Scanner userInput = new Scanner(System.in);
           System.out.print("Enter a number: ");
              int number1 = userInput.nextInt();

           System.out.print("Enter another number: ");
              int number2 = userInput.nextInt();

                int difference = number1 - number2;

                   System.out.print("The Difference = " + difference + "\n");

    }
}
