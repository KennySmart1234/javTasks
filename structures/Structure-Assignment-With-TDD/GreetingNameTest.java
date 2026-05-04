import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class GreetingNameTest{

    @Test 
    public void testThatGreetKenyReturnsHelloKenny(){
    
    String name = "Kenny!";
    
    
    String expected = GreetingName.greet(name);
    
    String actual = "Hello Kenny!";
    assertEquals(expected, actual); 
    
    }

    @Test 
    public void testThatGreetWorldReturnsHelloWorld(){
    
    String name = "World!";
    
    
    String expected = GreetingName.greet(name);
    
    String actual = "Hello World!";
    assertEquals(expected, actual); 
    
    }    

    @Test 
    public void testThatGreetWithStringReturnHello(){
    
    String name = "!";
    
    
    String expected = GreetingName.greet(name);
    
    String actual = "Hello !";
    assertEquals(expected, actual); 
    
    }



    }











