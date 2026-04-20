
import java.util.Scanner;

public class NumberCountDown{
public static void main(String[] agrs){

Scanner inputCollector = new Scanner(System.in);
  System.out.print("Enter a number : ");
  int number = inputCollector.nextInt();


int count = 0;
for(;number > count; number--){
    System.out.println("Number = " + number);
        }
    System.out.println("Blast off!!!");        

    }   

}
