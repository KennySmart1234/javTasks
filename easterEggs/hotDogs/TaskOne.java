import java.util.Scanner;


public class TaskOne{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
            System.out.print("Enter a miles number: ");
               int milesInput = userInput.nextInt();
                       

            double kilometerResult = milesInput * 0.621371;


    System.out.print("The kilometer is:" + kilometerResult + "\n");


}



}
