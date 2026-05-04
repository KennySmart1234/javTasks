import java.util.Scanner;
public class calculateNumberOfDaysInAyear{


public static int numberOfDaysinAYear(int year){
 
        if((year % 4 == 0 && year % 100 != 0)||(year % 400 ==0)){
             return 366;         
  
        }else{return 365;}
    }

public static void main(String... args){

     Scanner inputCollector = new Scanner(System.in);
     
     System.out.print("Enter a year from 2014 to 2034 to check the total numbers of days inside ");
     int yearToCheck = inputCollector.nextInt();
        int year = 2014;
     for(; year <= yearToCheck; year++){

     
          int result = numberOfDaysinAYear(yearToCheck);
          System.out.println(year + " = " + result);
          
          }

       
    }   

}
