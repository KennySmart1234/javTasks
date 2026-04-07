import java.util.Scanner;

public class TaskTwentytwo{
public static void main(String[] args){


        Scanner userInput = new Scanner(System.in);
           System.out.print("Enter radius number: ");
              int radiusNumber = userInput.nextInt();

                   int radiusResult = radiusNumber * radiusNumber;
                double areaCircle = 3.14159 * radiusResult;

                
                System.out.print("The area of the circle =" + areaCircle + "\n");

    }
}
