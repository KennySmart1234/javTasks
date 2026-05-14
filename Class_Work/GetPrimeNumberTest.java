import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class TestGetPrimeNumber{

    @Test
    public void testThatNumberSevenReturnTrueAsAPrimeNumber(){
    
    int number = 7;
    
    boolean actual = GetPrimeNumber.getPrimeNumber(number);
    
    boolean expected = true;
    assertEquals(actual, expected);
    
    
    }





    } 








