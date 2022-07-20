package com.designPattern;

public class InnerStaticClassSingleton {

    //private constructor
    private InnerStaticClassSingleton() {
    }

    public static class BillPughSingleton {

        public static InnerStaticClassSingleton instance;
        public static InnerStaticClassSingleton getInstance() {
            if (instance == null) {
                instance = new InnerStaticClassSingleton();
            }
            return instance;
        }
    }

    public static InnerStaticClassSingleton getInstance() {
        return BillPughSingleton.getInstance();
    }
}

//thread safe , better performance , lazy initialization.
