import java.util.Scanner;

public class TaskFourteen{
public static void main(String[] args){


        Scanner userInput = new Scanner(System.in);
           System.out.print("Enter an integer: ");
              int number1 = userInput.nextInt();

           System.out.print("Enter another integer: ");
              int number2 = userInput.nextInt();

           System.out.print("Enter another integer: ");
              int number3 = userInput.nextInt();

                int average1 = number1 / 2;
                int average2 = number2 / 2;
                int average3 = number3 / 2;
                

                System.out.print("Their average = " + average1 + ", " + average2 + ", " + average3 + "\n");

    }
}
