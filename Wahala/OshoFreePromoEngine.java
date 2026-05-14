

public class OshoFreePromoEngine{

    public static double PromoEngine(int carTotal, String promoCode){
    
        double discount = 0;
    if(carTotal < 5000 && promoCode.equals("STARTED10")){
        discount = 0;
        }
        
    else if(carTotal >= 5000 && carTotal <= 14999 && promoCode.equals("STARTED10")){
        discount = 0.1;
        }
        
    else if(carTotal >= 15000 && carTotal <= 29999 && promoCode.equals("BIGBOY20")){
        discount = 0.2;
        }  
         
    else if(carTotal >= 30000 && promoCode.equals("OSHOFREE35")){
        discount = 0.35;
        }  
        

        double totalDiscount = (carTotal - (discount * carTotal));                    
            return totalDiscount;
                          
    }

public static void main(String... args){


    }
}




