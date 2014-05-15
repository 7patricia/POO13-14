
/**
 * Classe para guardar a informação pessoal dos utilizadores
 * 
 * @author Grupo 17 
 */
import java.util.Set;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Collection;
public class Utilizador
{
    //Variáveis de Instância
    private String nome;
    private String email;
    private String password;
    private String genero;
    private double altura;
    private double peso;
    private String dataNascimento;
    private String desportoFavorito;
    private List<Utilizador> amigos;
    private TreeMap<String,Actividade> actividades;
    private ArrayList<ArrayList<Actividade>> records;
    //Construtores
    public Utilizador()
    {
        this.nome = "";
        this.email = "";
        this.password = "";
        this.genero = "";
        this.altura = 0.0;
        this.peso = 0.0;
        this.dataNascimento = "";
        this.desportoFavorito = "";
        this.amigos = new ArrayList<Utilizador>();
        this.actividades = new TreeMap<String,Actividade>();
        this.records = new ArrayList<ArrayList<Actividade>>();
    }

    public Utilizador(String n, String e, String pss, String g, double a, double p, String d, String f, List<Utilizador> am, TreeMap<String,Actividade> ac, ArrayList<ArrayList<Actividade>> rec)
    {
        this.nome = n;
        this.email = e;
        this.password = pss;
        this.genero = g;
        this.altura = a;
        this.peso = p;
        this.dataNascimento = d;
        this.desportoFavorito = f;
        this.amigos = new ArrayList<Utilizador>(am);
        this.actividades = new TreeMap<String,Actividade>(ac);
        this.records = new ArrayList<ArrayList<Actividade>>(rec);
    }

    //Métodos de Instância
    public String getNome()
    {
        return this.nome;
    }

    public String getEmail()
    {
        return this.email;
    }

    public String getPassword()
    {
        return this.password;
    }

    public String getGenero()
    {
        return this.genero;
    }

    public double getAltura()
    {
        return this.altura;
    }

    public double getPeso()
    {
        return this.peso;
    }

    public String getDataNascimento()
    {
        return this.dataNascimento;
    }

    public String getDesportoFavorito()
    {
        return this.desportoFavorito;
    }

    public ArrayList<Utilizador> getAmigos()
    {
        ArrayList<Utilizador> res = new ArrayList<Utilizador>();
        for(Utilizador u : this.amigos)
            for(int i =0;i<amigos.size()-1;i++)
                res.add(i,u.clone());
        return res;
    }

    public ArrayList getActividades()
    {
        ArrayList<Actividade> lista = new ArrayList<Actividade>();
        for(String key : actividades.keySet())
        {
            lista.add((actividades.get(key)));
        }
        return lista;
    }

    public void setNome(String n)
    {
        this.nome = n;
    }

    public void setEmail(String e)
    {
        this.email = e;
    }

    public void setPassword(String p)
    {
        this.password = p;
    }

    public void setGenero(String g)
    {
        this.genero = g;
    }

    public void setAltura(double a)
    {
        this.altura = a;
    }

    public void setPeso(double p)
    {
        this.peso = p;
    }

    public void setDataNascimento(String d)
    {
        this.dataNascimento = d;
    }

    public void setDesportoFavorito(String d)
    {
        this.desportoFavorito = d;
    }

    public void setAmigos(ArrayList<Utilizador> a)
    {
        int i;
        for(i=0;i<a.size()-1;i++)
            this.amigos.add(a.get(i));
    }

    public void setActividade(Actividade a)
    {
        this.actividades.put(a.getData(),a);
    }
    //Métodos
    public TreeMap<String,Actividade> ultimasDez()
    {
        
    }
    
    public TreeMap<String,Actividade> ultimasDezAmigo(Utilizador u)
    {
    
    }
    
    //ToString, Equals e Clone
    public String toString()
    {
        StringBuilder s = new StringBuilder("Utilizador: \n");   
        s.append(this.nome).append("\n Data de Nascimento: ").append(this.dataNascimento).append("\n Sexo: ").append(this.genero).append("\n Altura: ").append(this.altura).append("cm \n Peso: ").append(this.peso).append("kg \n Desporto Favorito: ").append(this.desportoFavorito);
        return s.toString();
    }

    public boolean equals(Object o)
    {
        if(this == o)
            return true;
        if((o==null || o.getClass()!=this.getClass()))
            return false;
        Utilizador u = (Utilizador) o;
        return(u.getEmail() == this.email);
    }

    public Utilizador clone()

    {
        return new Utilizador(this.nome, this.email, this.password, this.genero, this.altura, this.peso, this.dataNascimento, this.desportoFavorito, this.amigos, this.actividades, this.records);
    }
}
