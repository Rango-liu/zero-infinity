package com.mycompany.app;

import java.lang.reflect.Constructor;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {
//        new Thread(()->{
//            System.out.println(InnerHungrySingleton.getInstance());
//        }).start();
//        new Thread(()->{
//            System.out.println(InnerHungrySingleton.getInstance());
//        }).start();
        Constructor<InnerHungrySingleton> declaredConstructor = InnerHungrySingleton.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        InnerHungrySingleton innerHungrySingleton = declaredConstructor.newInstance();
        System.out.println(InnerHungrySingleton.getInstance() == innerHungrySingleton);
    }

}
