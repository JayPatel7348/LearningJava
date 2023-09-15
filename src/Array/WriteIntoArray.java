package Array;

import java.lang.reflect.Array;

public class WriteIntoArray {
 // find character at different position ex. find char at 3 & length
    public static void main(String[] args) {
        String str="We are learning the java Language";

        String[] spStr=str.split(" ");
        String[] spStr1=new String[6];
        for(int i=0;i<spStr.length;i++)
        {
                System.out.println(spStr[i]);
                Array.set(spStr1,i,spStr[i]);  //Element value added into spStr1 array
        }

        //Now i can print copy of spStr
        for(int j=0;j<spStr1.length;j++)
        {
            System.out.println(spStr1[j]);
        }
    }
}
