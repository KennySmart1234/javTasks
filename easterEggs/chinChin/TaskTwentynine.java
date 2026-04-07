import java.util.Scanner;

<<<<<<< HEAD

=======
>>>>>>> 23f4b40 (Initial commit)
public class TaskTwentynine{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
<<<<<<< HEAD
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
=======
     System.out.print("Enter score (0 - 100): ");
            int scoreInput = userInput.nextInt();
            
               String gradeA = "A (90-100)";
               String gradeB = "B (80-89)";
               String gradeC = "C (70-79)";
               String gradeD = "D (60-69)" ;           
               String gradeF = "F (below 60)";
             
            

        if (scoreInput >= 90){
             System.out.print(gradeA + "\n");
                      }
      else if (scoreInput >= 80){
             System.out.print(gradeB + "\n");
                    }
      else if (scoreInput >= 70){
             System.out.print(gradeC + "\n");
                    }
      else if (scoreInput >= 60){
             System.out.print(gradeD + "\n");
                    }
      else if (scoreInput < 60){
             System.out.print(gradeF + "\n");
                    }
  }
>>>>>>> 23f4b40 (Initial commit)

}
