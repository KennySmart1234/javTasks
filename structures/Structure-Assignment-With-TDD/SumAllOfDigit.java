
public class SumAllOfDigit{

public static int sumOfDigit(int number){ 

        int sum = 0;
        
      while (number > 0){
            int extracted  = number % 10;                
            sum = sum + extracted;
            number = number / 10;

      }return sum;
        
}
public static void main(String... args){

        
        System.out.println(sumOfDigit(123));
        System.out.println(sumOfDigit(0));
        System.out.println(sumOfDigit(999));
        System.out.println(sumOfDigit(1000));       



    }   

}
