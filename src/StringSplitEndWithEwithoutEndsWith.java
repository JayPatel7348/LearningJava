public class StringSplitEndWithEwithoutEndsWith {

    public static void main(String[] args) {
        String str="We are learning the Java Language";

        String[] spStr=str.split(" ");
        for(int i=0;i<spStr.length;i++)
        {
            String temp=spStr[i];
            int l=temp.length();
            char LastChar= temp.charAt(l-1);  // you can also put temp.charAt(l-1) inside if condition
            if(LastChar=='e')
            System.out.println(spStr[i]);
        }

    }
}
