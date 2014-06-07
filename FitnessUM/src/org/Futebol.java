package org;

import java.io.Serializable;


/**
 * Write a description of class Futebol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Futebol extends Actividade implements Serializable
{
    //Variáveis de Instância
    private int golos;
    private double distancia;
    //Construtores
    public Futebol()
    {
        super();
        this.distancia = 0.0;
        this.golos = 0;
    }

    public Futebol(double d, int c)
    {
        this.distancia = d;
        this.golos = c;
    }

    public Futebol(String cm, double c, double rc, String l, long dur, String data, double d, int x)
    {
        super(cm,c,rc,l,dur,data,"Futebol");
        this.distancia = d;
        this.golos = x;
    }

    public Futebol(Actividade a,double d, int c)
    {
        super(a);
        this.distancia = d;
        this.golos = c;
    }
    //Métodos de Instância
    public double getDistancia()
    {
        return this.distancia;
    }

    public int getGolos()
    {
        return this.golos;
    }

    public void setDistancia(double d)
    {
        this.distancia = d;
    }

    public void setGolos(int c)
    {
        this.golos = c;
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
        Futebol c = (Futebol) o;
        return(super.equals(o) && (c.getDistancia() == this.distancia) && (c.getGolos() == this.golos));

    }

    public Futebol clone()
    {
        return new Futebol(super.clone(), this.distancia, this.golos);
    }
}

