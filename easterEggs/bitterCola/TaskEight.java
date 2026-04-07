import java.util.Scanner;


public class TaskEight{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter 4 digit PIN: ");
             int pinInput = userInput.nextInt();



                 if (pinInput >= 1000 && pinInput <= 9999){
                     System.out.print("Valid PIN " +"\n");
                    }
            else
                    System.out.print("Invalid PIN" + "\n");
                    
    }
}
