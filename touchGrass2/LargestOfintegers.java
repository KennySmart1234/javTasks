
import java.util.Scanner;

public class LargestNumber{
public static void main(String[] agrs){

Scanner inputCollector = new Scanner(System.in);
  System.out.print("Enter a number : ");
  int number = inputCollector.nextInt();


int largestNumber = number;
int count = 0;
while (number != 0){
      count++;
      System.out.print("Enter a number : ");
    number = inputCollector.nextInt();
    if (number > largestNumber){
        largestNumber = number;}}
    
    System.out.println("Largest Number " + largestNumber); 
    System.out.println("Count = " + count);  

    }
}
