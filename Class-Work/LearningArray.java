public class LearningArray{
    public static void main(String... agrs){



char[][] letters = new char[5][5];
letters[0][0] = 'X';
letters[0][1] = 'O';
letters[0][2] = 'X';
letters[0][3] = 'A';
letters[0][4] = 'B';

letters[1][0] = 'O';
letters[1][1] = 'O';
letters[1][2] = 'O';
letters[1][3] = 'c';
letters[1][4] = 'D';

letters[2][0] = 'X';
letters[2][1] = 'X';
letters[2][2] = 'O';



for (int count = 0; count < letters.length; count++){
    for(int countTwo = 0; countTwo < letters.length; countTwo++){

        System.out.print(letters[count][countTwo]);

    }   
    System.out.println();
    }

 }       
}
