//write a program to collect 10 numbers and store it inside an array and print the array
//

import java.util.Scanner;
public class NumberWithArray{
    public static void main(String... args){

Scanner inputCollector = new Scanner(System.in);


        int[] numbers = new int[10];
for(int count = 0; count <= 9; count++){

        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();
        numbers[count] = number;

    }

for(int count = 0; count <= 9; count++){

              System.out.print(numbers[count] + " ");
        }

    }

}
