


public class CheckEvenNumber{

public static boolean isEven(int number){
        boolean value = false;
        if(-number % 2 == 0){
            value = true;
            

   }    return value; 
                   

}

public static void main(String... args){

        
        System.out.println(isEven(4));
        System.out.println(isEven(7));
        System.out.println(isEven(0));
        System.out.println(isEven(-2));

    }   

}
