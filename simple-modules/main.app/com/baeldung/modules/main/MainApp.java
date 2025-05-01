package com.baeldung.modules.main;

import com.baeldung.modules.hello.HelloModules;
import com.baeldung.modules.hello.HelloInterface;
import java.util.ServiceLoader;

public class MainApp {
    static class StaticInnerClass {}
    public static void main(String[] args) {
        HelloModules.doSomething();
        Iterable<HelloInterface> services = ServiceLoader.load(HelloInterface.class);
        HelloInterface service = services.iterator().next();
        service.sayHello();
        StaticInnerClass sicA = new StaticInnerClass();
        MainApp.StaticInnerClass sicB = new MainApp.StaticInnerClass();
        //StaticInnerClass sicC = new MainApp().new StaticInnerClass();
        StaticInnerClass sicD = new MainApp.StaticInnerClass();


    }
}