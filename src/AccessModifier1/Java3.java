package AccessModifier1;

import AccessModifier.Java1;

/**
 * @author Jaypatel
 */
public class Java3 extends Java1 {


    public static void main(String[] args) {

        Java3 j3=new Java3();
        j3.sno=1;
       // j3.fname="Jay";   //fname is private so cant use in different class in different package
        j3.lname="Patel";
       // j3.Salary=20000;  //Salary is Default so cant use in different class in different package

    }
}
