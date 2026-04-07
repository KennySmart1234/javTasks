import java.util.Scanner;


public class TaskEighNineteen{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter inestment amount: ");
             int investmentInput = userInput.nextInt();

     System.out.print("Enter annual interest rate: ");
             int interestInput = userInput.nextInt();

     System.out.print("Enter number of years: ");
             int yearsInput = userInput.nextInt();

             double annual = interestInput / 100;
             double annualPlusOne = annual + 1; 
             
             double numberOfYear = yearsInput * 12;

             double InvestmentAndYear = annualPlusOne * numberOfYear;
             double futureInvestment = investmentInput * InvestmentAndYear;
             


           System.out.print("Future Investment Value = "+ futureInvestment + "\n");

        
    }
}
