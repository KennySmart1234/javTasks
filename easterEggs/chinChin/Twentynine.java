import java.util.Scanner;


public class TaskTwentynine{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter hourly wage rate: ");
             int hourlyWage = userInput.nextInt();
     System.out.print("Enter number hours worked: ");
            int hoursWorked = userInput.nextInt();

        
            int nomalRate = hourlyWage * hoursWorked;
            double overTime = hourlyWage * hoursWorked * 1.5;



        if (hourlyWage <= 40)
               System.out.print("Total earning " + nomalRate + "\n");
       else 
           System.out.print("Total earning for overtime " + overTime + "\n");

         }

}
