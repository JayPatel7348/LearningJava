package Strings;

/**
 * @author Jaypatel
 */
public class RemoveWords {
    public static void main(String[] args) {
        String str = "We are learning the java Language";

        // Remove "learning" and "java" from the string
        str = str.replace("learning", "").replace("java", "");

        System.out.println(str);
    }
}