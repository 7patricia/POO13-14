
/**
 * Write a description of class Natação here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Natacao extends Actividade
{
    //Variáveis de Instância
    private String tipo;
    private double distancia;

    //Construtores
    public Natacao()
    {
        super();
        this.tipo = "";
        this.distancia = 0.0;
    }

    public Natacao(String t, double d)
    {
        this.tipo = t;
        this.distancia = d;
    }

    public Natacao(String cm, double c, double rc, String l, long dur, String data, String t, double d)
    {
        super(cm,c,rc,l,dur,data,"Natação");
        this.tipo = t;
        this.distancia = d;
    }

    public Natacao(Actividade a,String t, double d)
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
        Natacao c = (Natacao) o;
        return(super.equals(o) && (c.getDistancia() == this.distancia) && (c.getTipo() == this.tipo));

    }

    public Natacao clone()
    {
        return new Natacao(super.clone(), this.tipo, this.distancia);
    }
}
