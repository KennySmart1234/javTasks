import java.util.Scanner;


public class TaskFifteen{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter value for X1: ");
             int x1Input = userInput.nextInt();

     System.out.print("Enter value for Y1: ");
             int y1Input = userInput.nextInt();

     System.out.print("Enter value for X2: ");
             int x2Input = userInput.nextInt();

     System.out.print("Enter value for Y2: ");
             int y2Input = userInput.nextInt();

          int pointXx21 = x2Input - x1Input;
             int pointSumXx21 = pointXx21 * pointXx21;

          int pointYy21 = y2Input - y1Input;
          int pointSumYy21 = pointYy21 * pointYy21;


           int xPlusY = pointSumXx21 + pointSumYy21;
           double result = xPlusY;
           double root = Math.sqrt(result);

                

           System.out.print("Distance = "+ root + "\n");

        
    }
}
