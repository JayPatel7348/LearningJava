package Static;

/**
 * @author Jaypatel
 */
public class Student {

    int rollno;
    String name;
    static String college;

    void display()
    {
        System.out.println("Roll no.:"+rollno);
        System.out.println("Name.:"+name);
        System.out.println("College:"+college);
    }
    public static void main(String[] args) {

        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();

        s1.rollno=1;
        s1.name="Jay";
        s1.college="MGITER";
        s1.display();

        s2.rollno=2;
        s2.name="Kevin";
        s2.college="Kiran";
        s2.display();

        s3.rollno=3;
        s3.name="Pratik";
        s3.college="GEC";
        s3.display();
        s2.display();   //College:GEC due to static
        s1.display();   //College:GEC due to static

    }
}
