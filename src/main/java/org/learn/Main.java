package org.learn;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(executeTwoSum()));

    }
    private static int[] executeTwoSum() {
        var resultTwoSum = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 9;
        return resultTwoSum.twoSum(nums, target);
    }

}