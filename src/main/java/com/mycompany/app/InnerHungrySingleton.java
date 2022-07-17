package com.mycompany.app;

public class InnerHungrySingleton {

    private static class InnerClass {
        private static InnerHungrySingleton instance = new InnerHungrySingleton();
    }

    private InnerHungrySingleton() {
    }

    public static InnerHungrySingleton getInstance() {
        return InnerClass.instance;
    }
}
