import java.util.Scanner;


public class TaskTwo{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the length side number: ");
             int lengthInput = userInput.nextInt();
            int sumLength = lengthInput * lengthInput;     

            double areaResult = 0.4330127019 * sumLength;


    System.out.print("The kilometer is:" + areaResult + "\n");


    }


}
