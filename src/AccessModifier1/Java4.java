package AccessModifier1;

import AccessModifier.Java1;

/**
 * @author Jaypatel
 */
public class Java4  {

    public static void main(String[] args) {
/*
        Java4 j4=new Java4();
        j4.sno=1;
       // j4.fname="Jay";
        j4.lname="Patel";
       // j4.Salary=20000;
*/
        Java3 j3=new Java3();
        j3.sno=1;
        // j3.fname="Jay";   //fname is private so cant use in different class in different package
      //  j3.lname="Patel";    //lname is protected so only accessible in specific class in different package
        // j3.Salary=20000;  //Salary is Default so cant use in different class in different package


    }
}
