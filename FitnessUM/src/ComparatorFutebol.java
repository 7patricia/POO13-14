
/**
 * Write a description of class ComparatorFutebol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Comparator;
import java.io.Serializable;

public class ComparatorFutebol implements Comparator<Object>, Serializable
{
  public int compare(Object f1, Object f2)
  {
    Futebol ff1 = (Futebol) f1;
    Futebol ff2 = (Futebol) f2;
    
    if(ff1.getGolos() < ff2.getGolos())
        return -1;
        else return 1;
    }  
}
