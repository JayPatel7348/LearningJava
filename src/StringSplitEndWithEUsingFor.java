public class StringSplitEndWithEUsingFor {

    public static void main(String[] args) {
        String str="We are learning the Java Language";

        String[] spStr=str.split(" ");
        for(int i=0;i<spStr.length;i++)
        {
            if(spStr[i].endsWith("e"))
            System.out.println(spStr[i]);
        }

    }
}
