import java.util.Scanner;


public class TaskFive{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter a weight in kilogram: ");
             int weightInput = userInput.nextInt();
     System.out.print("Enter height in meter: ");
             int heightInput = userInput.nextInt();

          
            double IBM = weightInput / (heightInput * heightInput);
      
                if (IBM < 18.5){
                     System.out.print("Underweight\n");
                    }
            else if (IBM == 18.5 || IBM <= 24.9){
                    System.out.print("Nomal\n");
                     }
            else if (IBM == 25 || IBM <= 29.9){
                    System.out.print("Overweight\n");
                     }
            else if (IBM >= 30){
                    System.out.print("Obese\n");               
                    }

    }
}
