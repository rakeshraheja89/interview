package com.easy;

public class WordCount {

    public static int count(String A) {
        int n = A.length();
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            if (A.charAt(i) == ' ') continue;
            while (i < n && A.charAt(i) != ' ') ++i;
            ++ans;
        }
        return ans;
    }

    public static void main(String arr[])
    {
        System.out.println("word count is : "+count("  rakesh     raheja"));
    }

}
