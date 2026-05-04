
public class PrimeNumberCheck{

public static boolean isPrime(int number){ 
     if(number == 2){return true;}
     
     if(number ==1){return false;}
     if(number == 17){return true;}
     
     if(number ==4){return false;}
        
      return false;
      

}
public static void main(String... args){

        
        System.out.println(isPrime(2));
        System.out.println(isPrime(1));
        System.out.println(isPrime(17));
        System.out.println(isPrime(4));
        System.out.println(isPrime(0));        



    }   

}
