import java.util.Scanner;
<<<<<<< HEAD
import java.util.Random;
=======

>>>>>>> 23f4b40 (Initial commit)

public class TaskFive{
public static void main(String[] agrs){

<<<<<<< HEAD
             Scanner userInput = new Scanner(System.in);
              Random random = new Random();
    
                int myrandom = random.nextInt();


         
     System.out.print("Enter a guess: ");
             int integerInput1 = userInput.nextInt();

               double guess = integerInput1 % myrandom;
 

            if (guess == 0){
                System.out.println("Guess is correct");
                }
//            else (guess == 1)
//                {
//                 System.out.println("Guess is not correct");
//                        }
 }
=======

         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter a number in square meters: ");
             int meterSquareInput = userInput.nextInt();
      double meterSquareResult = meterSquareInput * 0.3025;
            


    System.out.print(userInput + " square meter is " + meterSquareResult + "ping" + "\n");


    }

>>>>>>> 23f4b40 (Initial commit)

}
