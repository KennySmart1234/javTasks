import java.util.Scanner;


public class TaskThree{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
<<<<<<< HEAD
     System.out.print("Enter an integer: ");
             int integerInput = userInput.nextInt();

            int multiple5 = integerInput % 5;
            int divisible2 = integerInput % 2;



        if (multiple5 == 0){
                System.out.println("HiFive");
                }
           else {
                System.out.println("HiEven");
                }
           
    }

=======
        System.out.print("Enter the length side number: ");
             int lengthInput = userInput.nextInt();
            int  lengthSquare = lengthInput * lengthInput;
         double sumArea = 0.4330127019 * lengthSquare;   
  

            double volumeResult = sumArea * lengthInput;


    System.out.print("The volume is: " + volumeResult + "\n");


    }


>>>>>>> 23f4b40 (Initial commit)
}
