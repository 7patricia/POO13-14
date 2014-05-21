
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

    /**
     * Função que verifica se um dado e-mail e password correspondem a um utilizador 
     * registado
     **/
    public boolean checkUser (String mail, String pass)
    {
        int flag = 0;
        for(int i=0; i<registos.size()-1 && flag == 0;i++)
        {
            if(registos.get(i).verificaDados(mail,pass) == true) flag = 1;
        }

        if (flag == 1) return true;
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

}
