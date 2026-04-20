import java.util.Scanner;

public class TaskOne{
public static void main(String[] agrs){

         Scanner inputCollector = new Scanner(System.in);




int sum = 0;
    System.out.println("enter 10 score: ");


for (int counter = 1;  counter <= 10; counter++){
//    System.out.print("Score" +  ": ");
    int score = inputCollector.nextInt();
    sum = sum + score; 

}
    System.out.print("sum: " + sum);


}



}








