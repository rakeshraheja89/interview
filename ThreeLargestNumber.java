package algoexpert.easy;

public class ThreeLargestNumber {

    public static void main (String[] arr) {
        int arr1[] = {10,5,9,10,12};
        arr1 = findThreeLargestNumberFromArray(arr1);
    }

    private static int[] findThreeLargestNumberFromArray(int[] arr1) {
        int arr2[]=new int[arr1.length];
        int arr3[]=new int[3];
        int x=0;
        int swap;
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=i+1;j <arr1.length;j++)
            {
                if(arr1[i] < arr1[j]) // 10 , 15
                {
                    swap=arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j]=swap;
                }
            }
       }
        for(int i=2;i>=0;i--)
        {
            arr3[x]=arr1[i];
            System.out.println("ThreeLargestNumber n is::"+ arr3[x]);
            x++;
        }
        return arr1;
    }

    private static int[] findThreeLargestNumberFromArray1(int[] arr1) {
        int arr2[]=new int[arr1.length];
        int arr3[]=new int[3];
        int x=0;
        int swap;
        for(int i=0;i<arr1.length-1;i++)
        {
            /*for(int j=i+1;j <arr1.length;j++)
            {*/
                if(arr1[i] < arr1[i+1]) // 10 , 15
                {
                    swap=arr1[i];
                    arr1[i] = arr1[i+1];
                    arr1[i]=swap;
                    i=-1;
                }
          //  }
        }
        for(int i=2;i>=0;i--)
        {
            arr3[x]=arr1[i];
            System.out.println("ThreeLargestNumber n is::"+ arr3[x]);
            x++;
        }
        return arr1;
    }
}
