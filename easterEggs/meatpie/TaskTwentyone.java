import java.util.Scanner;

public class TaskTwentyone{
public static void main(String[] args){


        Scanner userInput = new Scanner(System.in);
           System.out.print("Enter base number: ");
              int baseNumber = userInput.nextInt();

           System.out.print("Enter height number: ");
              int heightNumber = userInput.nextInt();

                int sum = baseNumber * heightNumber;
                double result = 0.5 * sum;
            

                System.out.print("The area of the triangle =" + result + "\n");

    }
}
