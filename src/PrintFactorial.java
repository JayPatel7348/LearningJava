import java.util.Scanner;

public class PrintFactorial {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number to find the Factorial");
        int n=sc.nextInt();
        //********USING WHILE LOOP**********
        int i=1;
        int fn=1;
        while(i<=n)
        {
            fn=fn*i;
            i++;
        }
        System.out.println(fn);

      /*
      //*******USING FOR LOOP********
      int fn=1;
      for(int i=1;i<=n;i++)
        {
            fn=fn*i;
        }
        System.out.println(fn);
        */
        /*
        //********USING DO WHILE LOOP**********
        int i=1;S
        int fn=1;
        do{
            fn=fn*i;
            i++;
        }while(i<=n);
        System.out.println(fn);
        */

    }

}
