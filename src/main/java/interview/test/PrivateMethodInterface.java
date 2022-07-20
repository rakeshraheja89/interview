package com.test;

public interface PrivateMethodInterface {

    public void display(int sum);

    default  void sum()
    {
       System.out.print(sum(4,5));
    }

    private int sum(int x , int y)
    {
        return x+y;
    }
}
