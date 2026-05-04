
public class FactorialNumber{

public static int factorial(int number){


        for(int count = number-1; count >= 1; count--){
             number = number * count;
        
              
        }return number;

}
public static void main(String... args){

        
        System.out.println(factorial(0+1));
        System.out.println(factorial(1));
        System.out.println(factorial(5));
        System.out.println(factorial(6));

    }   

}
