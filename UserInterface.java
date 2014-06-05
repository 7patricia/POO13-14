
/**
 * Write a description of class UserInterface here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UserInterface
{
    // instance variables - replace the example below with your own

    public static void main(String args[])
    {
        public void log(String s)
        {
            System.out.println(s);
        }
    }

    FitnessUM fitnessUM = new FitnessUM();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String response = br.readLine();
    while(response.equals("exit")==false){
        String[] command = response.split(" ");
        switch (command[0]){
            case "login":
            if(command.size()==3){
                if(fitnessUM.getUtilizadorLigado()==null){
                    String username = command[1];
                    String pass = command[2];
                    boolean aux = fitnessUM.checkUser(username,pass);
                    if(aux==false){
                        log("Dados incorrectos!\n");
                    }
                    else
                        log("Logado com sucesso!\n");

                }
            }
            case "registar":
            if (command.size()==3)
            {
                boolean aux = fitnessUM.registar(command[1],command[2]);
                if(aux == true)
                {
                    log("Registado com sucesso!\n");
                }
                else
                    log("O registo falhou\n");

            }
        }
        response = br.readLine();

    }

}
}
