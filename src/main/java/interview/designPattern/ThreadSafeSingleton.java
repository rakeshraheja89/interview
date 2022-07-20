package designPattern;

public class ThreadSafeSingleton {

    private ThreadSafeSingleton() {
    }

    private static ThreadSafeSingleton instance = null;

    synchronized public static ThreadSafeSingleton getInstance()
    {
        if(instance == null)
            instance = new ThreadSafeSingleton();

        return instance;
    }
}

//issue - poor performance but thread safe