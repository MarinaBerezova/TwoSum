import java.util.Arrays;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = {0,0};
        for (int j=0; j<nums.length-1; j++) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[j] + nums[i] == target && j != i) {
                    result[0] = j;
                    result[1] = i;
                }
            }
        }
        return Arrays.stream(result).sorted().toArray();
    }
}
