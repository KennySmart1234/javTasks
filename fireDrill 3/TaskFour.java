
import java.util.Arrays;

public class TaskFour {
    public static void main(String[] args) {
        int[] inputNumber = {10, 11, 12, 13, 14, 15};
        int[] result = getEvenIndexElements(inputNumber);
        
        System.out.println("Even Index number: " + Arrays.toString(result));
    }

    public static int[] getEvenIndexElements(int[] myArray) {
        int division = (myArray.length + 1) / 2;
        int[] arrayEvenIndex = new int[division];

        int number = 0;
        for (int count = 0; count < myArray.length; count += 2) {
            arrayEvenIndex[number] = myArray[count];
            number++;
        }

        return arrayEvenIndex;
    }
}

