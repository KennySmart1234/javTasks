import java.util.Scanner;


public class TaskThree{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the length side number: ");
             int lengthInput = userInput.nextInt();
            int  lengthSquare = lengthInput * lengthInput;
         double sumArea = 0.4330127019 * lengthSquare;   
  

            double volumeResult = sumArea * lengthInput;


    System.out.print("The volume is: " + volumeResult + "\n");


    }


}
