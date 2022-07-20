package com.test;

public class Test {

    volatile String xyz="asd";
    volatile float as=1;
    volatile int x=2;
    public static void main(String arr[])
    {
        PrivateMethodInterface pmt = (int x)->System.out.println(x);
        pmt.sum();
        System.out.println("---------------");
        String s1 = "rakesh";
        String s2="rakesh";

                if(s1==s2)
                    System.out.println("TRUE::: "+true);
                else
                    System.out.println("false::: "+false);

        if(s1.equals(s2))
            System.out.println("TRUE::: "+true);
        else
            System.out.println("false::: "+false);

        String s3 = new String("rakesh");
        String s4=new String("rakesh");

        if(s3==s4)
            System.out.println("TRUE::: "+true);
        else
            System.out.println("false::: "+false);

        if(s3.equals(s4))
            System.out.println("TRUE::: "+true);
        else
            System.out.println("false::: "+false);

    }




}

