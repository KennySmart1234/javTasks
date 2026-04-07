import java.util.Scanner;

public class TaskNineteen{
public static void main(String[] args){


        Scanner userInput = new Scanner(System.in);
           System.out.print("Enter a number: ");
              int number = userInput.nextInt();

                int division = number % 2;
               
                   System.out.print("Your number remainder  = " + division + "\n");

    }
}
