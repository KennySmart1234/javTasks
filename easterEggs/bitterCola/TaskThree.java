import java.util.Scanner;


public class TaskThree{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter a thee price: ");
             int priceInput = userInput.nextInt();
     System.out.print("Enter discount percentage: ");
             int discountInput = userInput.nextInt();

          
            double discountAmount = priceInput * discountInput / 100;
            double finalPrice =  priceInput - discountAmount;



    System.out.print("finalPrice " + finalPrice +"\n");

    }
}
