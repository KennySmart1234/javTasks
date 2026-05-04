import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AreaOfCircleTest{


    @Test
    public void testForAreaWhenRadiusIsOnePointZero(){
    
    double radius = 1.0;
    
    
    double expected = AreaOfCircle.circleArea(radius);
    
    double actual = 3.141592653589793;
    assertEquals(expected, actual);
    }
    
    
    @Test
    public void testForAreaWhenRadiusIsFivePointZero(){
    
    double radius = 5.0;
    
    
    double expected = AreaOfCircle.circleArea(radius);
    
   double actual = 78.53981633974483;
    assertEquals(expected, actual);    
    

    }
    
    @Test
    public void testForAreaWhenRadiusIsZeroPointZero(){
    
    double radius = 0.0;
    
    
    double expected = AreaOfCircle.circleArea(radius);
    
    double actual = 0.0;
    assertEquals(expected, actual);   

    }
    




    }







