import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class CheckEvenNumberTest{

    @Test
    public void testThat4IsEvenNumberAndReturnTrue(){
    
//    Given
    int number = 4;
    
//    When
    boolean expected = CheckEvenNumber.isEven(number);
    
//    Check
    boolean actual = true;
    assertEquals(actual, expected);

    }
    
    
    @Test
    public void testThat7IsOddNumberAndReturnFalse(){
    
//    Given 
    int number = 7;
//    when
    boolean expected = CheckEvenNumber.isEven(number);
//    Check
    boolean actual = false;
    assertEquals(actual, expected);
    
    }
    
     @Test
    public void testThat0IsEvenNumberAndReturnTrue(){
    
//    Given 
    int number = 0;
//    when
    boolean expected = CheckEvenNumber.isEven(number);
//    Check
    boolean actual = true;
    assertEquals(actual, expected);
    
    }
    
     @Test
    public void testThatMinu2IsEvenNumberAndReturnTrue(){
    
//    Given 
    int number = -2;
//    when
    boolean expected = CheckEvenNumber.isEven(number);
//    Check
    boolean actual = true;
    assertEquals(actual, expected);
    
    }    

}




