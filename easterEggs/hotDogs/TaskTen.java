import java.util.Scanner;


public class TaskTen{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter amount of water in kilogram: ");
             int inputKilogram = userInput.nextInt();

     System.out.print("Enter initial Temperatures: ");
             int initialTemperatures = userInput.nextInt();

     System.out.print("Enter final Temperatures: ");
             int finalTemperatures = userInput.nextInt();

             int initialFinal = finalTemperatures - initialTemperatures;
             int energyNeeded = inputKilogram * initialFinal * 4186;

           System.out.print("energyNeeded: " + energyNeeded + "\n");

        
    }
}
