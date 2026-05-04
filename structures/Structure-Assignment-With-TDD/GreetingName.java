
public class GreetingName{

public static String greet(String name){
        
        String helloName = "Hello "+ name;
     
              
        return helloName;

}
public static void main(String... args){

        
        System.out.println(greet("Kenny!"));
        System.out.println(greet("World!"));
        System.out.println(greet("!"));


    }   

}
