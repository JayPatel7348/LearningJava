package AccessModifier;

/**
 * @author Jaypatel
 */
public class Java1 {

   public int sno;
   private String fname;
   protected String lname;
   int Salary;

    void display()
    {
        System.out.println(sno+" "+fname+" "+lname+" "+Salary);
    }

    public static void main(String[] args) {

        Java1 j1=new Java1();
        j1.sno=1;
        j1.fname="Jay";
        j1.lname="Patel";
        j1.Salary=20000;

    }
}
