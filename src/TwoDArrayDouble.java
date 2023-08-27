public class TwoDArrayDouble {

    public static void main(String[] args) {
        double[][] da = new double[5][3];
        da[0][0] = 1.1;
        da[0][1] = 2.2;
        da[0][2] = 3.3;
        da[1][0] = 4.4;
        da[1][1] = 5.5;
        da[1][2] = 6.6;
        da[2][0] = 7.7;
        da[2][1] = 8.8;
        da[2][2] = 9.9;
        da[3][0] = 10.1;
        da[3][1] = 11.11;
        da[3][2] = 12.12;
        da[4][0] = 13.13;
        da[4][1] = 14.14;
     // da[4][2] = 15.15;   //It will print 0.0
   /*
        //we can define array this way
        double[][] da = {
                {1.1, 2.2, 3.3},
                {4.4, 5.5, 6.6},
                {7.7, 8.8, 9.9},
                {10.10, 11.11, 12.12},
                {13.13, 14.14, 15.15}
        };
     */
        for(int i=0;i<da.length;i++) {
            for (int j=0;j<da[0].length;j++)
            {
                System.out.print(da[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
