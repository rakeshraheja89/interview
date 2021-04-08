package level2;

//Ust global
public class Rotate90Degree2DArray {
	
	 /* Driver program to test above functions */
    public static void main(String[] args)
    {
        int N = 3;
  
        // Test Case 1
		/*
		 * int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14,
		 * 15, 16 } };
		 */
     // Tese Case 2
         int mat[][] = {
                            {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}
                        };
         
  
        // Tese Case 3
        /*int mat[][] = {
                        {1, 2},
                        {4, 5}
                    };*/
  
        // displayMatrix(mat);
  
       rotateMatrix(N, mat);
  
        // Print rotated matrix
       // displayMatrix(N, mat);
    }
    
    private static void rotateMatrix(int n, int[][] matrix) {
    	int[][] ret = new int[3][3];
    	for(int i=0;i<n;i++)
    	{
    		for(int j=0;j<n;j++)
    		{
    			//ret[i][j] = matrix[n - j - 1][i];
    			ret[n - j - 1][i]=matrix[i][j];
    			System.out.print(
                        "actual " + matrix[i][j]);
    			System.out.print(
                        "converted " + ret[n - j - 1][i]);
                System.out.print("\n");
    		}
            System.out.print("\n");
    	}	
    	displayMatrix(3, ret);
	}

	private static void displayMatrix(int n,int[][] matrix) {
    	for(int i=0;i<n;i++)
    	{
    		for(int j=0;j<n;j++)
    		{
    			System.out.print(
                        " " + matrix[i][j]);
                System.out.print("\n");
    		}
            System.out.print("\n");
    	}
	}

}
    
    
