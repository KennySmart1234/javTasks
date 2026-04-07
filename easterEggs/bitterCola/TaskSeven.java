import java.util.Scanner;


public class TaskSeven{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter an integer: ");
             double Integer = userInput.nextDouble();



                 if (Integer % 3 == 0 && Integer % 5 == 0){
                     System.out.print("FizzBuzz " +"\n");
                    }
            else if (Integer % 3 == 0){
                    System.out.print("Fizz" + "\n");
                     }
            else if (Integer % 5 == 0){
                    System.out.print("Buzz" + "\n");
                     }
            else
                    System.out.print(Integer + "\n");
                    
    }
}
