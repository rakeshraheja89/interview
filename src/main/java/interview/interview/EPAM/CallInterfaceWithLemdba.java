package com.interview.EPAM;

@FunctionalInterface
interface Foo
{
    public void display(String input );
}

public class CallInterfaceWithLemdba {

    public static void main(String arr[])
    {
        Foo foo = parameter -> System.out.println(parameter + " from lambda");
        foo.display("hello");
    }
}
