import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SquareRootCheckTest{


    @Test
    public void testThatMathsqrt4GiveCorrectAnswer(){
    
    int number = 4;
    
    double expected = SquareRootCheck.sqrt(number);
    
    double actual = 2.0;
    assertEquals(expected, actual);
    
    }
   @Test
    public void testThatMathsqrt9GiveCorrectAnswer(){
    
    int number = 9;
    
    double expected = SquareRootCheck.sqrt(number);
    
    double actual = 3.0;
    assertEquals(expected, actual);
    
    }
   @Test
    public void testThatMathsqrt16GiveCorrectAnswer(){
    
    int number = 16;
    
    double expected = SquareRootCheck.sqrt(number);
    
    double actual = 4.0;
    assertEquals(expected, actual);
    
    }
    
    @Test
    public void testThatMathsqrt25GiveCorrectAnswer(){
    
    int number = 25;
    
    double expected = SquareRootCheck.sqrt(number);
    
    double actual = 5.0;
    assertEquals(expected, actual);
    
    }   
   @Test
    public void testThatMathsqrt100GiveCorrectAnswer(){
    
    int number = 100;
    
    double expected = SquareRootCheck.sqrt(number);
    
    double actual = 10.0;
    assertEquals(expected, actual);
    
    }
   @Test
    public void testThatMathsqrt114GiveCorrectAnswer(){
    
    int number = 144;
    
    double expected = SquareRootCheck.sqrt(number);
    
    double actual = 12.0;
    assertEquals(expected, actual);
    
    }


}
