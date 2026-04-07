import java.util.Scanner;

public class TaskTwenty{
public static void main(String[] args){


        Scanner userInput = new Scanner(System.in);
           System.out.print("Enter length number: ");
              int lengthNumber = userInput.nextInt();

           System.out.print("Enter width number: ");
              int widthNumber = userInput.nextInt();

                int area = widthNumber * lengthNumber;
                int result = area;

                System.out.print("The area = " + result+ "\n");

    }
}
