import java.util.Scanner;

public class TaskTwentysix{
public static void main(String[] args){


        Scanner userInput = new Scanner(System.in);
           System.out.print("Enter your name: ");
              String userName = userInput.nextLine();

           System.out.print("Enter your age: ");
              int userAge = userInput.nextInt();

               String name = userName;
               int age = userAge;


               System.out.print("I am "+ name + " and i am " + age + "years old." + "\n");

    }
}
