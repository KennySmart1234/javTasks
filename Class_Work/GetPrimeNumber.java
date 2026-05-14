import java.util.Scanner;
public class PrimeNumber{

    public static boolean getPrimeNumber(int number){
        int count = 2;
    for(; count <= (number%2); count++)
        
        if(number == 1)
        return false;
            
        if(number % count == 0)
        
            return false;
               
        else
            return true;
                 
    
    }

public static void main(String... agrs){

Scanner inputCollector = new Scanner(System.in);

System.out.print("Enter a number: ");
    int number = inputCollector.nextInt();
    
    System.out.print(getPrimeNumber(number));

    }

}
















