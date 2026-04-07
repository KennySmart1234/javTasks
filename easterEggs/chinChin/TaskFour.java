import java.util.Scanner;


public class TaskFour{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
<<<<<<< HEAD
     System.out.print("Enter an integer: ");
             int integerInput1 = userInput.nextInt();

     System.out.print("Enter another integer: ");
             int integerInput2 = userInput.nextInt();

                int result1 = integerInput1 - integerInput2;
                int result2 = integerInput2 - integerInput1;


              if(integerInput1 > integerInput2){
                 System.out.println("Difference is " + result1);
                  }
             else {
                System.out.println("Difference is " + result2);
                }
           
    }

=======
        System.out.print("Enter the meter number: ");
             int meterInput = userInput.nextInt();
            double feetResult = meterInput * 3.2786;
            


    System.out.print("The feet = "+ feetResult + "\n");


    }


>>>>>>> 23f4b40 (Initial commit)
}
