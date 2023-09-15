package Strings;

/**
 * @author Jaypatel
 */
public class StartWith {

    public static void main(String[] args) {
        String str = "this is a text";
        if(str.startsWith("thi"))
            System.out.println("Start with thi");
        else
            System.out.println("Not Start with thi");
        if(str.startsWith("amo"))
            System.out.println("Start with amo");
        else
            System.out.println("Not Start with amo");

        if(str.contains("is"))
            System.out.println("contains is");
        else
            System.out.println("Not contains is");

        if(str.contains("man"))
            System.out.println("contains man");
        else
            System.out.println("Not contains man");
    }
}
