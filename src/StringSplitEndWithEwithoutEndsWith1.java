public class StringSplitEndWithEwithoutEndsWith1 {

    public static void main(String[] args) {
        String str="We want to go to TORONTO";
//Print the word whose 2nd character is 'o'
        String[] spStr=str.split(" ");
        for(int i=0;i<spStr.length;i++)
        {
            String temp=spStr[i];
            int l=temp.length();
            char LastChar= temp.charAt(1);  // you can also put temp.charAt(l-1) inside if condition
            if(LastChar=='o' || LastChar=='O')
            System.out.println(spStr[i]);
        }

    }
}
