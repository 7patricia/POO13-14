
/**
 * Write a description of class Natação here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Natação extends Actividade
{
    //Variáveis de Instância
    private String tipo;
    private double distancia;

    //Construtores
    public Natação()
    {
        super();
        this.tipo = "";
        this.distancia = 0.0;
    }

    public Natação(String t, double d)
    {
        this.tipo = t;
        this.distancia = d;
    }

    public Natação(String cm, double c, double rc, String l, long dur, String data, String t, double d)
    {
        super(cm,c,rc,l,dur,data);
        this.tipo = t;
        this.distancia = d;
    }

    public Natação(Actividade a,String t, double d)
    {
        super(a);
        this.tipo = t;
        this.distancia = d;
    }
    //Métodos de Instância
    public double getDistancia()
    {
        return this.distancia;
    }

    public String getTipo()
    {
        return this.tipo;
    }

    public void setDistancia(double d)
    {
        this.distancia = d;
    }

    public void setTipo(String t)
    {
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
        Natação c = (Natação) o;
        return(super.equals(o) && (c.getDistancia() == this.distancia) && (c.getTipo() == this.tipo));

    }

    public Natação clone()
    {
        return new Natação(super.clone(), this.tipo, this.distancia);
    }
}
