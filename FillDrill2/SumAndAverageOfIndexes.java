import java.util.Scanner;
public class SumAndAverageOfIndexes{
public static void main(String[] agrs){


Scanner inputCollector = new Scanner(System.in);


int sum = 0;
for(int counter = 1; counter <= 10; counter++){

    System.out.print(counter + " Enter Score: ");
    int score = inputCollector.nextInt();


    sum = sum + score;
    if (counter == 2){
        System.out.println("Sum = " + sum + " Average = "+ sum/2);
        }
    if (counter == 4){
        System.out.println("Sum = " + sum + "Average = "+ sum/2);
        }
    if (counter == 10){
        System.out.println("Sum = " + sum + "Average = "+ sum/2);
        }
    }
}

}
