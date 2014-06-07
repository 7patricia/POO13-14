package org;

/**
 * Classe para guardar a informação pessoal dos utilizadores
 *
 * @author Grupo 17
 */
import java.util.List;
import java.util.ArrayList;
import java.util.TreeMap;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Collections;

public class Utilizador {

    //Variáveis de Instância
    private String nome;
    private String email;
    private String password;
    private String genero;
    private double altura;
    private double peso;
    private String dataNascimento;
    private String desportoFavorito;
    private final List<Utilizador> amigos;
    private TreeMap<String, Actividade> actividades;
    private HashMap<String, ArrayList<Actividade>> records;
    private TreeMap<String, Evento> eventosInscrito;
    private TreeMap<String, Evento> eventosPendentes;
    private ArrayList<Utilizador> pedidosAmizade;

    //Construtores
    public Utilizador() {
        this.nome = "";
        this.email = "";
        this.password = "";
        this.genero = "";
        this.altura = 0.0;
        this.peso = 0.0;
        this.dataNascimento = "";
        this.desportoFavorito = "";
        this.amigos = new ArrayList<Utilizador>();
        this.actividades = new TreeMap<String, Actividade>(new ComparatorData());
        this.records = new HashMap<String, ArrayList<Actividade>>();
        this.pedidosAmizade = new ArrayList<>();
        this.eventosInscrito = new TreeMap<String, Evento>(new ComparatorData());
        this.eventosPendentes = new TreeMap<String, Evento>(new ComparatorData());
    }

    public Utilizador(String n, String e, String pss, String g, double a, double p, String d, String f, List<Utilizador> am, TreeMap<String, Actividade> ac, HashMap<String, ArrayList<Actividade>> rec, TreeMap<String, Evento> ei, TreeMap<String, Evento> ep) {
        this.nome = n;
        this.email = e;
        this.password = pss;
        this.genero = g;
        this.altura = a;
        this.peso = p;
        this.dataNascimento = d;
        this.desportoFavorito = f;
        this.amigos = new ArrayList<Utilizador>(am);
        this.actividades = new TreeMap<String, Actividade>(ac);
        this.records = new HashMap<String, ArrayList<Actividade>>(rec);
        this.eventosInscrito = new TreeMap<String, Evento>(ei);
        this.pedidosAmizade = new ArrayList<>();
        this.eventosPendentes = new TreeMap<String, Evento>(ep);
    }

    //Métodos de Instância
    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public String getGenero() {
        return this.genero;
    }

    public double getAltura() {
        return this.altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public String getDesportoFavorito() {
        return this.desportoFavorito;
    }

    public ArrayList<Utilizador> getAmigos() {
        ArrayList<Utilizador> res = new ArrayList<Utilizador>();
        System.out.println(amigos.size());
        if(!this.amigos.isEmpty()){
        for (Utilizador u : this.amigos) {
              res.add(u);
        }
        }
        return res;
    }

    public ArrayList<Utilizador> getPedidosAmizade() {
        ArrayList<Utilizador> res = new ArrayList<Utilizador>();
        if (!this.pedidosAmizade.isEmpty()) {
            for (Utilizador u : this.pedidosAmizade) {
                    res.add(u);
            }
        }
        return res;
    }

    public ArrayList getActividades() {
        ArrayList<Actividade> lista = new ArrayList<>();
        for (String key : actividades.keySet()) {
            lista.add((actividades.get(key)));
        }
        return lista;
    }

    public TreeMap getEventosInscrito() {
        TreeMap<String, Evento> res = new TreeMap<String, Evento>(new ComparatorData());
        for (Evento e : this.eventosInscrito.values()) {
            res.put(e.getData(), e.clone());
        }
        return res;
    }

    public TreeMap getEventosPendentes() {
        TreeMap<String, Evento> res = new TreeMap<String, Evento>();
        for (Evento e : this.eventosPendentes.values()) {
            res.put(e.getData(), e.clone());
        }
        return res;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public void setEmail(String e) {
        this.email = e;
    }

    public void setPassword(String p) {
        this.password = p;
    }

    public void setGenero(String g) {
        this.genero = g;
    }

    public void setAltura(double a) {
        this.altura = a;
    }

    public void setPeso(double p) {
        this.peso = p;
    }

    public void setDataNascimento(String d) {
        this.dataNascimento = d;
    }

    public void setDesportoFavorito(String d) {
        this.desportoFavorito = d;
    }

    public void setAmigos(ArrayList<Utilizador> a) {
        int i;
        for (i = 0; i < a.size() - 1; i++) {
            this.amigos.add(a.get(i).clone());
        }
    }

    public void setPedidosAmizade(ArrayList<Utilizador> a) {
        int i;
        for (i = 0; i < a.size() - 1; i++) {
            this.pedidosAmizade.add(a.get(i).clone());
        }
    }

    public void setActividade(Actividade a) {
        for (int i = 0; i < 10; i++) {
            this.actividades.put(a.getData(), a.clone());
        }
    }

    public void setEventosInscrito(TreeMap<String, Evento> e) {
        for (Evento even : e.values()) {
            this.eventosInscrito.put(even.getData(), even.clone());
        }
    }

    public void setEventosPendentes(TreeMap<String, Evento> e) {
        for (Evento even : e.values()) {
            this.eventosPendentes.put(even.getData(), even.clone());
        }
    }

    //Métodos
    /**
     * Função que devolve a lista das últimas 10 atividades de um utilizador
     */
    public ArrayList<Actividade> ultimasDez() {
        ArrayList<Actividade> listaDez = new ArrayList<Actividade>();
        for (int i = 0; i < 10; i++) {
            for (String key : actividades.keySet()) {
                listaDez.add((actividades.get(key)).clone());
            }
        }
        return listaDez;
    }

    /**
     * Função que devolve as últimas dez atividades de um utilizador se este
     * pertencer à lista de amigos do utlizador em questão
     */
    public ArrayList<Actividade> ultimasDezAmigo(Utilizador u) {
        if (this.amigos.contains(u)) {
            return u.ultimasDez();
        } else {
            return new ArrayList<Actividade>();
        }
    }

    /**
     * Função que verifica se as credenciais passadas como argumento pertencem a
     * este utilizador
     *
     * @param mail
     * @param pass
     * @return
     */
    public boolean verificaDados(String mail, String pass) {
        return (this.email.equals(mail) && this.password.equals(pass));
    }

    public boolean verificaMail(String mail) {
        return (this.email.equals(mail));
    }

    /**
     * Função que devolve a lista de actividades de um utilizador num
     * determinado mês
     */
    public TreeMap<String, Actividade> actividadesMes(String mes) {
        if(mes.equals("Janeiro")){
            mes = "0";
        }
        if(mes.equals("Fevereiro")){
            mes = "1";
        }if(mes.equals("Marco")){
            mes = "2";
        }if(mes.equals("Abril")){
            mes = "3";
        }if(mes.equals("Maio")){
            mes = "4";
        }if(mes.equals("Junho")){
            mes = "5";
        }if(mes.equals("Julho")){
            mes = "6";
        }if(mes.equals("Agosto")){
            mes = "7";
        }if(mes.equals("Setembro")){
            mes = "8";
        }if(mes.equals("Outubro")){
            mes = "9";
        }if(mes.equals("Novembro")){
            mes = "10";
        }if(mes.equals("Dezembro")){
            mes = "11";
        }
        TreeMap<String, Actividade> res = new TreeMap<String, Actividade>();
        if (!this.actividades.isEmpty()) {
            for (String key : actividades.keySet()) {
                if (String.valueOf(parseData(key).get(Calendar.MONTH)).equals(mes)) {
                    res.put(key, actividades.get(key).clone());
                }
            }
        }
        return res;
    }

    /**
     * Função que devolve a lista de actividades de um utilizador num
     * determinado ano
     * @param ano
     * @return 
     */
    public TreeMap<String, Actividade> actividadesAno(String ano) {
        TreeMap<String, Actividade> res = new TreeMap<>();
        if(!this.actividades.isEmpty()){
        for (String key : actividades.keySet()) {
            if (String.valueOf(parseData(key).get(Calendar.YEAR)).equals(ano)) {
                res.put(key, actividades.get(key).clone());
            }
        }
        }
        return res;
    }

    /**
     * Função que remove um Evento da lista de eventos pendentes
     */
    public boolean removePendente(Evento e) {
        if (this.eventosPendentes.get(e) != null) {
            eventosPendentes.remove(e);
            return true;
        }
        return false;
    }

    /**
     * Função que remove um Evento da lista de eventos em que está inscrito
     */
    public boolean removeInscrito(Evento e) {
        if (this.eventosInscrito.get(e) != null) {
            eventosInscrito.remove(e);
            return true;
        }
        return false;
    }

    /**
     * Função que adiciona um Evento à lista de eventos pendentes
     */
    public void adicionaPendente(Evento e) {
        this.eventosPendentes.put(e.getData(), e.clone());
    }

    /**
     * Função que adiciona um Evento à lista de eventos em que está inscrito
     */
    public void adicionaInscrito(Evento e) {
        this.eventosInscrito.put(e.getData(), e.clone());
    }

    /**
     * Função que remove uma actividade da lista de actividades do utilizador
     */
    public void remAct(Actividade a) {
        this.actividades.remove(a);
    }

    /**
     * Função que adiciona uma actividade
     */
    public void addActividade(Actividade a) {
        this.actividades.put(a.getData(), a.clone());
        if (this.records.containsKey(a.getTipo())) {
            ArrayList<Actividade> auxList = records.get(a.getTipo());
            switch (a.getTipo()) {
                case "Natação":
                    auxList.add(a);
                    Collections.sort(auxList, new ComparatorNatacao());
                    if (auxList.size() > 10) {
                        auxList.remove(auxList.get(auxList.size() - 1));
                    }
                case "Basquetebol":
                    auxList.add(a);
                    Collections.sort(auxList, new ComparatorBasquetebol());
                    if (auxList.size() > 10) {
                        auxList.remove(auxList.get(auxList.size() - 1));
                    }
                case "Caminhada":
                    auxList.add(a);
                    Collections.sort(auxList, new ComparatorCaminhada());
                    if (auxList.size() > 10) {
                        auxList.remove(auxList.get(auxList.size() - 1));
                    }
                case "Futebol":
                    auxList.add(a);
                    Collections.sort(auxList, new ComparatorFutebol());
                    if (auxList.size() > 10) {
                        auxList.remove(auxList.get(auxList.size() - 1));
                    }
                case "Voleibol":
                    auxList.add(a);
                    Collections.sort(auxList, new ComparatorVoleibol());
                    if (auxList.size() > 10) {
                        auxList.remove(auxList.get(auxList.size() - 1));
                    }
                case "Ciclismo":
                    auxList.add(a);
                    Collections.sort(auxList, new ComparatorCiclismo());
                    if (auxList.size() > 10) {
                        auxList.remove(auxList.get(auxList.size() - 1));
                    }
                case "Atletismo":
                    auxList.add(a);
                    Collections.sort(auxList, new ComparatorAtletismo());
                    if (auxList.size() > 10) {
                        auxList.remove(auxList.get(auxList.size() - 1));
                    }
                    records.put(a.getTipo(), auxList);
            }
        } else {
            ArrayList<Actividade> auxList = new ArrayList<Actividade>();
            auxList.add(a);
            records.put(a.getTipo(), auxList);
        }
    }

    /**
     * Função que adiciona um record à lista
     */
    /**
     * Função que remove um record da lista
     */
    /**
     * Função que remove um pedido de amizade da lista de pedidos
     */
    public boolean removePedido(Utilizador pedinte) {
        for (int i = 0; i < this.pedidosAmizade.size() - 1; i++) {
            if (this.pedidosAmizade.get(i) == pedinte) {
                this.pedidosAmizade.remove(pedinte);
                return true;
            }
        }
        return false;
    }

    /**
     * Função que adiciona um pedido d
     * @param pedintee amizade da lista de pedidos
     */
    public void adicionaPedido(Utilizador pedinte) {
          this.pedidosAmizade.add(pedinte);
    }

    /**
     * Função que adiciona um utilizador à lista de amigos
     */
    public void adicionaAmigo(Utilizador pedinte) {
        this.amigos.add(pedinte);
    }

    /**
     * Função que verifica se um utilizador já praticou um certo tipo de
     * actividade
     */
    public boolean praticouActividade(String tipo) {
        for (Actividade a : this.actividades.values()) {
            if (a.getTipo() == tipo) {
                return true;
            }
        }
        return false;
    }

    /**
     * Função para fazer parse de uma data
     */
    public Calendar parseData(String d) {
        DateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(formato.parse(d));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return c;
    }

    //ToString, Equals e Clone
    public String toString() {
        StringBuilder s = new StringBuilder("Utilizador: \n");
        s.append(this.nome).append("\n Data de Nascimento: ").append(this.dataNascimento).append("\n Sexo: ").append(this.genero).append("\n Altura: ").append(this.altura).append("cm \n Peso: ").append(this.peso).append("kg \n Desporto Favorito: ").append(this.desportoFavorito);
        return s.toString();
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if ((o == null || o.getClass() != this.getClass())) {
            return false;
        }
        Utilizador u = (Utilizador) o;
        return (u.getEmail() == this.email);
    }

    public Utilizador clone() {
        return new Utilizador(this.nome, this.email, this.password, this.genero, this.altura, this.peso, this.dataNascimento, this.desportoFavorito, this.amigos, this.actividades, this.records, this.eventosInscrito, this.eventosPendentes);
    }
}
