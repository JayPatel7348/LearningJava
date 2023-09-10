package ExceptionHandling;

/**
 * @author Jaypatel
 */
public class Throws {
    //defining a method
    public static int divideNum(int m, int n) throws ArithmeticException {
        int div = m / n;
        return div;
    }
    //main method
    public static void main(String[] args) {
        Throws obj = new Throws();
        try {
          int  ps= obj.divideNum(45, 3);
            System.out.println(ps);
        }
        catch (ArithmeticException e){
            System.out.println("Number cannot be divided by 0");
        }
    }
}
