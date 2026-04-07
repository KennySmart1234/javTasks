import java.util.Scanner;


public class TaskTwelve{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter the velocity: ");
             int inputVelocity = userInput.nextInt();

     System.out.print("Enter the acceleration: ");
             int initialAcceleration = userInput.nextInt();

             int squareVelocity = inputVelocity * inputVelocity;
             int sumAcceleration = 2 * initialAcceleration;
             int length = squareVelocity / sumAcceleration;   


           System.out.print("Minimum run length: " + length + "\n");

        
    }
}
