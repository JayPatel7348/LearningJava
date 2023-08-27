package ExceptionHandling;

import java.util.Scanner;

public class arithmeticException {

    public static void main(String[] args) {

        int a=10;
        System.out.print("Enter Division by value of b:");
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
       // int b=2;
        int c=0;

        try {
            c = a / b;
        }
        catch(Exception e){
            System.out.println("Divide by Zero value enter by User");
        }

        System.out.println("c="+c);
    }
}
