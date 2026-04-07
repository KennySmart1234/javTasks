import java.util.Scanner;


public class TaskTwentyfour{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter the exchange rate from U.S. dollars to Chinese RMB: ");
            int exchangeInput = userInput.nextInt();
     System.out.print("Enter 0 to convert from dollars to RMB or 1 to convert from RMB to dollars: ");
             int inputconversion = userInput.nextInt();


        if (inputconversion == 0){
             System.out.print("How much dollar do you want to convert to RMB ");
                int dollarsInput = userInput.nextInt();
                int exchageRate0 = dollarsInput * exchangeInput;
                System.out.print("Converted Amount: " + exchageRate0 + "\n");
                }

      else if (inputconversion == 1){
                  System.out.print("How much RMB do you want to convert to dollar ");
                    int rmbInput = userInput.nextInt();
                    int exchageRate1 = rmbInput * exchangeInput;
                        System.out.print("Converted Amount: " + exchageRate1 + "\n");
                      }

      else if (inputconversion >= 1){
                    System.out.print("Error. You entered wrong number\n");
                     }
      else if (inputconversion <= 0){
                    System.out.print("Error!!! You entered wrong number\n");
                       }




  }

}
