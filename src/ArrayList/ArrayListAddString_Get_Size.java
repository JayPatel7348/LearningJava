package ArrayList;

import java.util.ArrayList;

/**
 * @author Jaypatel
 */
public class ArrayListAddString_Get_Size {

    public static void main(String[] args) {

        ArrayList<String> al1=new ArrayList<>();
        al1.add("Jay");
        al1.add("Patel");
        al1.add("Sana");
        al1.add("Jinesh");
        al1.add("Kevin");

        System.out.println(al1);

        System.out.println(al1.get(3)); //print 3rd element "Jinesh" start from 0
        System.out.println(al1.size()); //print ArrayList size

        for(int i=0;i<al1.size();i++) //print all elements using for loop
        {
            System.out.println(al1.get(i));
        }

        for(String i1:al1)     //print all elements using for each loop
        {
            System.out.println(i1);
        }
    }
}