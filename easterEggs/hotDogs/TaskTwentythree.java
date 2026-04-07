import java.util.Scanner;


public class TaskTwentythree{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter three digit integer: ");
             int digitInput = userInput.nextInt();

               double digitDivision = digitInput / 100;
               double digitReminder = digitInput % 10;

                if (digitDivision == digitReminder){
                 System.out.print("its palindrone " + digitReminder + " and " + digitReminder + "\n");
                        
                        }
                else if (digitDivision != digitReminder){
                 System.out.print("Not a palindrone\n");
                        
                        }
            

  }

}
