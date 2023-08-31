package Character;

/**
 * @author Jaypatel
 */
public class charArray {
    public static void main(String[] args) {
        //1nd way to define character array
        // Define and initialize an array of characters
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};

        //2nd way to define character array
        char[] emptyArray = new char[5];
        // Fill the array with characters
        emptyArray[0] = 'J';
        emptyArray[1] = 'a';
        emptyArray[2] = 'v';
        emptyArray[3] = 'a';
      //  emptyArray[4] = 'a'; // this char will show Null if Not define

        // Access and print individual characters from the array
        for (char c : charArray) {
            System.out.print(c);
        }
        System.out.println();

        for (char e : emptyArray) {
            System.out.print(e);
        }
        System.out.println();
    }
}
