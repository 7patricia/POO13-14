package org;


/**
 * Write a description of class ComparatorVoleibol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Comparator;
import java.io.Serializable;

public class ComparatorVoleibol implements Comparator<Object>,Serializable
{
    public int compare(Object v1, Object v2)
    {
        Voleibol vv1 = (Voleibol) v1;
        Voleibol vv2 = (Voleibol) v1;
        
        if(vv1.getPontos() < vv2.getPontos())
            return -1;
            else
            return 1;
    }
}
