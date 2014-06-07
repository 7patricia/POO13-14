package org;

import java.io.Serializable;


/**
 * Write a description of class Natação here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Natacao extends Actividade implements Serializable
{
    //Variáveis de Instância
    private double distancia;

    //Construtores
    public Natacao()
    {
        super();
        this.distancia = 0.0;
    }

    public Natacao(double d)
    {
        this.distancia = d;
    }

    public Natacao(String cm, double c, double rc, String l, long dur, String data, double d)
    {
        super(cm,c,rc,l,dur,data,"Natação");
        this.distancia = d;
    }

    public Natacao(Actividade a, double d)
    {
        super(a);
        this.distancia = d;
    }
    //Métodos de Instância
    public double getDistancia()
    {
        return this.distancia;
    }


    public void setDistancia(double d)
    {
        this.distancia = d;
    }

  
    //ToString, Equals e Clone
    public String toString()
    {
        StringBuilder s = new StringBuilder("....."); 
        s.append(super.toString());
        return s.toString();
    }

    public boolean equals(Object o)
    {
        if(this == o) return true;
        if((o==null || o.getClass()!=this.getClass()))
            return false;
        Natacao c = (Natacao) o;
        return(super.equals(o) && (c.getDistancia() == this.distancia));

    }

    public Natacao clone()
    {
        return new Natacao(super.clone(),this.distancia);
    }
}
