import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void shouldReturnTwoIndices1 (){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] expectedResult = {0,1};
        assertEquals(Arrays.toString(solution.twoSum(nums, target)), Arrays.toString(expectedResult));
    }

    @Test
    public void shouldReturnTwoIndices2 (){
        int[] nums = {3,2,4};
        int target = 6;
        int[] expectedResult = {1,2};
        assertEquals(Arrays.toString(solution.twoSum(nums, target)), Arrays.toString(expectedResult));
    }

    @Test
    public void shouldReturnTwoIndices3 (){
        int[] nums = {3,3};
        int target = 6;
        int[] expectedResult = {0,1};
        assertEquals(Arrays.toString(solution.twoSum(nums, target)), Arrays.toString(expectedResult));
    }

    @Test
    public void shouldReturnTwoIndices4 (){
        int[] nums = {2,5,5,11};
        int target = 10;
        int[] expectedResult = {1,2};
        assertEquals(Arrays.toString(solution.twoSum(nums, target)), Arrays.toString(expectedResult));
    }

    @Test
    public void shouldReturnTwoIndices5 (){
        int[] nums = {8,2,6,1,5,8};
        int target = 11;
        int[] expectedResult = {2,4};
        assertEquals(Arrays.toString(solution.twoSum(nums, target)), Arrays.toString(expectedResult));
    }
}
