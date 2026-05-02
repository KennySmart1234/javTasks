public class UnderstandingLoopPattern{
    public static void main(String[] args) {


int userInput = 5;

for(int mainloop = 1; mainloop <= userInput; mainloop++){
    
    for (spaceLoop = userInput; spaceLoop > mainLoop; space--){
        System.out.print();        
           
        for(int starloop = 1; starloop <= mainloop; starloop++){
             System.out.print("*");   }
        
    System.out.println();

         }
     }
    }
}
