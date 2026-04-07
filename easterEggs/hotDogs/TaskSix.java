import java.util.Scanner;


public class TaskSix{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter a number subtotal: ");
             double subtotalInput = userInput.nextInt();
    
     System.out.print("Enter a number gratuity rate: ");
             double gratuityInput = userInput.nextInt();
    
      double subtotalDivision = gratuityInput / subtotalInput;
      double gratuityResult = subtotalInput + subtotalDivision;

    System.out.print("$"+ subtotalDivision + " as gratuity and " +"$"+ gratuityResult + " as subtotal" + "\n");


    }


}
