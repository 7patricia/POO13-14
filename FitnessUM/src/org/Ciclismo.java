package org;


/**
 * Write a description of class Ciclismo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ciclismo extends Actividade
{
    //Variáveis de Instância
    private double distancia;
    private double altitude;
    //Construtores
    public Ciclismo()
    {
        super();
        this.distancia = 0.0;
        this.altitude = 0.0;

    }

    public Ciclismo(double d, double a)
    {
        this.distancia = d;
        this.altitude = a;
    }

    public Ciclismo(String cm, double c, double rc, String l, long dur, String data, double d, double a)
    {
        super(cm,c,rc,l,dur,data,"Ciclismo");
        this.distancia = d;
        this.altitude = a;
    }

    public Ciclismo(Actividade a,double d, double x)
    {
        super(a);
        this.distancia = d;
        this.altitude = x;
    }
    //Métodos de Instância
    public double getDistancia()
    {
        return this.distancia;
    }

    public double getAltitude()
    {
        return this.altitude;
    }


    public void setDistancia(double d)
    {
        this.distancia = d;
    }

    public void setAltitude(double a)
    {
        this.altitude = a;
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
        Ciclismo c = (Ciclismo) o;
        return(super.equals(o) && (c.getDistancia() == this.distancia)&& (c.getAltitude() == this.altitude));

    }

    public Ciclismo clone()
    {
        return new Ciclismo(super.clone(), this.distancia, this.altitude);
    }
}
