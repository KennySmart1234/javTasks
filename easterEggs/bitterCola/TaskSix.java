import java.util.Scanner;


public class TaskSix{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter a first integer: ");
             int firstInteger = userInput.nextInt();
     System.out.print("Enter the second integer: ");
             int secondInteger = userInput.nextInt();

          
                 int sumPositive = firstInteger + secondInteger;
                 int productNegative = firstInteger * secondInteger;

                  int difference1 = firstInteger - secondInteger;
                  int difference2 = secondInteger - firstInteger;
      

                if (firstInteger > 1 && secondInteger > 1){
                     System.out.print("Sum " + sumPositive + "\n");
                    }
            else if (firstInteger < 0 && secondInteger < 0){
                    System.out.print("Product " + productNegative + "\n");
                     }
            else if (firstInteger > secondInteger){
                    System.out.print(difference1 +" difference1 \n");
                     }
            else if (secondInteger > firstInteger){
                  System.out.print(difference2 +" difference2\n");      
                    }

    }
}
