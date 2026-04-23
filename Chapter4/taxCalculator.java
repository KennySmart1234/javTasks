import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        int citizenCount = 1;
        
        while (citizenCount <= 3) {
            System.out.println("Citizen " + citizenCount );
            
            System.out.print("Enter name: ");
            String name = inputCollector.nextLine();
            
            System.out.print("Enter earnings for the year: ");
            double earnings = inputCollector.nextDouble();
            input.nextLine(); 
            
            double tax = 0.0;
            
            if (earnings <= 30000) {
                tax = earnings * 0.15;
            } else {
                tax = 30000 * 0.15 + (earnings - 30000) * 0.20;
            }
            
            System.out.printf("%s's total tax: $%.2f%n", name, tax);
            
            citizenCount++;
        }
        
    }
}
