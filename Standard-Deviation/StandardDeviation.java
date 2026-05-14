

public class CalculateStandardDeviation{

    public static double meanCalculation(int [] numbers){
    double sum = 0;
    double sampleMean;
    for(int count = 0; count < numbers.length; count++){
            sum = sum + numbers[count];
            }
            sampleMean = (sum / numbers.length);
            return sampleMean;
            }   
    
    
    public static double standardDeviation(int [] numbers){
            double meanDeviation = 0;
            double standardDeviation;
            
                double sum = 0;
                double sampleMean;
                for(int count = 0; count < numbers.length; count++){
                sum = sum + numbers[count];
                }
                sampleMean = (sum / numbers.length);
               
                
   
                for(int count = 0; count < numbers.length; count++){
                    meanDeviation = Math.pow(meanDeviation, 2) + (numbers[count]-sampleMean);
                 
                } return meanDeviation;
            
//                meanDeviation = (Math.pow(meanDeviation, 2) / numbers.length);
//                return standardDeviation = (Math.sqrt(meanDeviation)); 
                } 
                
         
        
     
public static void main(String... args){

    int [] numbers = {22,40,60,12,18,15,19,14};
    
System.out.println(meanCalculation(numbers));
System.out.println(standardDeviation(numbers)); 
  

    }   
}    
