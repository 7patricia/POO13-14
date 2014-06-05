
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
    private String tipo;
    //Construtores
    public Ciclismo()
    {
        super();
        this.distancia = 0.0;
        this.altitude = 0.0;
        this.tipo = "";
    }

    public Ciclismo(double d, double a, String t)
    {
        this.distancia = d;
        this.altitude = a;
        this.tipo = t;
    }

    public Ciclismo(String cm, double c, double rc, String l, long dur, String data, double d, double a, String t)
    {
        super(cm,c,rc,l,dur,data,"Ciclismo");
        this.distancia = d;
        this.altitude = a;
        this.tipo = t;
    }

    public Ciclismo(Actividade a,double d, double x, String t)
    {
        super(a);
        this.distancia = d;
        this.altitude = x;
        this.tipo = t;
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

    public String getTipo()
    {
        return this.tipo;
    }

    public void setDistancia(double d)
    {
        this.distancia = d;
    }

    public void setAltitude(double a)
    {
        this.altitude = a;
    }

    public void setTipo(String t){
        this.tipo = t;
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
        return(super.equals(o) && (c.getDistancia() == this.distancia) && (c.getTipo() == this.tipo) && (c.getAltitude() == this.altitude));

    }

    public Ciclismo clone()
    {
        return new Ciclismo(super.clone(), this.distancia, this.altitude, this.tipo);
    }
}
