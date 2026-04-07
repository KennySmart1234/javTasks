import java.util.Scanner;


public class TaskTwentyseven{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter the first an integer: ");
            int integerInput = userInput.nextInt();
            
            int  divisible1 = integerInput % 2;
            int  divisible2 = integerInput % 3;
            int  divisible3 = integerInput % 5;
            int  divisible4 = integerInput % 7;
    
            

        if (divisible1 == 0){
             System.out.print("it is divisible by 2\n");
                      }
      else if (divisible2 == 0){
             System.out.print("it is divisible by 3\n");
                    }
      else if (divisible3 == 0){
             System.out.print("it is divisible by 5\n");
                    }
      else if (divisible4 == 0){
             System.out.print("it is divisible by 7\n");
                    }
  }

}
