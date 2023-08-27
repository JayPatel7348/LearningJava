package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class fileNotFoundException {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            FileInputStream fis = new FileInputStream("E:\\jay.txt");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Program End");
    }
}
