import java.util.Scanner;


public class TaskTwentythree{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
<<<<<<< HEAD
     System.out.print("Enter integer: ");
             int integerInput = userInput.nextInt();

              if (integerInput < 99 ){
                System.out.println("it is not three digit");
                    }

              if (integerInput >= 100){
                System.out.println("it is three digit number or more");
                    }
                else{
                System.out.println("it is not three digit");
                    }

    }
=======
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
>>>>>>> 23f4b40 (Initial commit)

}
