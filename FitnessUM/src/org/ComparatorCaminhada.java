package org;


/**
 * Write a description of class CompareObject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Comparator;
import java.io.Serializable;

public class ComparatorCaminhada implements Comparator<Object>, Serializable
{
   public int compare(Object c1, Object c2)
   {
    Caminhada cc1 = (Caminhada) c1;
    Caminhada cc2 = (Caminhada) c2;
    if(cc1.getDistancia() < cc2.getDistancia())
        return 1;
    else return -1;
    }
}
