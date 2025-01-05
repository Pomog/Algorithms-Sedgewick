package org.pomog;

import org.pomog.std.StdOut;

public class Main {
    public static void main(String[] args) {
        
        System.out.println(System.getProperty("java.class.path"));
        
        StdOut.println("Hello, stdlib!");
        
        executeStaticMethod(Main::staticMethod);
       

        
    }
    
    public static void staticMethod() {
        StdOut.println("Static method executed!");
    }
    
    public static void executeStaticMethod(Runnable method) {
        method.run();
    }
}