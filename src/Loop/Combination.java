package Loop;

/**
 * @author Jaypatel
 */
public class Combination {

    public void swap(char[] a)
    {
        char[] c=new char[1];
        c[0]=a[1];
        a[1]=a[2];
        a[2]=c[0];
        System.out.println(a[1]+""+a[2]);
    }
    public static void main(String[] args) {

        Combination co=new Combination();
        char[] c1=new char[3];
        c1[0]='J';
        c1[1]='A';
        c1[2]='Y';

        for(int i=1;i<c1.length;i++) {
            System.out.print(c1[0]);
            co.swap(c1);

        }




    }
}
