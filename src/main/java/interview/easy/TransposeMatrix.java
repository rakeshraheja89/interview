package com.easy;


/*
The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]

Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]

 */
public class TransposeMatrix {

    public static void main(String arr[])
    {
       // int[][] matrix={ {1,2,3},{4,5,6},{7,8,9} };
        int[][] matrix={ {1,2,3},{4,5,6}};
        print(transpose(matrix));
    }

    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length ; // rows
        int n = matrix[0].length ; // columns
        int[][] result = new int[n][m] ;

        for(int i =0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                result[j][i]=matrix[i][j];
            }
        }
        return result;
    }

    public static int[][] print(int[][] matrix) {

        for(int i =0;i<matrix.length;i++)
        {
            for(int j=0;j< matrix[0].length;j++)
            {
                System.out.println(matrix[i][j]);
            }
        }
        return matrix;
    }
}
