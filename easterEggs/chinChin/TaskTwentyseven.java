import java.util.Scanner;


public class TaskTwentyseven{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
<<<<<<< HEAD
     System.out.print("Enter principal(p): ");
             double principal = userInput.nextInt();
     System.out.print("Enter annual interest rate: ");
             double interest = userInput.nextInt();
     System.out.print("Enter time in year: ");
             double time = userInput.nextInt();

                double interestPercentage = interest / 100;
      double simpleInterest = principal * interestPercentage * time;
      double simpleInterestResult = simpleInterest/100;


        double compoundSquare =  (1 + interestPercentage) * (1 + interestPercentage);

        double compoundInterest = principal * compoundSquare;
        System.out.print("simple Interest: " + simpleInterestResult + "\ncompound Interest " + compoundInterest + "\n");
         }
=======
     System.out.print("Enter the first an integer: ");
            int integerInput = userInput.nextInt();
            
            int  divisible1 = integerInput % 2;
            int  divisible2 = integerInput % 3;
            int  divisible3 = integerInput % 5;
            int  divisible4 = integerInput % 7;
    
            

        if (divisible1 == 0){
             System.out.print("it is divisible by 2\n");
                      }
      else if (divisible2 == 0){
             System.out.print("it is divisible by 3\n");
                    }
      else if (divisible3 == 0){
             System.out.print("it is divisible by 5\n");
                    }
      else if (divisible4 == 0){
             System.out.print("it is divisible by 7\n");
                    }
  }
>>>>>>> 23f4b40 (Initial commit)

}
