import java.util.Scanner;


public class TaskEighteen{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter an integer: ");
             int numberInput1 = userInput.nextInt();

          
                int squareRoot = numberInput1 * numberInput1;

                if (numberInput1 * numberInput1 == squareRoot){
                     System.out.print("its a square root \n");
                    }

                 else
                System.out.print("it is not a square root\n"); 

    }
}
