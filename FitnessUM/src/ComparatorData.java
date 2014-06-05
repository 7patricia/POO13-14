
/**
 * Write a description of class ComparatorData here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Comparator;
import java.io.Serializable;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class ComparatorData implements Comparator<String>, Serializable
{
    public int compare(String d1, String d2) 
    {
    DateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Calendar data1 = Calendar.getInstance();
        Calendar data2 = Calendar.getInstance();
        
        try {
            data1.setTime(formato.parse(d1));
            data2.setTime(formato.parse(d2));
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        return data1.compareTo(data2);
    }
}
