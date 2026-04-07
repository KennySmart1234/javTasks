import java.util.Scanner;


public class TaskEleven{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter number of Years: ");
             int yearsNumber = userInput.nextInt();

            double birth = 365 * 24 * 60 * 60 / 7;
            double death = 365 * 24 * 60 * 60 / 13;
            double immigrant = 365 * 24 * 60 * 60 / 45;
            
            int currentPopulation = 312032486; 
            double populationTotal = currentPopulation + birth + immigrant - death;
            double populationAfter = populationTotal * yearsNumber;
            
           System.out.print("Population after:" + populationAfter + "\n");

        
    }
}
