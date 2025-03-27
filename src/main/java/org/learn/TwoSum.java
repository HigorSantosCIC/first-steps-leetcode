package org.learn;

import java.util.HashMap;
import java.util.Map;

/**
 * Solves the Two Sum problem: Given an array of integers and a target value,
 * returns the indices of the two numbers that add up to the target.
 *
 * Approach: Uses a hash map for O(1) lookups, achieving O(n) time complexity.
 */
public class TwoSum {

    /**
     * Finds two numbers in the array that sum to the target value.
     *
     * @param nums    Array of integers to search
     * @param target  Target sum value
     * @return        Array containing the two indices of the numbers that sum to target
     * @throws IllegalArgumentException if no solution is found
     */
    public int[] twoSum(int[] nums, int target) {
        // Map to store each number's value and its index
        Map<Integer, Integer> numMap = new HashMap<>();

        // Iterate through each number in the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement needed to reach the target
            int complement = target - nums[i];

            // Check if we've already encountered the complement
            if (numMap.containsKey(complement)) {
                // Return the indices if complement exists in map
                return new int[] {numMap.get(complement), i};
            }

            // Store the current number and its index in the map
            numMap.put(nums[i], i);
        }

        // Throw exception if no solution found after full iteration
        throw new IllegalArgumentException("No two numbers sum to the target value");
    }
}