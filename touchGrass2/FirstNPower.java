
import java.util.Scanner;

public class FirstNPower{
public static void main(String[] agrs){

Scanner inputCollector = new Scanner(System.in);
  System.out.print("Enter a number : ");
  int number = inputCollector.nextInt();


int count = 1;
for(; count <= number; count++){
        if (count == number){break;}
    System.out.println("2 n power of " + count);
        }
        
    System.out.println(count + " is the n power");

    }   

}





















