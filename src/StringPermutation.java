public class StringPermutation {
 // find character at different position ex. find char at 3 & length
    public static void main(String[] args) {
        String str1="AMOL";


        System.out.println(str1.substring(0)+str1.substring(0,0));
        System.out.println(str1.substring(1)+str1.substring(0,1));
        System.out.println(str1.substring(2)+str1.substring(0,2));
        System.out.println(str1.substring(3)+str1.substring(0,3));


        //str1.substring(0,3) here 3rd character is Not included
    }
}
