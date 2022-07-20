package designPattern;

public class InnerStaticClassSingleton {

    private InnerStaticClassSingleton() {
    }

    public static class BillPughSingleton
    {
        private static InnerStaticClassSingleton instance =new InnerStaticClassSingleton();
    }

    public static InnerStaticClassSingleton getInstance()
    {
        return  BillPughSingleton.instance;
    }
}

//thread safe , better performance , lazy initialization.
