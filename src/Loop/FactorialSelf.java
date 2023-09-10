package Loop;

import java.util.Scanner;

/**
 * @author Jaypatel
 */
public class FactorialSelf {

    public static void main(String[] args) {


        System.out.println("Enter number to find the factorial");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fn=1;
        for(int i=1;i<=n;i++)
        {
            fn=fn*i;
        }
        System.out.println("factorial is "+fn);
    }
}
