import java.util.Scanner;


public class AreaOfPentagon{

public static double area(int sideLength){ 

        double area = (5 * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI/5)); 
            
        return area;
        } 
public static void main(String... args){

    Scanner inputCollector = new Scanner(System.in);
    
        System.out.print("Enter the side length ");
          int sideLength = inputCollector.nextInt();
       
          System.out.println("Area: "+(area(sideLength)));


    }   

}
