import java.util.Arrays;

public class PassingFunction {
    public static void main(String[] args) {
        int[] nums = {5, 9, 2, 10, 12};
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 67;
    }
}
