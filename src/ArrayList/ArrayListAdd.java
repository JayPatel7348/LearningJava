package ArrayList;

import java.util.ArrayList;

/**
 * @author Jaypatel
 */
public class ArrayListAdd {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add(12);
        al.add(12.45);
        al.add("String");
        al.add(true);

        System.out.println(al);

        ArrayList<String> al1=new ArrayList<>();
        al1.add("Jay");
        al1.add("Patel");
    }
}