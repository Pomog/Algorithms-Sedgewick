package org.pomog;

import org.pomog.std.StdOut;

public class Main {
    public static void main(String[] args) {
        
        System.out.println(System.getProperty("java.class.path"));
        
        StdOut.println("Hello, stdlib!");
        
        executeStaticMethod(Main::staticMethod);
        
        StdOut.println(2.0e-6 * 100000000.1);
        
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
        
        int sum = 0;
        for (int i = 1; i < 1000; i++)
            for (int j = 0; j < i; j++)
                sum++;
        StdOut.println(sum);
        
        int sum2 = 0;
        for (int i = 1; i < 1000; i++)
            sum2 += i;
        StdOut.println(sum2);
        
        System.out.println('e' + 'e');
        System.out.println('a' + 0);
        System.out.println('e' + 0);
        System.out.println((int) 'e');
        System.out.println((char) ('a' + 4));
        
        int N = 80;
        StringBuilder s = new StringBuilder();
        for (int n = N; n > 0; n /= 8) {
            s.insert(0, (n % 8));
        }
        StdOut.println(s.toString());
        
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = 9 - i;
        for (int i = 0; i < 10; i++)
            a[i] = a[a[i]];
        for (int i = 0; i < 10; i++)
            System.out.println(i);
        
        
        
    }
    
    public static void staticMethod() {
        StdOut.println("Static method executed!");
    }
    
    public static void executeStaticMethod(Runnable method) {
        method.run();
    }
}