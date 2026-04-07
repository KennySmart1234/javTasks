import java.util.Scanner;


public class TaskTwentytwo{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
<<<<<<< HEAD
     System.out.print("Enter double number: ");
             double double1 = userInput.nextDouble();
     System.out.print("Enter another double: ");
             double double2 = userInput.nextDouble();
              double differenceResult = double1 - double2;
              double sumResult = double1 * double2;


          if (double1 > double2){
         System.out.println("first input is larger " + double1); }
          if (double2 > double1){
         System.out.println("first input is smaller " + double1); }
          if (double2 > double1){
         System.out.println("second input is larger " + double2); }
          if (double1 > double2){
         System.out.println("second input is smaller " + double2); }

            System.out.println("Sum = " + double1 + double2);
            System.out.println("Difference = " + differenceResult);
            System.out.println( "Product = " + sumResult);
             
=======
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

>>>>>>> 23f4b40 (Initial commit)

    }

}
