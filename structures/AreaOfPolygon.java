import java.util.Scanner;


public class AreaOfPolygon{

public static double area(int sidesNumber, double sideLength){ 

        double area = (sidesNumber * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI/sidesNumber)); 
            
        return area;
        } 
public static void main(String... args){

    Scanner inputCollector = new Scanner(System.in);
    
        System.out.print("Enter number of sides ");
          int sidesNumber = inputCollector.nextInt();
          
        System.out.print("Enter the sides length ");
          double sideLength = inputCollector.nextInt();          
       
        System.out.println("Area: "+ (area(sidesNumber, sideLength)));


    }   

}
