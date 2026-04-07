import java.util.Scanner;


public class TaskTwentytwo{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter an integer: ");
             int integer1 = userInput.nextInt();

     System.out.print("Enter another integer: ");
             int integer2 = userInput.nextInt();

     System.out.print("Enter another integer: ");
             int integer3 = userInput.nextInt();

        if (integer1 > integer2){
                System.out.print(integer1+ ""+ integer2+""+integer3);
                }
           else if (integer1 > integer3){
                System.out.print(integer1+ ""+ integer3+""+integer2);
                }
           else if (integer2 > integer1){
                System.out.print(integer2+ ""+ integer3+""+integer1);
                }
           else if (integer2 > integer3){
                System.out.print(integer2+ ""+ integer1+""+integer3);
                }
           else if (integer3 > integer1){
                System.out.print(integer3+ ""+ integer2+""+integer1);
                }
           else if (integer3 > integer2){
                System.out.print(integer3+ ""+ integer1+""+integer2);
                }


    }

}
