import java.util.Scanner;
public class SumOfDigit{
public static void main(String[] agrs){



    System.out.print("Enter a valid number: ");
Scanner inputCollector = new Scanner(System.in);

       int userInput = inputCollector.nextInt(); 



int sum = 0;
int digit = 0;


while (userInput > 0){
        System.out.print(sum);
        sum = userInput % 10; 
        digit = sum / 10; 
        userInput;  
        }

}
}












