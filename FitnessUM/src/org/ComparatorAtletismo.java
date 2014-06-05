package org;


/**
 * Write a description of class ComparatorAtletismo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Comparator;
import java.io.Serializable;

public class ComparatorAtletismo implements Comparator<Object>, Serializable
{
    public int compare(Object a1, Object a2)
    {
        Atletismo aa1 = (Atletismo) a1;
        Atletismo aa2 = (Atletismo) a2;
        
        if(aa1.getDistancia() < aa2.getDistancia())
            return -1;
        if(aa1.getDistancia() > aa2.getDistancia())
            return 1;
        else
        if(aa1.getDuracao() < aa2.getDuracao())
            return 1;
        else
            return -1;
    }

}
