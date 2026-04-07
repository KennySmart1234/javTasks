import java.util.Scanner;


public class TaskTwentyfive{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
<<<<<<< HEAD
     System.out.print("Enter three input integer: ");
             int inputInteger = userInput.nextInt();

              int integerDivision1 = inputInteger / 100;
              double integerDivision2 = inputInteger % 10;


        if (integerDivision1  == integerDivision2){
                System.out.println(inputInteger);
                System.out.println("it is palindrome");
                 }
                else
                System.out.println("it is not palindrome");
 

         }
=======
     System.out.print("Enter the first rice weight: ");
            int weightInput1 = userInput.nextInt();
     System.out.print("Enter the first rice price: ");
             int priceInput1 = userInput.nextInt();
     System.out.print("Enter the second rice weight: ");
            int weightInput2 = userInput.nextInt();
     System.out.print("Enter the second rice price: ");
             int priceInput2 = userInput.nextInt();


        if (weightInput1 > weightInput2){
             System.out.print("First rice is better price\n");
                      }

      else if (weightInput2 > weightInput1){
              System.out.print("Second rice is better price\n");
                    }
      else if (weightInput2 == weightInput1){
              System.out.print("They are both better price\n");
                    }


  }
>>>>>>> 23f4b40 (Initial commit)

}
