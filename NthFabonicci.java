package algoexpert.easy;

import java.util.Scanner;

public class NthFabonicci {
    public static void main (String arr[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("getNthFib n is::"+n +" and sum is:: "+getNthFib(n));
    }

    public static int getNthFib(int n) {
        int f0=0,f1=1;
        int sum=0;
        if(n==1)
        {
            return f0;
        }
        if(n==2)
        {
            return f1;
        }
        for(int i=0;i<n-2;i++)
        {
            sum=f0+f1;
            f0=f1;
            f1=sum;
        }
        // Write your code here.
        return sum;
    }
}
