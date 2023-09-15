package Methods;

/**
 * @author Jaypatel
 */
public class NotReturnValue {

    void reverse(String a)   //NOTE: we use void when we need to print in Function
    {
        String temp="";
        for(int i=a.length()-1;i>=0;i--)
        {
            temp=temp+a.charAt(i);
        }
        System.out.println(temp);
    }

    public static void main(String[] args) {
        NotReturnValue r1=new NotReturnValue();
        String str="This is reverse string";
        r1.reverse(str);


    }
}
