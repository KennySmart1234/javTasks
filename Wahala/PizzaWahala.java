import java.util.Scanner;
public class PizzaWahala{
    public static void IyaAramidePizza(){

    
    
    Scanner inputCollector = new Scanner(System.in);

    System.out.println(" Iya Aramide Pizza joint");
    System.out.println("\n Pizza type\t" + "Number of Slices\t" + "Price per box\t\n");
    System.out.println(" Sapa size\t" + "\t4" + "\t\t2,500");
    System.out.println(" Small Money\t" + "\t6" + "\t\t2,900");
    System.out.println(" Big boys\t" + "\t8" + "\t\t4,000");
    System.out.println(" Odogwu\t" + "\t\t12" + "\t\t5,200");


    System.out.print("\n Enter Pizza type: ");
    String pizzaType = inputCollector.nextLine().toLowerCase();
    
    System.out.print(" Enter number of people: ");
    int numberOfPeople = inputCollector.nextInt();




if(pizzaType.equals("sapa size")){
        if(numberOfPeople <= 4){
            System.out.println("\n Sapa size size contain 4 slices perbox, 1 box should be sufficient for " + numberOfPeople + " persons"); 
            System.out.println(" Number of left slices after serving: " + (4 - numberOfPeople));
            System.out.println(" Price " + (1 * 2500));}   


        if(numberOfPeople > 4){
        int count = 0;
        for(; count<= numberOfPeople;){
            

            if(numberOfPeople == count){break;} 
               count = count + 4;  
                }
                     
        
        int numberOfBoxes = count / 4;
        System.out.println(" \n Number of boxes of pizza to buy: " + numberOfBoxes);
        System.out.println(" Number of left slices after serving: " + (count - numberOfPeople));
        System.out.println(" Price: " + (numberOfBoxes * 2500));
                }
           }




if(pizzaType.equals("small money")){
        if(numberOfPeople <= 6){
            System.out.println(" \n Small money size contain 6 slices perbox, 1 box should be sufficient for " + numberOfPeople + " persons"); 
            System.out.println(" Number of left slices after serving: " + (6 - numberOfPeople));
            System.out.println(" Price " + (1 * 6900));}   


        if(numberOfPeople > 6){
        int count = 0;
        for(; count<= numberOfPeople;){
            

            if(numberOfPeople == count){break;} 
               count = count + 6;  
                }
                     
        
        int numberOfBoxes = count / 6;
        System.out.println(" \n Number of boxes of pizza to buy: " + numberOfBoxes);
        System.out.println(" Number of left slices after serving: " + (count - numberOfPeople));
        System.out.println(" Price: " + (numberOfBoxes * 6900));
                }
           }



if(pizzaType.equals("big boys")){
        if(numberOfPeople <= 8){
            System.out.println("\n Big boys size contain 8 slices perbox, 1 box should be sufficient for " + numberOfPeople+ " persons");
            System.out.println(" Number of left slices after serving: " + (8 - numberOfPeople)); 
            System.out.println(" Price " + (1 * 4000));}   


        if(numberOfPeople > 8){
        int count = 0;
        for(; count<= numberOfPeople;){
            

            if(numberOfPeople == count){break;} 
               count = count + 8;  
                }
                     
        
        int numberOfBoxes = count / 8;
        System.out.println(" \n Number of boxes of pizza to buy: " + numberOfBoxes);
        System.out.println(" Number of left slices after serving: " + (count - numberOfPeople));
        System.out.println(" Price: " + (numberOfBoxes * 4000));
            }
           }



    
if(pizzaType.equals("odogwu")){
        if(numberOfPeople <= 12){
            System.out.println("\n Odogwu size contain 12 slices perbox, 1 box should be sufficient for " + numberOfPeople+ " persons");
            System.out.println(" Number of left slices after serving: " + (12 - numberOfPeople)); 
            System.out.println(" Price " + (1 * 5200));}   


        if(numberOfPeople > 12){
        int count = 0;
        for(; count<= numberOfPeople;){
            

            if(numberOfPeople == count){break;} 
               count = count + 12;  
                }
                     
        
        int numberOfBoxes = count / 12;
        System.out.println("\n Number of boxes of pizza to buy: " + numberOfBoxes);
        System.out.println(" Number of left slices after serving: " + (count - numberOfPeople));
        System.out.println(" Price: " + (numberOfBoxes * 5200));
            }
           }
        }


        public static void main(String... agrs){
            IyaAramidePizza();  


    }
}
