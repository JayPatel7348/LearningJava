package Static2;

import Static.StaticDemo1;

public class Static2Demo1 {

    /*
    static void method1()
    {
        System.out.println("Method 1 executed");
    }
     */

    public static void main(String[] args) {
        StaticDemo1 ob=new StaticDemo1();
        ob.method1();

        StaticDemo1.method1();

    }
}
