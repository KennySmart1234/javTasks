// Collect input from user and print the square of each number 
// input = 246 and result will be 36, 26 4

import java.util.Scanner;
public class NumberSquare{
public static void main(String[] agrs){
Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter a valid number: ");
      int userInput = inputCollector.nextInt(); 



int sum = 0;
for(int number = userInput; number > 0; number = number / 10){
    int extracted = number % 10;
        sum   = sum + extracted; 
    System.out.println(extracted * extracted);      
}
    System.out.println(sum);
    int sumTotal = extracted * 10;




}
}






