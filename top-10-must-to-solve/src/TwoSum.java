public class TwoSum {

/*
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution,
and you may not use the same element twice.
You can return the answer in any order.

Time Complexity: O(n2)
Space Complexity: O(1)

 */

    public int[] twoSum(int[] nums, int target) {


        for (int i = 0; i < nums.length - 1; i++) {
            for (int y = i+1; y < nums.length; y++) {
                if (nums[i] + nums[y] == target) {
                    return new int[]{i, y};
                }
            }
        }

        return new int[0];
    }
}
