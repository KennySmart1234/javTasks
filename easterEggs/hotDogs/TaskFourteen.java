import java.util.Scanner;


public class TaskFourteen{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter weight in pounds: ");
             int weightInput = userInput.nextInt();

     System.out.print("Enter height in inches: ");
             int heightWeight = userInput.nextInt();

            double weightPound = weightInput * 0.45359237;
            double heightInch = heightWeight * 0.0254;


             double weightHeight = weightPound / heightInch;
           


           System.out.print("BMI = "+ weightHeight + "\n");

        
    }
}
