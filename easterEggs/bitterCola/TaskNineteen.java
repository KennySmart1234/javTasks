import java.util.Scanner;


public class TaskNineteen{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter a fraction number: ");
             double numberInput1 = userInput.nextDouble();
     System.out.print("Enter another integer: ");
             double numberInput2 = userInput.nextDouble();
          
                

              double sum = numberInput1 + numberInput2;
                     System.out.print("Sum = " + sum + "\n");
              double differece = numberInput1 - numberInput2;
                     System.out.print("Difference = " + differece + "\n");
              double product = numberInput1 * numberInput2;
                     System.out.print("Product = "+ product + "\n");
              double quotient = numberInput1 / numberInput2;

              if (numberInput1 == 0){
                     System.out.print("The fraction is invalid \n");
                   }
              else if  (numberInput2 == 0){
                     System.out.print("The fraction is invalid \n");
                   }
              else 
                    System.out.print("quotient = " + quotient + "\n");
                    
    }
}
