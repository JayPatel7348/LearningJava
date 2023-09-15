package Concepts;

/**
 * @author Jaypatel
 */
public class StaticRecursion {
    static int x=2;
    public static void method1()
    {
        System.out.println(x);
        if (x--!=0)               //loop will continue until x=0
            method1();
    }
    public static void main(String[] args) {

        StaticRecursion ob=new StaticRecursion();
        ob.method1();

    }


}
