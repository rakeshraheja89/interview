package com.faang;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {

    public static void main(String arr[])
    {
        String str="abcabcbb";
        System.out.println(findLongestSubString(str));
    }

    /*
    sliding window approach
    start from right
    move one by one
    check in map if exists or not
    if exists - then thats the maxlength
    else
    keep increasing max length
     */
    private static int findLongestSubString(String s) {
        int left=0;
        int maxLength=0;
        int right=0;
        Map<Character,Integer> temp=new HashMap<>();
        while(right<s.length()) {

            if (temp.containsKey(s.charAt(right)))
                left = Math.max(temp.get(s.charAt(right)) + 1, left);

            temp.put(s.charAt(right), right);
            maxLength = Math.max((right - left + 1), maxLength);
            right++;
        }
        return maxLength;
    }
}
