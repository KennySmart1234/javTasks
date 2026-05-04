import java.util.Scanne;
public class calculateNumberOfDaysInAyear{


public static int numberOfDaysinAYear(int year){
        if(year == 2014 && <= 2034){
                    
            "  2014 = 365 days  \n2015 = 365 days  \n2016 = 366 days"
            "\n2017 = 365 days  \n2018 = 365 days  \n2019 = 365 days" 
            "\n2020 = 366 days  \n2021 = 365 days  \n2022 = 365 days"  
            "\n2023 = 365 days  \n2024 = 366 days  \n2025 = 365 days"
            "\n2026 = 365 days  \n2027 = 365 days  \n2028 = 366 days" 
            "\n2029 = 365 days  \n2030 = 365 days  \n2031 = 365 days"
            "\n2032 = 366 days  \n2033 = 365 days  \n2034 = 365 days"
        
        }
     } return year;
     
     


public static void main(String... args){

     Scanner inputCollector = new Scanner(System.in);
     
     System.out.print("Enter a year from 2014 to 2034 to check the total numbers of days inside ");
     int yearToCheck = inputCollector.nextInt();
     
          System.out.print(numberOfDaysinAYear(yearToCheck));

       }
    }

}
