public class ArrayDoubleForEach {

        public static void main(String[] args) {
            double[] a=new double[5];
            a[0]=12.23;
            a[1]=23.20;
            a[2]=33.65;
            a[3]=45.44;
            a[4]=66.31;
            for(double x:a)
            {
                System.out.println(x);
            }
        }
}
