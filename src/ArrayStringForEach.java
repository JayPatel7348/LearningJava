public class ArrayStringForEach {

    public static void main(String[] args) {
        String[] s={"Jay", "Jinesh", "Shivani", "Sejal", "Gully"};
       /* for(String x:s)
        {
            System.out.println(x);
        } */
        for(int i=0;i<s.length;i++)
        {
            if(s[i]!="Jay") //Jay discarded else elements will print
            System.out.println(s[i]);
        }


    }
}
