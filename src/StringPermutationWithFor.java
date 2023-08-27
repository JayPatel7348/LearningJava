public class StringPermutationWithFor {
 // find character at different position ex. find char at 3 & length
    public static void main(String[] args) {
        String str1="AMOL";

        for(int i=0;i<str1.length();i++)
        {
            System.out.println(str1.substring(i)+str1.substring(0,i));
        }
    }
}
