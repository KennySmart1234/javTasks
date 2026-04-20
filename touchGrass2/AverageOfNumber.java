import java.util.Scanner;

public class AverageOfNumber{
public static void main(String[] agrs){

Scanner inputCollector = new Scanner(System.in);
  System.out.print("Enter an integer: ");
  int number = inputCollector.nextInt();



int sum = 0;
int count = 0;
while (number > -1){
    
    if (number < 0){break;}
        count = count + 1;
        sum = sum + number; 
        System.out.print("Enter an integer: ");
        number = inputCollector.nextInt();}    
    System.out.println("Avearge = " + sum/count);
 
}




}
