import java.util.Scanner;


public class TaskSixteen{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter side of the hexagon: ");
             int hexagonInput = userInput.nextInt();
                int HexagonSquare = hexagonInput * hexagonInput;
                
                 double area = 2.598076211 * HexagonSquare;
           

           System.out.print("Area = "+ area + "\n");

        
    }
}
