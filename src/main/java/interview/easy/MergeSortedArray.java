package com.easy;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String arr[])
    {
        int[] nums1= {1,2,3,0,0,0};
        int m = 3;
        int[] nums2= {2,5,6};
        int n=3;

        /*int[] nums1= {0};
        int m = 0;
        int[] nums2= {1};
        int n=1;*/

        MergeSortedArray obj = new MergeSortedArray();
        obj.merge(nums1,m,nums2,n);

    }

    //shortcut
    public void mergebyfunc(int[] nums1, int m, int[] nums2, int n) {

        int j = 0;
        for(int i = m;i < m+n;i++)
        {
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if(n==0)
            return;
        int k = m + n - 1;
        int i = m - 1, j = n - 1;
        while (j >= 0) {
            if(i>=0 && nums1[i]>nums2[j])
            {
                nums1[k] = nums1[i--];
            }
            else
            {
                nums1[k] = nums2[j--];
            }
            k--;

            //nums1[k--] = (nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
        }
        for (int x = 0; x < nums1.length; x++) {
            // System.out.println(nums1.length);
            System.out.println(nums1[x]);
        }
        /*while (n > 0) {
            nums1[k] = nums2[n - 1];
            n--;
            k--;
        }*/
    }
}
