
public class GenerateRandomCharacter{



public static void randomCharacter(){ 

    char randomLetter = (char)('A'+(int)(Math.random()*26));
         System.out.println(randomLetter);
    char randomNumber = (char)('0'+(int)(Math.random()*10));
           System.out.println(randomNumber);

        } 
public static void main(String... args){

       randomCharacter();
       randomCharacter();



    }   

}
