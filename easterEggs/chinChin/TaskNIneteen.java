import java.util.Scanner;


public class TaskNineteen{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter positve integer: ");
             int integerInput = userInput.nextInt();



          int result = integerInput * (integerInput + 1) / 2;

            System.out.println("1+2+3...+n = " + result);

             

    }

}
