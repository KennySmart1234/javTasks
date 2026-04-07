import java.util.Scanner;


public class TaskTen{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
<<<<<<< HEAD
     System.out.print("Enter weight: ");
             int weight = userInput.nextInt();
             

            if (weight < 0 || weight <= 2){
                System.out.println("Ship fee = 2.5$");
                }
           else if (weight < 2 || weight <= 4){
                System.out.println("Ship fee = 4.5$");
                }
           else if (weight < 4 || weight <= 10){
                System.out.println("Ship fee = 7.5$");
                }
           else if (weight < 10 || weight <= 20){
                System.out.println("Ship fee = 10.5$");
                }
           else if(weight > 20){
                System.out.println("Package can not be Shipped");
                }
        }
    }
=======
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
>>>>>>> 23f4b40 (Initial commit)
