
/**
 * Write a description of class Caminhada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Caminhada extends Actividade implements ActVelocidade
{
    // Variáveis de Instância
    private double distancia;
    private double altitude;

    //Construtores
    public Caminhada()
    {
        super();
        this.distancia = 0.0;
        this.altitude = 0.0;
    }

    public Caminhada(double d, double a)
    {
        this.distancia = d;
        this.altitude = a;
    }

    public Caminhada(String cm, double c, double rc, String l, long dur, String data, double d, double a)
    {
        super(cm,c,rc,l,dur,data);
        this.distancia = d;
        this.altitude = a;
    }

    public Caminhada(Actividade a,double d, double x)
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
    
    /**
     * Função para calcular a velocidade media
     */
    
    public double velMedia()
    {
        return ((this.distancia)/this.getDuracao());
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
        Caminhada c = (Caminhada) o;
        return(super.equals(o) && (c.getDistancia() == this.distancia) && (c.getAltitude() == this.altitude));

    }

    public Caminhada clone()
    {
        return new Caminhada(super.clone(), this.distancia, this.altitude);
    }
}
