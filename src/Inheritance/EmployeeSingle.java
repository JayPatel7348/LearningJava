package Inheritance;

/**
 * @author Jaypatel
 */


public class EmployeeSingle {
    int salary=20000;
    void empWork()
    {
        System.out.println("=== empWork ===");
        System.out.println("Punch");
        System.out.println("work");
    }
}

class Programmer extends EmployeeSingle
{
    int bonus = 6000;
    void programmerWork()
    {
        System.out.println("=== programmerWork ===");
        System.out.println("Punch");
        System.out.println("Code");
    }

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("bonus="+p.bonus);
        p.programmerWork();

        System.out.println(p.salary);
        p.empWork();
        /*EmployeeSingle e = new EmployeeSingle();
        System.out.println(e.salary);
        e.empWork();*/
    }
}
