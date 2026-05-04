import java.util.Scanner;
public class sumOfDigit{

    public static int sumDigit(int n){
         
         int count = 0;
        int totalSum = 0;
        for(; count<= n; count++){
           totalSum = totalSum + count;        
        } 
           
           return  totalSum;
    
    
    }


public static void main(String... agrs){

    Scanner inputCollector = new Scanner(System.in);
    
    System.out.print("Enter an integer: ");
    int integer = inputCollector.nextInt();

    int sumOfDigtResult = sumDigit(integer);
    
    System.out.println("Sum Of Digt: " + sumOfDigtResult);
    
    }


}


