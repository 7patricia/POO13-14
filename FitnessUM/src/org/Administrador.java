package org;


/**
 * 
 * @author Grupo17
 */

import java.util.ArrayList;
import java.util.TreeMap;
public class Administrador
{
    // instance variables
    private String nome;
    private String email;
    private String password;
    

    //Construtores
    public Administrador()
    {
        this.nome="";
        this.email="";
        this.password="";
    }

    public Administrador(String n, String e, String p)
    {
        this.nome = n;
        this.email = e;
        this.password = p;
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

    
    /**
     * Função para aceitar ou rejeitar a inscrição de um utilizador num evento
     */
    public void aceitaEvento(Evento e, Utilizador u)
    {
        if(e.getNumLimite()<= e.getInscritos().size() && u.praticouActividade(e.getTipo()))
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
        return new Administrador(this.nome, this.email, this.password);
    }

    public String toString()
    {
        StringBuilder s = new StringBuilder("Administrador: \n");   
        s.append(this.nome);
        return s.toString();
    }

}
