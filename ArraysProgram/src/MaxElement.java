import java.util.Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {2, 4, 12, 11, 50, 34, 23};
        System.out.println(max(arr));
    }

    //imagine that array is not empty.
    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
