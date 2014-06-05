package org;


/**
 * Write a description of class ComparatorBasquetebol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Comparator;
import java.io.Serializable;

public class ComparatorBasquetebol implements Comparator<Object> 
{
    public int compare(Object b1, Object b2)
    {
        Basquetebol bb1 = (Basquetebol) b1;
        Basquetebol bb2 = (Basquetebol) b2;
        if(bb1.getCestos() < bb2.getCestos())
            return 1;
        else return -1;
    }
}
