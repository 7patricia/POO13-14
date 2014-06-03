
/**
 * Write a description of class ComparatorData here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Comparator;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ComparatorData implements Comparator<String>, Serializable
{
    public int compare(String d1, String d2) 
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd-MMM-yyyy");
        try {
 
		Date date1 = formato.parse(d1);
		Date date2 = formato.parse(d2);
 
	} catch (ParseException e) {
		e.printStackTrace();
	}
	
	return d1.compareTo(d2);
    }
}
