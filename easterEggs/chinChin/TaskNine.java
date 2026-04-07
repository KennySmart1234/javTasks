import java.util.Scanner;


public class TaskNine{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter initial velocoty: ");
             int inputVelocity = userInput.nextInt();

     System.out.print("Enter time span: ");
             int inputTime = userInput.nextInt();

     System.out.print("Enter acceleration: ");
             int inputAcceleration = userInput.nextInt();


             int squareTime = inputTime * inputTime;
             double halfAcceTime = 0.5 * inputAcceleration * squareTime;
              double sum = inputVelocity * inputTime + halfAcceTime;

           System.out.print(sum + "\n");



    }
}
