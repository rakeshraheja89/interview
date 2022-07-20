package com.medium;

import com.easy.SumOf1DArray;

import java.util.*;

//
public class MaximumErasureValue {
    public static void main(String arr[])
    {
        int[] nums= {187,470,25,436,470,809,441,167,477,110,275,133,666,345,411,459,490,266,987,965,429,
                166,809,340,467,318,125,165,809,610,31,585,970,306,42,189,169,743,78,810,70,382,367,
                490,787,670,476,278,775,673,299,19,893,817,971,458,409,886,434};
        MaximumErasureValue obj = new MaximumErasureValue();
        System.out.println("sum is ::"+obj.maximumUniqueSubarray(nums));
    }

    public int maximumUniqueSubarray(int[] nums) {

        Set<Integer> set = new HashSet<>();
        int tempSum = 0;
        int curSum = 0;
        int cur=0;
        int prev = 0;
        while(cur < nums.length && prev < nums.length){
            if(!set.contains(nums[cur])){
                System.out.println("nums[cur] is "+nums[cur]);
                tempSum += nums[cur];
                System.out.println("temp sum is "+tempSum);
                curSum = Math.max(tempSum,curSum);
                set.add(nums[cur++]);
            }
            else {
                System.out.println("nums[prev] is "+nums[prev]);
                tempSum -= nums[prev];
                System.out.println("temp sum from prev is "+tempSum);
                set.remove(nums[prev++]);
            }
        }
        return curSum;
    }
}
