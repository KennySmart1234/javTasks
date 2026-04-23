public class PatternAsterisks{
    public static void main(String[] args) {

        for(int rowCounter = 1; rowCounter <= 8; rowCounter++){
            if (rowCounter % 2 == 0)                 
                System.out.print(" ");
            for(int starCounter = 1; starCounter <= 8; starCounter++){
                System.out.print("* ");
            }

            System.out.println();
          }



    }
}




