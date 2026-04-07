import java.util.Scanner;


public class TaskFourteen{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
<<<<<<< HEAD
     System.out.print("Enter radius of the cylinder: ");
             int radiusInput = userInput.nextInt();

     System.out.print("Enter the height : ");
             int heightInput = userInput.nextInt();
              int radiusSquare = radiusInput * radiusInput;
              int radiusHight = radiusInput + heightInput;

             double surfaceArea = 2  * 3.142 * radiusInput * radiusHight;
             double volume = 3.142 * radiusSquare * heightInput;
             
             
             System.out.println("surface Area " + surfaceArea + "  Volume:" + volume);                    
                 
      
    }

=======
     System.out.print("Enter weight in pounds: ");
             int weightInput = userInput.nextInt();

     System.out.print("Enter height in inches: ");
             int heightWeight = userInput.nextInt();

            double weightPound = weightInput * 0.45359237;
            double heightInch = heightWeight * 0.0254;


             double weightHeight = weightPound / heightInch;
           


           System.out.print("BMI = "+ weightHeight + "\n");

        
    }
>>>>>>> 23f4b40 (Initial commit)
}
