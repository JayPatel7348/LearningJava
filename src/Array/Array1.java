package Array;

/**
 * @author Jaypatel
 */
public class Array1 {

    public static void main(String[] args) {

        int[] a=new int[5];
        a[0]=11;
        a[1]=12;
        a[2]=13;
        a[3]=14;
        a[4]=15;
        try {
            a[5] = 16;
        }catch (Exception e)
        {
          //  System.out.println(e.getMessage());
          //  System.out.println(e.fillInStackTrace());
        }
        for(int i=0;i<=a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
