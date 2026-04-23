import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {


Scanner inputCollector = new Scanner(System.in);
    System.out.print("Enter the gallons used (-1 to end): ");
    int gallonUsed = inputCollector.nextInt();
     System.out.print("Enter the miles driven: ");
    int milesDriven =  inputCollector.nextInt();


double milesOverall = 0;
double gallonOverall = 0;
while (gallonUsed != -1){
    System.out.println("The miles/gallon for this tank was "+ milesDriven / gallonUsed);
    gallonOverall = gallonOverall + gallonUsed;
    milesOverall = milesOverall + milesDriven;
    
    System.out.print("Enter the gallons used (-1 to end): ");
    gallonUsed = inputCollector.nextInt();
     System.out.print("Enter the miles driven: ");
    milesDriven =  inputCollector.nextInt();}

   
System.out.print("The overall average miles/gallon was: "+ milesOverall / gallonOverall);


    }
}

