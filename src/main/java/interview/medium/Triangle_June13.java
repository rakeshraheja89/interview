package com.medium;

import java.util.ArrayList;
import java.util.List;


//Logic

/*
Appra                                                                                                                                                                                                                                                                               ach :
Work from last row to the first to find the minimum path sum (MPS) from bottom to top
        For numbers in the last row, the MPS is the number itself
        Thereafter, choose the min number between the two options of children
        Since only 2 rows are needed at a time, current and previous, so space complexity will be linear
*/

public class Triangle_June13 {

    //T/S: O(n²)/O(n), where n = size(triangle)


    public int minimumTotal(List<List<Integer>> triangle) {
        var dp = new int[triangle.size() + 1];

        for (var i = triangle.size() - 1; i >= 0; i--)
            for (var j = 0; j < triangle.get(i).size(); j++)
                dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j + 1]);
        return dp[0];

    }

    public static  void main(String arr[]) {
        List<List<Integer>> input = new ArrayList<List<Integer>>();
        input.add(List.of(2));
        input.add(List.of(3, 4));
        input.add(List.of(6, 5, 7));
        input.add(List.of(4, 1, 8, 3));
        System.out.println(new Triangle_June13().minimumTotal(input));
    }
}
