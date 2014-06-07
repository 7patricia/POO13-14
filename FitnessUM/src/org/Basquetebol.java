package org;

import java.io.Serializable;


/**
 * Write a description of class Basquetebol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Basquetebol extends Actividade implements Serializable
{
    //Variáveis de Instância
    private double distancia;
    private int cestos;

    //Construtores
    public Basquetebol()
    {
        super();
        this.distancia = 0.0;
        this.cestos = 0;
    }

    public Basquetebol(double d, int c)
    {
        this.distancia = d;
        this.cestos = c;
    }

    public Basquetebol(String cm, double c, double rc, String l, long dur, String data, double d, int x)
    {
        super(cm,c,rc,l,dur,data,"Basquetebol");
        this.distancia = d;
        this.cestos = x;
    }

    public Basquetebol(Actividade a,double d, int c)
    {
        super(a);
        this.distancia = d;
        this.cestos = c;
    }
    //Métodos de Instância
    public double getDistancia()
    {
        return this.distancia;
    }

    public int getCestos()
    {
        return this.cestos;
    }

    public void setDistancia(double d)
    {
        this.distancia = d;
    }

    public void setCestos(int c)
    {
        this.cestos = c;
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
        Basquetebol c = (Basquetebol) o;
        return(super.equals(o) && (c.getDistancia() == this.distancia) && (c.getCestos() == this.cestos));

    }

    public Basquetebol clone()
    {
        return new Basquetebol(super.clone(), this.distancia, this.cestos);
    }
}
