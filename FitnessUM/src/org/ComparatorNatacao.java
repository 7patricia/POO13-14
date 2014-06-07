package org;


/**
 * Write a description of class ComparatorNatacao here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Comparator;
import java.io.Serializable;

public class ComparatorNatacao implements Comparator<Object>,Serializable
{
    public int compare(Object n1, Object n2)
    {
        
        Natacao nn1 = (Natacao) n1;
        Natacao nn2 = (Natacao) n2;
        if(nn1.getDuracao() < nn2.getDuracao())
        return 1;
        if(nn1.getDuracao() > nn2.getDuracao())
            return -1;
       else
        if(nn1.getDistancia() < nn2.getDistancia())
            return -1;
        else
            return 1; 
    }
}
