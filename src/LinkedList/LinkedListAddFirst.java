package LinkedList;

import java.util.LinkedList;

/**
 * @author Jaypatel
 */
public class LinkedListAddFirst {

    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList<>();

        ll1.addLast("jinesh");
        ll1.add("Jay");
        ll1.addFirst("Patel");

        System.out.println(ll1);
    }
}