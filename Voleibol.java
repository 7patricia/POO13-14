
/**
 * Write a description of class Voleibol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Voleibol extends Actividade
{
    //Variáveis de Instância
    private int pontos;

    //Construtores
    public Voleibol()
    {
        super();
        this.pontos = 0;
    }

    public Voleibol(int p)
    {
        this.pontos = p;
    }

    public Voleibol(String cm, double c, double rc, String l, long dur,String data, int p)
    {
        super(cm,c,rc,l,dur,data);
        this.pontos = p;
    }

    public Voleibol(Actividade a, int p)
    {
        super(a);
        this.pontos = p;
    }
    //Métodos de Instância
    public int getPontos()
    {
        return this.pontos;
    }

    public void setPontos(int p)
    {
        this.pontos = p;
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
        Voleibol c = (Voleibol) o;
        return(super.equals(o) && (c.getPontos() == this.pontos));

    }

    public Voleibol clone()
    {
        return new Voleibol(super.clone(), this.pontos);
    }
}
