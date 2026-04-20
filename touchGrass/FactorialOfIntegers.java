public class FactorialOfIntegers{

public static void main(String[] args){
        factorial(5);
        }

public static int factorial(int number){
           int factorial = 5; 
           int count = 1; 
            
           int result = (int)(count * factorial);      
           for (; count <= factorial; count++){
                factorial = factorial * count; 
                    System.out.println(count *factorial);}

           return result;
                                 

    }
}
