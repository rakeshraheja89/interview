package com.easy;

import java.util.HashMap;

public class TwoSum {

        public int[] twoSum(int[] nums, int target) {

            HashMap<Integer, Integer> indexMap = new HashMap<Integer, Integer>();

            for (int i = 0; i < nums.length; i++) {
                Integer requiredNum = (Integer) (target - nums[i]);
                if (indexMap.containsKey(requiredNum)) {
                    int toReturn[] = {indexMap.get(requiredNum), i};
                    return toReturn;
                }

                indexMap.put(nums[i], i);
            }
            return null;
        }

        public static void main()
        {
            int[] nums= {2,7,5,9};
            TwoSum obj = new TwoSum();
            obj.twoSum(nums,9);
        }
}
