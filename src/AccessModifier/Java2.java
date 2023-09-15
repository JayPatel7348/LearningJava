package AccessModifier;

/**
 * @author Jaypatel
 */
public class Java2 extends Java1{


    public static void main(String[] args) {

        Java2 j2=new Java2();
        j2.sno=1;
       // j2.fname="Jay";   //fname is private so cant use in different class in same package
        j2.lname="Patel";
        j2.Salary=20000;

    }
}
