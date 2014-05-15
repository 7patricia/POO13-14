
/**
 * Write a description of class Corrida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Atletismo extends Actividade
{
  //Variáveis de Instância
  private double distancia;
  private double altitude;
  private String tipo;
  //Construtores
    public Atletismo()
    {
        super();
        this.distancia = 0.0;
        this.altitude = 0.0;
        this.tipo = "";
    }

    public Atletismo(double d, double a, String t)
    {
        this.distancia = d;
        this.altitude = a;
        this.tipo = t;
    }

    public Atletismo(String cm, double c, double rc, String l, long dur, String data, double d, double a, String t)
    {
        super(cm,c,rc,l,dur,data);
        this.distancia = d;
        this.altitude = a;
        this.tipo = t;
    }

    public Atletismo(Actividade a,double d, double x, String t)
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
        Atletismo c = (Atletismo) o;
        return(super.equals(o) && (c.getDistancia() == this.distancia) && (c.getTipo() == this.tipo) && (c.getAltitude() == this.altitude));

    }
    public Atletismo clone()
    {
        return new Atletismo(super.clone(), this.distancia, this.altitude, this.tipo);
    }
}
