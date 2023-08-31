package Static;

/**
 * @author Jaypatel
 */
public class counterConstructor {

   static  int i=0;
    counterConstructor ()
    {
        i++;
        System.out.println("Counter:"+i);
    }

    public static void main(String[] args) {

        counterConstructor c1=new counterConstructor();
        counterConstructor c2=new counterConstructor();
        counterConstructor c3=new counterConstructor();
    }
}
