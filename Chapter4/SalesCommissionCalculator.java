import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        double baseSalary = 200.0;
        double commissionRate = 0.09;
        double totalSales = 0.0;
        
        System.out.println("Enter item number (1-4) or -1 to stop");
        System.out.println("Item 1: $239.99");
        System.out.println("Item 2: $129.75"); 
        System.out.println("Item 3: $99.95");
        System.out.println("Item 4: $350.89");
        
        while (true) {
            System.out.print("Item sold: ");
            int item = inputCollector.nextInt();
            
            if (item == -1) {
                break; 
            }
            
            switch (item) {
                case 1:
                    totalSales = totalSales + 239.99;
                    break;
                case 2:
                    totalSales = totalSales + 129.75;
                    break;
                case 3:
                    totalSales = totalSales + 99.95;
                    break;
                case 4:
                    totalSales = totalSales + 350.89;
                    break;
                default:
                    System.out.println("Invalid item number. Use 1-4 or -1 to stop.");
            }
        }
        
        double commission = totalSales * commissionRate;
        double totalEarnings = baseSalary + commission;
        
        System.out.printf("Total sales: ", totalSales);
        System.out.printf("Commission: ", commission);
        System.out.printf("Total earnings: ", totalEarnings);
        

    }
}
