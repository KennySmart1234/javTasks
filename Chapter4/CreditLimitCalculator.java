
import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.print("Enter number of customers: ");
        int customerNumbers = inputCollector.nextInt();
        
        int count = 1;
        while (count <= customerNumbers) {
            System.out.println("Customer " + count);
            
            System.out.print("Enter account number: ");
            int accountNumber = inputCollector.nextInt();
            
            System.out.print("Enter beginning balance: ");
            int beginningBalance = inputCollector.nextInt();
            
            System.out.print("Enter total charges this month: ");
            int charges = inputCollector.nextInt();
            
            System.out.print("Enter total credits this month: ");
            int credits = inputCollector.nextInt();
            
            System.out.print("Enter credit limit: ");
            int creditLimit = inputCollector.nextInt();
            

            int newBalance = beginningBalance + charges - credits;
            
            System.out.println("Account: " + accountNumber);
            System.out.println("New balance: " + newBalance);
            
            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
            }
            
            count++;
        }
        
    }
}
