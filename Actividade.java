
/**
 * Super Classe para guardar os dados gerais que podem ser aplicados a todas as actividades. 
 * 
 * @author Grupo 17
 * 
 */

public class Actividade
{
    //Variáveis de Instância
    protected String condMeteo;
    protected double calorias;
    protected double ritmoCardio;
    protected String local;
    protected long duracao;
    protected String data;
    private String tipo;

    //Construtores
    public Actividade()
    {
        this.condMeteo = "";
        this.calorias = 0.0;
        this.ritmoCardio = 0.0;
        this.local = "";
        this.duracao = 0;
        this.data="";
        this.tipo = "";
    }

    public Actividade(String cm, double c, double rc, String l, long dur, String data, String tipo)
    {
        this.condMeteo = cm;
        this.calorias = c;
        this.ritmoCardio = rc;
        this.local = l;
        this.duracao = dur;
        this.data =data;
        this.tipo = tipo;
    }

    public Actividade(Actividade a)
    {
        this(a.condMeteo, a.calorias, a.ritmoCardio, a.local, a.duracao, a.data, a.tipo);
    }

    //Métodos de Instância
    public String getCondMeteo()
    {
        return this.condMeteo;
    }

    public  double getCalorias()
    {
        return this.calorias;
    }

    public double getRitmoCardio()
    {
        return this.ritmoCardio;
    }

    public String getLocal()
    {
        return this.local;
    }

    public long getDuracao()
    {
        return this.duracao;
    }

    public String getData()

    {
        return this.data;
    }
    
    public String getTipo()

    {
        return this.tipo;
    }

    public void setCondMeteo(String cm)
    {
        this.condMeteo = cm;
    }

    public void setCalorias(double c)
    {
        this.calorias = c;
    }

    public void setRitmoCardio(double rc)
    {
        this.ritmoCardio = rc;
    }

    public void setLocal(String l)
    {
        this.local = l;
    }

    public void setDuracao(long d)
    {
        this.duracao = d;
    }

    public void setData( String d)
    {
        this.data = d;
    }
    
    public void setTipo( String t)
    {
        this.tipo = t;
    }

    //getClass, ToString, Equals e Clone
    public String toString()
    {
        StringBuilder s = new StringBuilder("....");   
        return s.toString();
    }

    public boolean equals(Object o)
    {
        if(this == o) return true;
        if((o==null || o.getClass()!=this.getClass()))
            return false;
        Actividade a = (Actividade) o;
        return((a.getData() == this.data) && (a.getDuracao() == this.duracao && (a.getLocal() == this.local) && (a.getRitmoCardio() == this.ritmoCardio) && (a.getCalorias() == this.calorias) && (a.getCondMeteo() == this.condMeteo)));

    }

    public Actividade clone()
    {
        return new Actividade(this.condMeteo, this.calorias, this.ritmoCardio, this.local, this.duracao, this.data, this.tipo);
    }
}
