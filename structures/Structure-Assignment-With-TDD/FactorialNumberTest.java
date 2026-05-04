import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class FactorialNumberTest{


    @Test
    public void testThatZeroFActorialIsOne(){
    
    int number = 0+1;

    int expected = FactorialNumber.factorial(number);
    
    int actual = 1;
    
    assertEquals(actual, expected);
    
    
    }
    
    @Test
    public void testThatOneFActorialIsOne(){
    
    int number = 1;

    int expected = FactorialNumber.factorial(number);
    
    int actual = 1;
    
    assertEquals(actual, expected);
    
    
    }    

    @Test
    public void testThatFiveFActorialIsOneHunderedAndTwenty(){
    
    int number = 5;

    int expected = FactorialNumber.factorial(number);
    
    int actual = 120;
    
    assertEquals(actual, expected);
    
    
    }
    
    @Test
    public void testThatSixFActorialIsSevenHunderedAndTwenty(){
    
    int number = 6;

    int expected = FactorialNumber.factorial(number);
    
    int actual = 720;
    
    assertEquals(actual, expected);
    
    
    }    

}











