import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConvert {

    public static void main(String[] args) throws ParseException {
        /*
     Homework : convert below strings into date
     String dateStr3= "Thursday 2016/06/23";
     → EEEE yyyy/MM/dd
     String dateStr4= "23-06-2016 | thu | 8:34";
     → dd-MM-yyyy | E | h:mm
     String dateStr5= "8:34:22" ;
     → h:mm:ss
        */

        String date1= "Thursday 2016/06/23";
        SimpleDateFormat df1=new SimpleDateFormat("EEEE yyyy/MM/dd");
        Date dateStr1=df1.parse(date1);
        System.out.println(dateStr1);

        String date2= "23-06-2016 | thu | 8:34";
        SimpleDateFormat df2=new SimpleDateFormat("dd-MM-yyyy | E | h:mm");
        Date dateStr2=df2.parse(date2);
        System.out.println(dateStr2);

        String date3= "8:34:22" ;
        SimpleDateFormat df3=new SimpleDateFormat("h:mm:ss");
        Date dateStr3=df3.parse(date3);
        System.out.println(dateStr3);

    }
}
