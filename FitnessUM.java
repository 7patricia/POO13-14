
/**
 * Write a description of class FitnessUM here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class FitnessUM
{
    // instance variables - replace the example below with your own
    protected ArrayList<Utilizador> registos;
    protected ArrayList<Evento> eventos;
    protected Utilizador utilizadorLigado;

    /**
     * Função que verifica se um dado e-mail e password correspondem a um utilizador 
     * registado
     **/
    public boolean checkUser (String mail, String pass)
    {
        int i;  
        int flag = 0;
        for(i=0; i<registos.size()-1 && flag == 0;i++)
        {
            if(registos.get(i).verificaDados(mail,pass) == true) flag = 1;
        }

        if (flag == 1) 
        {
            utilizadorLigado = registos.get(i);
            return true;
        }
        else return false;
    }

    /**
     * Função que verifica se um utilizador já está registado e se não estiver 
     * adiciona-o à lista de registos
     */
    public boolean registar(String mail, String pass)
    {
        if(checkUser(mail,pass) == true) return false;
        else 
        {
            Utilizador novo = new Utilizador();
            novo.setEmail(mail);
            novo.setPassword(pass);
            registos.add(novo);
            return true;
        }
    }

    /**
     * Função que retorna a posição de um utilizador no ArrayList de registos
     * (se ele tiver registado, se não retorna menos um)
     */
    public int userIndice (String mail, String pass)
    {
        for(int i=0; i<registos.size()-1;i++)
        {
            if(registos.get(i).verificaDados(mail,pass) == true) return i;
        }
        return -1;
    }

    /**
     * Função que verifica se um utilizador está registado e se sim remove-o da lista
     * de registos
     */
    public boolean remover(String mail, String pass)
    {
        if(checkUser(mail,pass) == true) 
        {
            registos.remove(userIndice(mail,pass)) ;
            return true;
        }
        else return false;
    }

    /**
     * Função que adiciona uma actividade à lista de atividades do utilizador ligado
     */
    public void addActividade(Actividade a)
    {
        utilizadorLigado.setActividade(a);
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
     * Função que retorna as actividades do utilizador ligado num determinado mês
     */
    /**public Tree
     * Map<String,Actividade>(String mes)
    {
    return utilizadorLigado.actividadeMes(mes);
    }*/
    
    /**
     * Função que retorna as actividades do utilizador ligado num determinado ano
     */
    /**public Tree
     * Map<String,Actividade>(String ano)
    {
    return utilizadorLigado.actividadeAno(ano);
    }*/
}

