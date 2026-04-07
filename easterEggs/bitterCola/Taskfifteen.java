import java.util.Scanner;


public class TaskFifteen{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter number between 10 and 100: ");
             int numberInput = userInput.nextInt();

          
                if (numberInput >= 10 && numberInput <=100){
                     System.out.print("its in between\n");
                    }

                    else
                    System.out.print("out of range\n"); 

    }
}
