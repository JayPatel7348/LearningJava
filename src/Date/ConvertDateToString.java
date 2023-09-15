package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Jaypatel
 */
public class ConvertDateToString {

    public static void main(String[] args) throws ParseException {

        Date d=new Date();
        System.out.println(d); //Default date format

        // Convert default date to String dd/MM/yyyy

        SimpleDateFormat sd= new SimpleDateFormat("dd/mm/yyyy");
        String datestr=sd.format(d);
        System.out.println("Reformatted date: "+datestr);


        //Convert String to default date
        SimpleDateFormat sd0 = new SimpleDateFormat("dd/mm/yyyy");
        Date date0 = sd0.parse(datestr);
        System.out.println("reformatted to default date: "+date0);
    }
}
