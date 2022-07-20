package com.easy;

import java.util.Arrays;

public class SumOf1DArray {

    public static void main(String arr[])
    {
        int[] nums= {2,7,5,9};
        SumOf1DArray obj = new SumOf1DArray();
        obj.runningSum(nums);
        obj.runningSum1(nums);

    }

    public int[] runningSum1(int[] nums) {
        int ans []= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0){
                ans[i] =nums[i];
            }
            else
                ans[i]=nums[i]+ans[i-1];
        }
        Arrays.stream(ans).forEach(number->System.out.println(number));
        return ans;
    }

    public void runningSum(int[] numbers)
    {
        int[] output= new int[numbers.length];
        for(int i=0;i<numbers.length;i++)
        {
            int tmp=0;
            for(int j=i;j>=0;j--) {
                tmp=tmp+numbers[j];
                output[i] = tmp;
            }
        }
        Arrays.stream(output).forEach(number->System.out.println(number));
    }
}
