
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class OshoFreePromoEngineTest{

    @Test
    public void testThatAmountLesserThan5_000NoDiscountIsApplied(){
    
    int amount = 4_999;
    String promoCode = "STARTED10";
    
    double expected = OshoFreePromoEngine.PromoEngine(amount, promoCode);
    
    int actual = 4_999;
    
    assertEquals(expected, actual);  
    
    }
    
    
    @Test
    public void testThatAmountAbove5_000AndBelow14_999GivesAccurateDiscount(){
    
    int amount = 8_000;
    String promoCode = "STARTED10";
    
    double expected = OshoFreePromoEngine.PromoEngine(amount, promoCode);
    
    int actual = 7_200;
    
    assertEquals(expected, actual);  
    
    }
    
    
    @Test
    public void testThatAmountAbove15_000AndBelow29_999GivesAccurateDiscount(){
    
    int amount = 22_000;
    String promoCode = "BIGBOY20";
    
    double expected = OshoFreePromoEngine.PromoEngine(amount, promoCode);
    
    int actual = 17_600;
    
    assertEquals(expected, actual);  
    
    }


    @Test
    public void testThatAmountAbove30_000GivesAccurateDiscount(){
    
    int amount = 90_000;
    String promoCode = "OSHOFREE35";
    
    double expected = OshoFreePromoEngine.PromoEngine(amount, promoCode);
    
    int actual = 58_500;
    
    assertEquals(expected, actual);  
    
    }


    @Test
    public void testThatNoDiscountIsApliedTo18_000WrongPromeCode(){
    
    int amount = 18_000;
    String promoCode = "FAKE99";
    
    double expected = OshoFreePromoEngine.PromoEngine(amount, promoCode);
    
    int actual = 18_000;
    
    assertEquals(expected, actual);  
    
    }
    

    @Test
    public void testThatNoDiscountIsApliedTo29_000WrongPromeCode(){
    
    int amount = 29_000;
    String promoCode = "FAKELIFE";
    
    double expected = OshoFreePromoEngine.PromoEngine(amount, promoCode);
    
    int actual = 29_000;
    
    assertEquals(expected, actual);  
    
    }    
    
    
    @Test
    public void testThatAmountExactlyAt5_000GivesAccurateDiscount(){
    
    int amount = 5_000;
    String promoCode = "STARTED10";
    
    double expected = OshoFreePromoEngine.PromoEngine(amount, promoCode);
    
    int actual = 4_500;
    
    assertEquals(expected, actual);  
    
    }   
    
    
 @Test
    public void testThatAmountExactlyAt15_000GivesAccurateDiscount(){
    
    int amount = 15_000;
    String promoCode = "BIGBOY20";
    
    double expected = OshoFreePromoEngine.PromoEngine(amount, promoCode);
    
    int actual = 12_000;
    
    assertEquals(expected, actual);  
    
    }


    @Test
    public void testThatAmountExactlyAt30_000GivesAccurateDiscount(){
    
    int amount = 30_000;
    String promoCode = "OSHOFREE35";
    
    double expected = OshoFreePromoEngine.PromoEngine(amount, promoCode);
    
    int actual = 19_500;
    
    assertEquals(expected, actual);  
    
    }     
    
}















