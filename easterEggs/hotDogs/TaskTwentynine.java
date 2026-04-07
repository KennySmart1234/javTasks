import java.util.Scanner;

public class TaskTwentynine{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
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

}
