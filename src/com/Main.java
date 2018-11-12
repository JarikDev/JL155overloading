package com;

import java.io.IOException;
import java.lang.reflect.Parameter;

public class Main {
//    void method(String s) { System.out.println(s); }
//    void method(int i) { System.out.println(i); }
//    private synchronized void method(double d, int i) throws IOException{ System.out.println(i); }
//    public final void method(int i, double d) throws RuntimeException{ System.out.println(i); }

    void method2(Parent p) { System.out.println("Parent"); }
    void method2(Child c) { System.out.println("Child"); }

    public static void main(String[] args) throws IOException {
      Main main = new Main();
//        main.method(5);
//        main.method("String");
//        main.method(4d, 5);
//        main.method(4, 5d);
            main.method2(null);

    }
}

class Parent{}
class Child extends Parent{}