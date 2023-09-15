package Inheritance;

/**
 * @author Jaypatel
 */
class Society
{
    int maintenance = 1000;

    Society()
    {
        System.out.println("Society Constructor");
    }
    Society(int i) //Constructor
    {
        System.out.println("value="+i);
    }
    void calculateFine()
    {
        int fine = 2000;//2 * maintenance;
        System.out.println(fine);
    }
}

class  Apartment extends Society
{
    Apartment() //Constructor
    {
        super(56);  //parent class Constructor called
        System.out.println("Apartment Constructor");
    }

    int maintenance = 1500;
    void calculateFine()
    {
        int fine = 3000;//2 * maintenance;
        System.out.println(fine);
        super.calculateFine(); //Parent class method called
    }
    void printValues()
    {
        System.out.println("maintenance="+maintenance);
        System.out.println("maintenance="+super.maintenance);
        calculateFine();
        super.calculateFine(); //Parent class method called
    }
}

public class Super {

    public static void main(String[] args) {
        Apartment ap = new Apartment();
        System.out.println(ap.maintenance); //
        ap.printValues();
    }
}
