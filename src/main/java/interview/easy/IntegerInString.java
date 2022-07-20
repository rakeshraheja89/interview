package com.easy;

import java.util.ArrayList;

public class IntegerInString {

    public static void main(String arr[])
    {
        var output = solve("5,10,15");
        output.stream().forEach(x->System.out.println());

    }
        public static ArrayList<Integer> solve(String A) {
            int n = A.length();
            ArrayList<Integer> ans = new ArrayList();
            int num = 0;
            for(int i = 0; i < n; ++i){
                char x = A.charAt(i);
                if(x == ','){
                    ans.add(num);
                    num = 0;
                }
                else{
                    num = num*10 + x-'0';
                }
            }
            ans.add(num);
            return ans;
        }
    }
