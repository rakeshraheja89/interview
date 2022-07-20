package com.java8topics;

public class Lambda{

    public static void main(String arr[])
    {
        // lambda expression to implement above
        // functional interface. This interface
        // by default implements abstractFun()
        Foo foo=(String x)->System.out.println(x);
        // This calls above lambda expression
        foo.display("hello");

    }
}


@FunctionalInterface
interface Foo
{
    public void display(String message);
}