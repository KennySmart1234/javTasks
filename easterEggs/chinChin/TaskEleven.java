import java.util.Scanner;


<<<<<<< HEAD
public class TaskTwelve{
=======
public class TaskEleven{
>>>>>>> 23f4b40 (Initial commit)
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
<<<<<<< HEAD
     System.out.print("Enter the height: ");
             int integerInput1 = userInput.nextInt();

     System.out.print("Enter the weight: ");
             int integerInput2 = userInput.nextInt();

                double result1 = (integerInput1 * 50)- 50;
                double result2 = (integerInput2 * 75)- 75;
            
                 System.out.println("" + result1 + "" + result2);
            
    }

=======
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
>>>>>>> 23f4b40 (Initial commit)
}
