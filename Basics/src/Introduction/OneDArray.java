package Introduction;

import java.util.Arrays;

public class OneDArray {
    public static void main(String[] args) {
        int [] arr = new int[5];
        arr[1] = 1;
        arr[0] = 2;
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        int arr2[] = {2,4,53,12,33};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

    }
}
