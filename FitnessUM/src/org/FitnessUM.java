package org;


/**
 * Write a description of class FitnessUM here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.TreeMap;

public class FitnessUM
{
    // instance variables - replace the example below with your own
    protected ArrayList<Utilizador> registos;
    protected TreeMap<String,Evento> eventos;
    protected Utilizador utilizadorLigado;

    public FitnessUM()
    {
        this.registos = new ArrayList<Utilizador>();
        this.eventos = new TreeMap<String,Evento>(new ComparatorData());
        Utilizador u1 = new Utilizador();
        u1.setEmail("dummy@dummy.com");
        u1.setNome("dummy");
        u1.setPassword("um123");
        u1.setAltura(1.83);
        u1.setPeso(78.0);
        u1.setGenero("Masculino");
        u1.setDataNascimento("03-12-1995");
        u1.setDesportoFavorito("Caminhadas");
        Utilizador u2 = new Utilizador();
        u2.setEmail("joseTester@dummy.com");
        u2.setNome("Jose tester");
        u2.setPassword("um123");
        u2.setAltura(1.55);
        u2.setPeso(55.0);
        u2.setDataNascimento("06-03-1989");
        
        Caminhada a1 = new Caminhada("Chuva",  218.0, 118.0, "Braga", (long) 45,"1-01-2014",5.0, 100.0);
        Caminhada a2 = new Caminhada("Sol",  208.0, 118.0, "Braga", (long) 45,"5-03-2014",5.0, 100.0);
        u1.addActividade(a1);
        u1.addActividade(a2);
        registos.add(u2);
        registos.add(u1);
        
          
        this.utilizadorLigado = null;

    }

    public FitnessUM(ArrayList<Utilizador> r, TreeMap<String,Evento> e, Utilizador u)
    {
        this.registos = new ArrayList<Utilizador>(r);
        this.eventos = new TreeMap<String,Evento>(e);
        this.utilizadorLigado = u;
        

    }

    public void setUtilizadorLigado(Utilizador u)
    {
        this.utilizadorLigado = u.clone(); 
    }

    public void setEventos(TreeMap<String,Evento> e)
    {
        for(Evento even : e.values())
            this.eventos.put(even.getData(),even.clone());
    }

    public void setRegistos(ArrayList<Utilizador> r)
    {
        for(int i=0;i<r.size()-1;i++)
            this.registos.add(r.get(i).clone());
    }

    public Utilizador getUtilizadorLigado()
    {
        return this.utilizadorLigado;
    }

    public ArrayList<Utilizador> getRegistos()
    {
        ArrayList<Utilizador> res = new ArrayList<Utilizador>();
        for(Utilizador u : this.registos)
            for(int i =0;i<registos.size()-1;i++)
                res.add(i,u.clone());
        return res;
    }

    public TreeMap<String,Evento> getEventos()
    {
        TreeMap<String,Evento> res = new TreeMap<String,Evento>(new ComparatorData());
        for(Evento e : this.eventos.values())
            res.put(e.getData(),e.clone());
        return res;  
    }

    /**
     * Função que verifica se um dado e-mail e password correspondem a um utilizador 
     * registado e se sim faz o login
     * @param mail
     * @param pass
     * @return 
     **/
    public boolean checkUser (String mail, String pass)
    {
        int i;  
        int flag = 0;
        for(Utilizador u : registos)
        {
            if(u.verificaDados(mail,pass) == true) utilizadorLigado = u;
        }
        return utilizadorLigado != null;
    }
    
     

    /**
     * Função que verifica se um utilizador já está registado e se não estiver 
     * adiciona-o à lista de registos
     */
    public boolean registar(String mail, String pass, String nome, String sexo, String dataNascimento, String desporto, String altura, String peso)
    {
        if(checkUser(mail,pass) == true) return false;
        else 
        {
            Utilizador novo = new Utilizador();
            novo.setEmail(mail);
            novo.setPassword(pass);
            novo.setGenero(sexo);
            novo.setDataNascimento(dataNascimento);
            novo.setDesportoFavorito(desporto);
            novo.setNome(nome);
            System.out.println(altura);
            novo.setAltura((double)(Integer.parseInt(altura)));
            novo.setPeso((double)(Integer.parseInt(peso)));
            
            registos.add(novo);
            return true;
        }
    }
    
    /**
     * Função que verifica se um utilizador está registado e se sim remove-o da lista
     * de registos
     */
    public boolean remover(String mail,String pass)
    {
        if(checkUser(mail,pass) == true) 
        {
            registos.remove(userIndice(mail,pass)) ;
            return true;
        }
        else return false;
    }

    /**
     * Função que retorna a posição de um utilizador no ArrayList de registos
     * (se ele tiver registado, se não retorna menos um)
     */
    public int userIndice (String mail,String pass)
    {
        for(int i=0; i<registos.size()-1;i++)
        {
            if(registos.get(i).verificaDados(mail,pass) == true) return i;
        }
        return -1;
    }
    
    /**
     * Função que retorna a posição de um utilizador no ArrayList de registos
     * (se ele tiver registado, se não retorna menos um)
     */
    public int userIndiceMail (String mail)
    {
        for(int i=0; i<registos.size()-1;i++)
        {
            if(registos.get(i).verificaMail(mail) == true) return i;
        }
        return -1;
    }

    /**
     * Função que adiciona uma actividade à lista de atividades do utilizador ligado
     */
    public void adicionaActividade(Actividade a)
    {
        utilizadorLigado.addActividade(a);
    }

    /**
     * Função que remove uma actividade da lista de actividades do utilizador ligado
     */
    public boolean removeActividade(Actividade a)
    {
        if(this.utilizadorLigado.getActividades().contains(a))
        {
            this.utilizadorLigado.remAct(a);
            return true;
        }
        else
            return false;
    }

    /**
     * Função que retorna as 10 actividades mais recentes do utilizador ligado
     */
    public ArrayList<Actividade> dezUtilizador()
    {
        return utilizadorLigado.ultimasDez();
    }

    /**
     * Função que retorna as 10 actividades mais recentes de um amigo do utilizador ligado
     */
    public ArrayList<Actividade> dezAmigo (Utilizador amigo)
    {
        return utilizadorLigado.ultimasDezAmigo(amigo);
    }

    /**
     * Função que mostra os dados do utilizador ligado
     */
    public String dados_util()
    {
        return utilizadorLigado.toString();
    }

    /** 
     * Função que mostra dados de um amigo
     */
    public String dados_amigo(Utilizador amigo)
    {
        if (utilizadorLigado.getAmigos().contains(amigo))
            return amigo.toString();
        else
            return "";
    }

    /**
     * Função que permite ao utilizador ligado aceitar um pedido de amizade
     */
    public void aceitarPedido(Utilizador pedinte)
    {
        this.utilizadorLigado.removePedido(pedinte);
        this.utilizadorLigado.adicionaAmigo(pedinte);
    }

    /**
     * Função que permite ao utilizador ligado rejeitar um pedido de amizade
     */
    public void rejeitarPedido(Utilizador pedinte)
    {
        this.utilizadorLigado.removePedido(pedinte);
    }

    /**
     * Função que permite ao utilizador ligado fazer um pedido de amizade
     */
    public void efectuarPedido(Utilizador futuroAmigo)
    {
        futuroAmigo.adicionaPedido(this.utilizadorLigado);
    }

    /**
     * Função que retorna as actividades do utilizador ligado num determinado mês
     */
    public TreeMap<String,Actividade> mes (String mes)
    {
        return utilizadorLigado.actividadesMes(mes);
    }

    /**
     * Função que retorna as actividades do utilizador ligado num determinado ano
     */
    public TreeMap<String,Actividade> ano (String ano)
    {
        return utilizadorLigado.actividadesAno(ano);
    }

    //Equals e clone

    public boolean equals(Object o)
    {
        if(this == o)
            return true;
        if((o==null || o.getClass()!=this.getClass()))
            return false;
        FitnessUM u = (FitnessUM) o;
        return((u.getUtilizadorLigado() == this.utilizadorLigado) && (u.getEventos() == this.eventos) && (u.getRegistos() == this.registos));
    }

    public FitnessUM clone()

    {
        return new FitnessUM(this.registos, this.eventos, this.utilizadorLigado);
    }
}

