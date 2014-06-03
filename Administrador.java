
/**
 * Write a description of class Administrador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;
public class Administrador
{
    // instance variables - replace the example below with your own
    private String nome;
    private String email;
    private String password;
    private ArrayList<Utilizador> utilizadores;
    //Construtores
    public Administrador()
    {
        this.nome="";
        this.email="";
        this.password="";
        this.utilizadores= new ArrayList<Utilizador>();
    }

    public Administrador(String n, String e, String p, ArrayList<Utilizador> u)
    {
        this.nome = n;
        this.email = e;
        this.password = p;
        this.utilizadores = u;
    }

    //Métodos de Instância
    public String getNome()
    {
        return this.nome;
    }

    public String getPassword()
    {
        return this.password;
    }

    public String getEmail()
    {
        return this.email;
    }

    public ArrayList<Utilizador> getUtilizadores ()
    {
        ArrayList<Utilizador> res = new ArrayList<Utilizador>();
        for(Utilizador u : this.utilizadores)
            for(int i =0;i<utilizadores.size()-1;i++)
                res.add(i,u.clone());
        return res;
    }

    public void setNome(String n)
    {
        this.nome = n;
    }

    public void setPassword(String p)
    {
        this.password=p;
    }

    public void setEmail(String e)
    {
        this.email=e;
    }

    public void setUtilizadores(ArrayList<Utilizador> u)
    {
        int i;
        for(i=0;i<u.size()-1;i++)
            this.utilizadores.add(u.get(i).clone());
    }

    /**
     * Função para aceitar ou rejeitar a inscrição de um utilizador num evento
     */
    public void aceitaEvento(Evento e, Utilizador u)
    {
        if(e.getNumLimite()<= e.getInscritos().size())
        {
            u.removeInscrito(e);
        }
        else 
        {
            u.removePendente(e);
            u.adicionaInscrito(e.clone());
            e.getInscritos().add(u.clone());
        }
    }

    //Equals, toString, Clone

    public boolean equals(Object o)
    {
        if(this == o)
            return true;
        if((o==null || o.getClass()!=this.getClass()))
            return false;
        Administrador a = (Administrador) o;
        return(a.getEmail() == this.email);
    }

    public Administrador clone()

    {
        return new Administrador(this.nome, this.email, this.password, this.utilizadores);
    }

    public String toString()
    {
        StringBuilder s = new StringBuilder("Administrador: \n");   
        s.append(this.nome);
        return s.toString();
    }

}
