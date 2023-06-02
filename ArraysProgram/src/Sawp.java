import java.util.Arrays;

public class Sawp {
    public static void main(String[] args) {
        int[] arr = {2, 4, 12, 11, 50, 34, 23};
        swap(arr, 3, 6);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
