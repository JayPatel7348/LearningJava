package ExceptionHandling;

public class indexOutBoundException {


    public static void main(String[] args) {

        int a[]=new int[5];
        a[0]=12;
        a[1]=18;
        a[2]=16;
        a[3]=15;
        a[4]=13;
        try {
            a[5] = 34;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }


            for (int i = 0; i <= 5; i++) {

                System.out.println(a);
                }

        }

    }

