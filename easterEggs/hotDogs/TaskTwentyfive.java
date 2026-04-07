import java.util.Scanner;


public class TaskTwentyfive{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
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

}
