package Loop;

import java.util.Scanner;

/**
 * @author Jaypatel
 */
public class SwitchCase {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c;
        //String operation = "mult";
        System.out.println("Enter operation you need to perform");
        Scanner sc=new Scanner(System.in);
        String operation=sc.next();

        switch (operation)
        {
            case "add" : c = a + b;
                System.out.println("basics.Addition="+c);
                break;
            case "sub" : c = a -b ;
                System.out.println("Subtraction="+c);
                break;
            case "mult" : c = a * b;
                System.out.println("Multiplication="+c);
                break;
            case "div" : c = a / b;
                System.out.println("Division="+c);
                break;
            default: // this will execute when non of them case is executed
                System.out.println("wrong choice");
                break;
        }


    }


}
