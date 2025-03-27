package src.test.java.org.learn.TwoSumTest.java;

import org.junit.jupiter.api.Test;
import org.learn.TwoSum;

import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {

    @Test
    public void testBasicCase() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }

    @Test
    public void testNoSolution() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 100;
        assertThrows(IllegalArgumentException.class, () -> twoSum.twoSum(nums, target));
    }

    @Test
    public void testNegativeNumbers() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {-3, 4, 3, 90};
        int target = 0;
        int[] expected = {0, 2};
        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }

    @Test
    public void testDuplicateNumbers() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }

    @Test
    public void testMultipleSolutionsReturnsFirst() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {1, 2, 3, 4, 5};
        int target = 5;
        int[] result = twoSum.twoSum(nums, target);
        // Should return [0, 3] (1+4) or [1, 2] (2+3)
        assertTrue((result[0] == 0 && result[1] == 3) ||
                (result[0] == 1 && result[1] == 2));
    }

}
