import java.util.Scanner;

public class FindTriangleShape {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter angle of a:");
        int a=sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter angle of b:");
        int b=sc1.nextInt();
        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter angle of c:");
        int c=sc2.nextInt();

        if (a>180 || b>180 || c>180 || a<=0 || b<=0 || c<=0 )
            System.out.println("Not a Triangle");
        else if(a==90 || b==90 || c==90)
            System.out.println("It is a Right triangle");
        else if(a==60 && b==60 && c==60)
            System.out.println("It is a Equilateral triangle");
        else if(a==b || b==c)
            System.out.println("It is a Isosceles triangle");
        else if(a<90 && b<90 && c<90 && a+b+c==180)
            System.out.println("It is a Acute triangle");
        else if(a>90 || b>90 || c>90)
            System.out.println("It is a obtuse triangle");
        else if(a!=b && b!=c && a+b+c<180)
            System.out.println("It is a scalene triangle");

    }

}
