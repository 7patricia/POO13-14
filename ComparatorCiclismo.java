
/**
 * Write a description of class ComparatorCiclismo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.io.Serializable;
import java.util.Comparator;

public class ComparatorCiclismo implements Comparator<Object>, Serializable
{
    public int compare(Object c1, Object c2)
    {
        Ciclismo cc1 = (Ciclismo) c1;
        Ciclismo cc2 = (Ciclismo) c2;
        if(cc1.getDistancia() < cc2.getDistancia())
            return -1;
        if(cc1.getDistancia() > cc2.getDistancia())
            return 1;
        else
        if(cc1.getDuracao() < cc2.getDuracao())
            return 1;
        else 
            return -1;
    }
}
