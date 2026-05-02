import java.util.Scanner;

public class StarPattern{
public static void main(String[] args){


  Scanner inputCollector = new Scanner(System.in);


System.out.print("Enter number of rows: ");
int rollNumber = inputCollector.nextInt();


for(int rollCount = 1; rollCount <= rollNumber; rollCount++){

    for(int coloumCount = rollNumber; coloumCount > rollCount; coloumCount --){
        System.out.print(" ");}

    for(int innerColoum = 1; innerColoum <= rollCount;  innerColoum++){

        System.out.print("*");}

        
        System.out.println();
        }
    
  
    }

}
