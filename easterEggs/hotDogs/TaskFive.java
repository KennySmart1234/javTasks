import java.util.Scanner;


public class TaskFive{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter a number in square meters: ");
             int meterSquareInput = userInput.nextInt();
      double meterSquareResult = meterSquareInput * 0.3025;
            


    System.out.print(userInput + " square meter is " + meterSquareResult + "ping" + "\n");


    }


}
