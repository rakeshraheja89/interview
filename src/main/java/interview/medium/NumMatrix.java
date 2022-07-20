package com.medium;

public class NumMatrix {

    int[][] sums;

    public NumMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        sums = new int[n+1][m+1];
        for (int i=1; i<=n; i++)
            for (int j=1; j<=m; j++)
                sums[i][j] = sums[i-1][j] + sums[i][j-1] + matrix[i-1][j-1] - sums[i-1][j-1];
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int RED_RECTANGLE = sums[row2+1][col2+1];
        int PURPLE_RECTANGLES = sums[row1][col2+1] + sums[row2+1][col1];
        int BLUE_RECTANGLE = sums[row1][col1];
        return RED_RECTANGLE - PURPLE_RECTANGLES + BLUE_RECTANGLE;
    }

    public static void main(String arr[]) {
        int[][] matrix = {{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}};
        int[] sumRegion = {2, 1, 4, 3};
        int[] sumRegion1 = {1, 1, 2, 2};
        int[] sumRegion2 = {1, 2, 2, 4};
        NumMatrix obj = new NumMatrix(matrix);
        obj.sumRegion(sumRegion[0], sumRegion[1], sumRegion[2], sumRegion[3]);
        obj.sumRegion(sumRegion1[0], sumRegion1[1], sumRegion1[2], sumRegion1[3]);
        obj.sumRegion(sumRegion2[0], sumRegion2[1], sumRegion2[2], sumRegion2[3]);
    }

}
