import java.util.Scanner;
public class NumberReverse{
    public static void main(String... args){
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = inputCollector.nextInt();

        int extracted = 0;
        int reverse = 0;
        while (number > 0){
            extracted = number % 10;
            reverse = (reverse * 10) + extracted;
            number = number / 10;
        }       
        System.out.print(reverse);
    }
}
