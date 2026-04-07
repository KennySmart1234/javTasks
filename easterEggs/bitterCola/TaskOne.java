import java.util.Scanner;


public class TaskOne{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the meter number: ");
             int meterInput = userInput.nextInt();
            double feetResult = meterInput * 3.2786;
            


    System.out.print("The feet = "+ feetResult + "\n");


    }


}
