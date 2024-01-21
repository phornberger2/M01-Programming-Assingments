import java.util.Arrays;
import java.util.Scanner;

public class exercise_08_29 {
    //Prompts the user to input m1 and m2 and tells them if the arrays are identical
    public static void main(String[] args) {
        System.out.print("Enter m1: ");
        int[][] m1 = new int[3][3];
        fillArray(m1);

        System.out.print("Enter m2: ");
        int[][] m2 = new int[3][3];
        fillArray(m2);

        int[][] sortedM1 = sortArray(m1);
        int[][] sortedM2 = sortArray(m2);

        if (equals(sortedM1, sortedM2))
            System.out.print("The two arrays are identical");
        else
            System.out.print("The two arrays are not identical");
    }

    //Fills the array using the input from the user
    public static void fillArray(int[][] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++)
                array[i][j] = input.nextInt();
    }

    //Sorts the array
    public static int[][] sortArray(int[][] array) {
        int index = 0;
        int[] values = new int[9];
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++)
                values[index++] = array[i][j];

        Arrays.sort(values);

        index = 0;
        int[][] sortedArray = new int[3][3];
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++)
                sortedArray[i][j] = values[index++];

        return sortedArray;
    }

    //Checks to see if the arrays are identical
    public static boolean equals(int[][] a1, int[][] a2) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (a1[i][j] != a2[i][j])
                    return false;
        return true;
    }
}