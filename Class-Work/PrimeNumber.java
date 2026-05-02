import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args) {

    Scanner inputCollector = new Scanner(System.in);


    System.out.print("Enter a number: ");
    int number = inputCollector.nextInt();

int sum = 0;    
int count = 0;
for(count = 2; count<= number; ){
    
    if(number % count == 0){
        number = number / count;
        sum = sum + count;}    
        
    else{
        count++;
        }
            
        }
System.out.println(sum); 
    }
}
