
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
    private ArrayList<Evento> eventosInscrito;
    private ArrayList<Evento> eventosPendentes;
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
            lista.add((actividades.get(key)).clone());
        }
        return lista;
    }

    public ArrayList getEventosInscrito()
    {
        ArrayList<Evento> res = new ArrayList<Evento>();
        for(Evento e : this.eventosInscrito)
            for(int i =0;i<eventosInscrito.size()-1;i++)
                res.add(i,e.clone());
        return res;
    }

    public ArrayList getEventosPendentes()
    {
        ArrayList<Evento> res = new ArrayList<Evento>();
        for(Evento e : this.eventosPendentes)
            for(int i =0;i<eventosPendentes.size()-1;i++)
                res.add(i,e.clone());
        return res;
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
            this.amigos.add(a.get(i).clone());
    }

    public void setActividade(Actividade a)
    {
        this.actividades.put(a.getData(),a.clone());
    }

    public void setEventosInscrito(ArrayList<Evento> e)
    {
        int i;
        for(i=0;i<e.size()-1;i++)
            this.eventosInscrito.add(e.get(i).clone());
    }

    public void setEventosPendentes(ArrayList<Evento> e)
    {
        int i;
        for(i=0;i<e.size()-1;i++)
            this.eventosPendentes.add(e.get(i).clone());
    }

    //Métodos
    /**
     * Função que devolve a lista das últimas 10 atividades de um utilizador
     */
    public ArrayList<Actividade> ultimasDez()
    {
        ArrayList<Actividade> listaDez = new ArrayList<Actividade>();
        for(int i=0;i<10;i++){
            for(String key : actividades.keySet())
            {
                listaDez.add((actividades.get(key)).clone());
            }
        }
        return listaDez;
    }

    /**
     * Função que devolve as últimas dez atividades de um utilizador se 
     * este pertencer à lista de amigos do utlizador em questão
     */
    public ArrayList<Actividade> ultimasDezAmigo(Utilizador u)
    {
        if(this.amigos.contains(u)) return u.ultimasDez();
        else return new ArrayList<Actividade>();
    } 

    /**
     * Função que verifica se as credenciais passadas como argumento
     * pertencem a este utilizador
     */
    public boolean verificaDados(String mail, String pass)
    {
        if (this.email == mail && this.password == pass) return true;
        else return false;
    }

    /**
     * Função que devolve a lista de actividades de um utilizador num
     * determinado mês
     */
    /** public TreeMap<String,Actividade> actividadesMes(String mes)
    {
    TreeMap<String,Actividade> res = new TreeMap<String,Actividade>();
    if(mes == MES)
    res.put(mes,qqr coisa);
    return res;
    }
     */
    
     /**
     * Função que devolve a lista de actividades de um utilizador num
     * determinado ano
     */
    /** public TreeMap<String,Actividade> actividadesAno(String ano)
    {
    TreeMap<String,Actividade> res = new TreeMap<String,Actividade>();
    if(ano == ANO)
    res.put(ano,qqr coisa);
    return res;
    }
     */

    /**
     * Função que remove um Evento da lista de eventos pendentes
     */
    public void removePendente(Evento e)
    {
        for(int i=0; i<eventosPendentes.size()-1;i++)
            if(e == this.eventosPendentes.get(i))
                eventosPendentes.remove(i);
    }

    /**
     * Função que remove um Evento da lista de eventos em que está inscrito
     */
    public void removeInscrito(Evento e)
    {
        for(int i=0; i<eventosInscrito.size()-1;i++)
            if(e == this.eventosInscrito.get(i))
                eventosInscrito.remove(i);
    }

    /**
     * Função que adiciona um Evento à lista de eventos pendentes
     */
    public void adicionaPendente(Evento e)
    {
        for(int i=0; i<eventosPendentes.size()-1;i++)
            if(e == this.eventosPendentes.get(i))
                this.eventosPendentes.add(e.clone());
    }

    /**
     * Função que adiciona um Evento à lista de eventos em que está inscrito
     */
    public void adicionaInscrito(Evento e)
    {
        for(int i=0; i<eventosInscrito.size()-1;i++)
            if(e == this.eventosInscrito.get(i))
                this.eventosInscrito.add(e.clone());
    }

    /**
     * Função que remove uma actividade da lista de actividades do utilizador
     */

    public void remAct(Actividade a)
    {
        this.actividades.remove(a);
    }
    
    /**
     * Função que adiciona um record à lista
     */
    
    
    /**
     * Função que remove um record da lista
     */
    


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
