package ExceptionHandling;

import java.util.Scanner;

/**
 * @author Jaypatel
 */
public class Throw {

    public void squre(int a)
    {
        if(a<1)
            throw new ArithmeticException("Number is Not positive");
        else
            System.out.println(a*a);
    }

    public static void main(String[] args) {
        Throw ob=new Throw();
        Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
        ob.squre(a);
    }

}
