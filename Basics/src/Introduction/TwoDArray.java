package Introduction;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int arr[][] =  {{1,2,3},{2,3,4}};
        System.out.println(Arrays.deepToString(arr));

        int numbers[][] = new int[2][3];
        numbers[0][0] = 1;
        numbers[1][1] = 3;

        System.out.println(Arrays.deepToString(numbers));

        // Declare a 2D integer array without specifying row size
        int[][] myArray = new int[3][]; // 3 rows, but row sizes are not specified yet

// Initialize each row with different sizes
        myArray[0] = new int[]{1, 2, 3};        // Row 0 has 3 columns
        myArray[1] = new int[]{4, 5};           // Row 1 has 2 columns
        myArray[2] = new int[]{6, 7, 8, 9};     // Row 2 has 4 columns




    }
}
