import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

    public static void main(String[] args) {

        /*
        Convert current date in below format
        -> dd|MMMM yy h:mm
        -> yyyy-MM-dd|h:mm:ss
         → EEEE yyyy/MM/dd
         → dd-MM-yyyy | E | h:mm
         → h:mm:ss
        */
        Date date=new Date();

        SimpleDateFormat df1=new SimpleDateFormat("dd|MMMM yy h:mm");
        String dateStr1=df1.format(date);
        System.out.println(dateStr1);

        SimpleDateFormat df2=new SimpleDateFormat("yyyy-MM-dd|h:mm:ss");
        String dateStr2=df2.format(date);
        System.out.println(dateStr2);

        SimpleDateFormat df3=new SimpleDateFormat("EEEE yyyy/MM/dd");
        String dateStr3=df3.format(date);
        System.out.println(dateStr3);

        SimpleDateFormat df4=new SimpleDateFormat("dd-MM-yyyy | E | h:mm");
        String dateStr4=df4.format(date);
        System.out.println(dateStr4);

        SimpleDateFormat df5=new SimpleDateFormat("h:mm:ss");
        String dateStr5=df5.format(date);
        System.out.println(dateStr5);
    }
}
