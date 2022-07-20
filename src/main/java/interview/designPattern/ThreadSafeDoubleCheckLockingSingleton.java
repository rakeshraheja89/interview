package designPattern;

public class ThreadSafeDoubleCheckLockingSingleton {

    private ThreadSafeDoubleCheckLockingSingleton() {
    }

    private static ThreadSafeDoubleCheckLockingSingleton instance = null;

    public static ThreadSafeDoubleCheckLockingSingleton getInstance()
    {
        if(instance == null) {
            synchronized (ThreadSafeDoubleCheckLockingSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeDoubleCheckLockingSingleton();
                }
            }
        }
        return instance;
    }
}

//thread safe , better performance but not best

//issue - poor performance at first time