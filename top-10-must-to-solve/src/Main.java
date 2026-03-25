import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        TwoSum twoSum = new TwoSum();

        int[] nums = new int[]{2,5,5,11};
        int target = 10;


        System.out.println(Arrays.toString(twoSum.twoSum(nums, target)));


    }
}