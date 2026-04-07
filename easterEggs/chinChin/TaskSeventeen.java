import java.util.Scanner;


public class TaskSeventeen{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
<<<<<<< HEAD
     System.out.print("Enter first length: ");
             int length1 = userInput.nextInt();
     System.out.print("Enter second length: ");
             int length2 = userInput.nextInt();
                
            int length11 = length1 * length1;
            int length22 = length2 * length2;
            int lengthSum = length11 * length22;

      
                double hypotenuse = lengthSum;
                double result = Math.sqrt(hypotenuse);
                    System.out.println("hypotenuse " + result);

    }

=======
     System.out.print("Enter value for X1: ");
             int x1Input = userInput.nextInt();

     System.out.print("Enter value for Y1: ");
             int y1Input = userInput.nextInt();

     System.out.print("Enter value for X2: ");
             int x2Input = userInput.nextInt();

     System.out.print("Enter value for Y2: ");
             int y2Input = userInput.nextInt();

     System.out.print("Enter value for X3: ");
             int x3Input = userInput.nextInt();

     System.out.print("Enter value for Y3: ");
             int y3Input = userInput.nextInt();

// Slide 1 root solution
//        First bracket(x2-X1)
          int pointXx21 = x2Input - x1Input;
             int pointSumXx21 = pointXx21 * pointXx21;
//        Second bracket(y2-y1)
          int pointYy21 = y2Input - y1Input;
             int pointSumYy21 = pointYy21 * pointYy21;
//              root (x2-X1) + (y2-y1)
                int side1 = pointSumXx21 + pointSumYy21;

// To square root
//           double side1 = root1;
           double root1 = Math.sqrt(side1);



// Slide 2 root solution
//        First bracket (x3 - x2)
          int pointXx32 = x3Input - x2Input;
             int pointSumXx32 = pointXx32 * pointXx32;
//        Second bracket (y3 - y2)
          int pointYy32 = y3Input - y2Input;
             int pointSumYy32 = pointYy32 * pointYy32;
//          root (x3 - x2) + (y3 - y2)
                int side2 = pointSumYy32 + pointSumYy32;
// To square root

//           double side2 = root2;
           double root2 = Math.sqrt(side2);

// Slide 3 root solution
//        First bracket (x1 - x3) 
          int pointXx13 = x1Input - x3Input;
             int pointSumXx13 = pointXx13 * pointXx13;
//        Second bracket (y1 - y3) 
          int pointYy13 = y1Input - y3Input;
             int pointSumYy13 = pointYy13 * pointYy13;
//          root (x1 - x3) + (y1 - y3)
                int side3 = pointSumXx13 + pointSumYy13;

// To square root

//           double side3 = root3;
           double root3 = Math.sqrt(side3);
// Sides
           double sides = root1 + root2 + root3;
// sides Division 
           double sidesDivision = sides / 2;

// Area Root  
//   First bracket
           double areaSide1 = sidesDivision - root1;
//   Second bracket
           double areaSide2 = sidesDivision - root2;
//   First bracket
           double areaSide3 = sidesDivision - root3;
//   multipling all area side
           double sidesMultiply = areaSide1 * areaSide2; 
// areaSide3;
// S and side bracket multiplication
            double sAndSides = sidesDivision * sidesMultiply;
// Square root area

//           double areaRoot = sAndSides;
           double areaRoot = Math.sqrt(sAndSides);
    
                

           System.out.print("Area = "+ areaRoot + "\n");

        
    }
>>>>>>> 23f4b40 (Initial commit)
}
