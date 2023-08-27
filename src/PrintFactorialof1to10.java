import java.util.Scanner;

public class PrintFactorialof1to10 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number to find the Factorial");
        int n=sc.nextInt();
        
      for(int j=1;j<=n;j++) {
          int fn=1;
          for (int i = 1; i <= j; i++) {
              fn = fn * i;
          }
          System.out.println(fn);
      }
    }

}
