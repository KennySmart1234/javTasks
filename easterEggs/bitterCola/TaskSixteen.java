import java.util.Scanner;


public class TaskSixteen{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter an integer: ");
             int numberInput1 = userInput.nextInt();
     System.out.print("Enter another integer: ");
             int numberInput2 = userInput.nextInt();
          
                if (numberInput1 % numberInput2 == 0){
                     System.out.print("first is the factor of second\n");
                    }

                 else
                System.out.print("first is not the factor of second\n"); 

    }
}
