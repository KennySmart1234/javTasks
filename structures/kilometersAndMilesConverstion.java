
public class kilometersAndMilesConverstion{


public static double mileToKilometer(double mile){
        return mile * 1.60934;
     }
     
public static double kilometerToMile(double kilometer){
    
      return kilometer / 1.60934;
     }     
     


public static void main(String... args){

     
    System.out.println(mileToKilometer(2));
    System.out.println(kilometerToMile(2)); 
    
        int table = 1;
    for(; table <=10; table++){
        double  mileToKilometerTable = table * 1.60934;       
        double  kilometerToMileTable = table / 1.60934;
        System.out.println(table +" mile To Kilometer " + mileToKilometerTable);
        System.out.println(table +" kilometer To Mile " + kilometerToMileTable);
       }
    }

}
