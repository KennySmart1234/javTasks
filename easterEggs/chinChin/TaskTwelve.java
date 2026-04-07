import java.util.Scanner;


public class TaskTwelve{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
<<<<<<< HEAD
     System.out.print("Enter an integer: ");
             int integerInput1 = userInput.nextInt();

     System.out.print("Enter an integer: ");
             int integerInput2 = userInput.nextInt();

                double result4 = integerInput1 % 4;
                double result5 = integerInput2 % 5;


            if (result4 == 0 && result5 == 0){
                    System.out.print("divisible by 4 and 5");}
              else if
                  (result4 == 0 || result5 == 0){
                System.out.print("divisible by 4 and 5");}
              else if
                    (result4 == 0 ^ result5 == 0){
                    System.out.print("divisible by 4 and 5");}
    }

=======
     System.out.print("Enter the velocity: ");
             int inputVelocity = userInput.nextInt();

     System.out.print("Enter the acceleration: ");
             int initialAcceleration = userInput.nextInt();

             int squareVelocity = inputVelocity * inputVelocity;
             int sumAcceleration = 2 * initialAcceleration;
             int length = squareVelocity / sumAcceleration;   


           System.out.print("Minimum run length: " + length + "\n");

        
    }
>>>>>>> 23f4b40 (Initial commit)
}
