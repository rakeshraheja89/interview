package com.test;

public class Test1 {

    public static void main(String arr[])
    {
        System.out.println("hello test");//1111111111111111
        System.out.println(isValid("4242424242426742"));
    }

    public static boolean isValid(String cardNumber) {

        int sum=0;
        boolean isEvenDigit=false;
        for(int i=cardNumber.length()-1;i>=0;i--)
        {
            int tmp=cardNumber.charAt(i) - '0';
            if(isEvenDigit==true)
            {
                tmp=tmp*2;
            }
            sum=sum + tmp/10;
            sum = sum+ tmp%10;

            isEvenDigit=!isEvenDigit;
        }
        return (sum%10==0);
    }
}
