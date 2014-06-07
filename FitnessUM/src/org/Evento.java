package org;


/**
 * Write a description of class Evento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.Serializable;
import java.util.ArrayList;
public class Evento  implements Serializable
{
    // Variáveis de Instância
    private String nome;
    private String data;
    private ArrayList<Utilizador> inscritos;
    private int numLimite;
    private String dataLim;
    private String tipo;
    private ArrayList<Utilizador> pedidosInscricao;
    //Construtores
    
    public Evento()
    {
        this.nome = "";
        this.data = "";
        this.inscritos = new ArrayList<Utilizador>();
        this.numLimite = 0;
        this.dataLim = "";
        this.tipo="";
        this.pedidosInscricao = new ArrayList<Utilizador>();
    }

    public Evento(String n, String d, ArrayList<Utilizador> i, int x, String dl,String tipo, ArrayList<Utilizador> p)
    {
        this.nome = n;
        this.data = d;
        this.inscritos = new ArrayList<Utilizador>(i);
        this.numLimite = x;
        this.dataLim = dl;
        this.tipo = tipo;
        this.pedidosInscricao = p;
    }

    public Evento(Evento e)
    {
        this(e.getNome(), e.getData(), e.getInscritos(), e.getNumLimite(), e.getDataLim(), e.getTipo(), e.getPedidosInscricao());
    }
    //Métodos de Instância
    public String getNome()
    {
        return this.nome;
    }

    public String getData()
    {
        return this.data; 
    }
    
    public String getTipo()
    {
        return this.tipo; 
    }

    public ArrayList<Utilizador> getInscritos()
    {
        ArrayList<Utilizador> res = new ArrayList<Utilizador>();
        for (Utilizador u : this.inscritos)
            res.add(u.clone());
        return res;
    }  
    
     public ArrayList<Utilizador> getPedidosInscricao()
    {
        ArrayList<Utilizador> res = new ArrayList<Utilizador>();
        for (Utilizador u : this.pedidosInscricao)
            res.add(u.clone());
        return res;
    }  

    public int getNumLimite()
    {
        return this.numLimite;
    }

    public String getDataLim()
    {
        return this.dataLim;
    }

    public void setNome(String n)
    {
        this.nome = n;
    }
    
    public void setTipo(String t)
    {
        this.tipo = t;
    }

    public void setData(String d)
    {
        this.data = d;
    }

    public void setInscritos(ArrayList<Utilizador> inscricoes)
    {
        int i;
        for(i=0;i<inscricoes.size()-1;i++)
        {
            this.inscritos.add(inscricoes.get(i));
        }
    }
    
    public void setPedidosInscricao(ArrayList<Utilizador> pedidos)
    {
        int i;
        for(i=0;i<pedidos.size()-1;i++)
        {
            this.pedidosInscricao.add(pedidos.get(i));
        }
    }

    public void setNumLimite(int i)
    {
        this.numLimite = i;
    }

    public void setDataLim(String d)
    {
        this.dataLim = d;
    }
    
    /**
     * Função para adicionar um utilizador aos pedidos de inscricao
     * @param u
     * @return 
     */
    public boolean addPedido(Utilizador u)
      {
        if(this.pedidosInscricao.contains(u))
            return false;
        else{
            this.pedidosInscricao.add(u);
            u.adicionaPendente(this);
            return true;
        } 
        
      }
    

    
    
    //ToString Equals e Clone
    public String toString()
    {
        StringBuilder s = new StringBuilder("Evento: \n");
        s.append(this.nome).append("\n Data: ").append(this.data).append("\n Data Limite de Inscrição: ").append(this.dataLim).append("\n Vagas: \n").append(this.numLimite-this.inscritos.size());
        for(Utilizador u : inscritos)
        {
            s.append(u.toString());
        }
        return s.toString();
    }

    public boolean equals(Object o)
    {
        if(this == o)
            return true;
        if ((o!=null || (o.getClass()!=this.getClass())))
            return false;
        Evento e = (Evento) o;

        return ((e.getNome() == this.nome) && (e.getData() == this.data) && (this.pedidosInscricao.equals(e.getPedidosInscricao()) && this.inscritos.equals(e.getInscritos())));
    }

    public Evento clone() 
    {
        return new Evento(this.nome, this.data, this.inscritos, this.numLimite, this.dataLim, this.tipo,this.pedidosInscricao);
    }
}
