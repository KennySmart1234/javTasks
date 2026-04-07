import java.util.Scanner;


public class TaskFour{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter a the first integer: ");
             int firstInput = userInput.nextInt();
     System.out.print("Enter second integer: ");
             int secondInput = userInput.nextInt();

          
            double discountAmountR = firstInput % secondInput;
      
            if (discountAmountR == 0){
              System.out.print(firstInput + " is multiple of " + secondInput  +"\n");          }
               else  
            System.out.print(firstInput + " is not multiple of " + secondInput  +"\n");
                



    }
}
