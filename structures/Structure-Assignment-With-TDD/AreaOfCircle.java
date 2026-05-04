
public class AreaOfCircle{

public static double circleArea(double radius){
        
        
        double area = Math.PI * radius * radius ;
              
        return area;

}
public static void main(String... args){

        
        System.out.println(circleArea(1.0));
        System.out.println(circleArea(5.0));
        System.out.println(circleArea(0.0));


    }   

}
