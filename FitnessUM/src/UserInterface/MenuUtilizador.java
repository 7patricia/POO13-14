/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.Actividade;
import org.FitnessUM;
import org.Utilizador;

/**
 *
 * @author teste
 */
public class MenuUtilizador extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtilizador
     */
    FitnessUM fitnessUM;

    public MenuUtilizador(final FitnessUM fitnessUM) {
        this.fitnessUM = fitnessUM;
        initComponents();
        allClear();

        jLabel2.setText(this.fitnessUM.getUtilizadorLigado().getNome());
        if (!this.fitnessUM.getUtilizadorLigado().getPedidosAmizade().isEmpty()) {
            jLabel3.setVisible(true);
            jButton1.setVisible(true);
        }
           jList1.addListSelectionListener(new ListSelectionListener() {

                @Override
                public void valueChanged(ListSelectionEvent e) {
                    if(jTextField1.isVisible() && jList1.getSelectedValue()!=null){
                        jButton7.setVisible(true);               
                    }
                    if(jButton1.isVisible()){
                        jButton8.setVisible(true);
                        jButton9.setVisible(true);
                    }
                    else{
                        jButton10.setVisible(true);
                    }
                }
            });
        jComboBox2.addItem("2014");
        jComboBox2.addItem("2013");
        jComboBox2.addItem("2012");
        jComboBox2.addItem("2011");
        jComboBox2.addItem("2010");
        jComboBox3.addItem("Janeiro");
        jComboBox3.addItem("Fevereiro");
        jComboBox3.addItem("Marco");
        jComboBox3.addItem("Abril");
        jComboBox3.addItem("Maio");
        jComboBox3.addItem("Junho");
        jComboBox3.addItem("Julho");
        jComboBox3.addItem("Agosto");
        jComboBox3.addItem("Setembro");
        jComboBox3.addItem("Outubro");
        jComboBox3.addItem("Novembro");
        jComboBox3.addItem("Dezembro");
        jComboBox5.addItem("Natacao");
        jComboBox5.addItem("Caminhada");
        jComboBox5.addItem("Futebol");
        jComboBox5.addItem("Basquetebol");
        jComboBox5.addItem("Voleibol");
        jComboBox5.addItem("Ciclismo");
        jComboBox5.addItem("Atletismo");
        jComboBox2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Utilizador u = fitnessUM.getUtilizadorLigado();
                String s = jComboBox2.getSelectedItem().toString();
                TreeMap<String, Actividade> actividadesPorAno = new TreeMap<>(u.actividadesAno(s));
                if (actividadesPorAno.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nao ha Actividades para esse ano");
                } else {
                    updateListView(actividadesPorAno);
                }

            }
        });
        jComboBox3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Utilizador u = fitnessUM.getUtilizadorLigado();
                String s = jComboBox3.getSelectedItem().toString();
                TreeMap<String, Actividade> actividadesPorMes = new TreeMap<>(u.actividadesMes(s));
                if (actividadesPorMes.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nao ha Actividades para esse Mes");
                } else {
                    updateListView(actividadesPorMes);
                }
            }
        });
        jComboBox5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Nao Suportado :(");
            }
        });

    }

    private void updateListView(TreeMap<String, Actividade> listaActividade) {
        List<String> aux1 = new ArrayList<>();
        List<List<String>> aux = new ArrayList<>();
        for (String s : listaActividade.keySet()) {
            Actividade a = listaActividade.get(s);
            aux1.add(a.toString());
            aux.add(aux1);
        }
        jList1.setListData(aux.toArray());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("FitnessUM");

        jLabel2.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
        jLabel2.setText("jLabel2");

        jToggleButton1.setText("Dados");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jButton1.setText("Pedidos Amizade");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Amigos");
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Adicionar Actividade");
        jButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("Eventos");
        jButton5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton5ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        jButton4.setText("Lista Actividades");
        jButton4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("Adicionar Amigo");
        jButton6.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton6ActionPerformed(evt);
            }
        });

        jComboBox1.setMaximumSize(new java.awt.Dimension(32767, 27));

        jLabel3.setText("Tem Pedidos Novos");

        jComboBox5.setName("cb_desporto"); // NOI18N
        jComboBox5.setPreferredSize(new java.awt.Dimension(127, 23));
        jComboBox5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBox5ActionPerformed(evt);
            }
        });

        jButton7.setText("Adicionar");
        jButton7.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Aceitar");
        jButton8.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Recusar");
        jButton9.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Ver Perfil");
        jButton10.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Procurar");
        jButton11.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Sair");
        jButton12.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(92, 92, 92))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton10))
                            .addComponent(jButton7))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8)
                            .addComponent(jButton9)
                            .addComponent(jButton10))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(24, 24, 24)
                        .addComponent(jButton6)
                        .addGap(24, 24, 24)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton12)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        allClear();
        new DadosUtilizador(this.fitnessUM,this.fitnessUM.getUtilizadorLigado()).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        allClear();
        new AddActividade(this.fitnessUM).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ArrayList<Utilizador> pedidosAmizade = this.fitnessUM.getUtilizadorLigado().getPedidosAmizade();
        if (!pedidosAmizade.isEmpty()) {
            List<ArrayList<String>> aux = new ArrayList<>();
            int i;
            for (Utilizador u : pedidosAmizade) {
                ArrayList<String> aux1 = new ArrayList<>();
                aux1.add(u.getEmail());
                aux1.add(u.getNome());
                aux.add(aux1);
            }
            jList1.setListData(aux.toArray());
    }//GEN-LAST:event_jButton1ActionPerformed
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        //new AddAmigo(this.fitnessUM).setVisible(true);
        allClear();
        jTextField1.setVisible(true);
        jButton11.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void allClear() {
        jTextField1.setVisible(false);
        jButton11.setVisible(false);
        jLabel3.setVisible(false);
        jButton1.setVisible(false);
        jComboBox1.setVisible(false);
        jComboBox2.setVisible(false);
        jComboBox3.setVisible(false);
        jComboBox5.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(false);
    }


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        allClear();
        List<ArrayList<String>> aux = new ArrayList<>();
        jList1.setListData(aux.toArray());
        List<Utilizador> amigos = this.fitnessUM.getUtilizadorLigado().getAmigos();
        for(Utilizador u : amigos){
                ArrayList<String> aux1 = new ArrayList<>();
                aux1.add(u.getEmail());
                aux1.add(u.getNome());
                aux.add(aux1);
            }
            jList1.setListData(aux.toArray());
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        allClear();
        jComboBox1.addItem("Ano");
        jComboBox1.addItem("Mes");
        jComboBox1.addItem("Tipo");
        jComboBox1.setVisible(true);
        jComboBox1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String s = jComboBox1.getSelectedItem().toString();
                if (s.equals("Ano")) {
                    jComboBox2.setVisible(true);
                    jComboBox3.setVisible(false);
                    jComboBox5.setVisible(false);
                }
                if (s.equals("Mes")) {
                    jComboBox2.setVisible(false);
                    jComboBox3.setVisible(true);
                    jComboBox5.setVisible(false);
                }
                if (s.equals("Tipo")) {
                    jComboBox2.setVisible(false);
                    jComboBox3.setVisible(false);
                    jComboBox5.setVisible(true);
                }

            }
        });
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        int i = 0;
        String s = jList1.getSelectedValue().toString();
        if(!s.isEmpty()){
          String s1 = s.split(",")[0].replace("[", "");
          for(Utilizador u : fitnessUM.getRegistos()){
              if(u.getEmail().equals(s1)){
                  if(u.getPedidosAmizade().contains(fitnessUM.getUtilizadorLigado())){
                    JOptionPane.showMessageDialog(null, "Já fez um pedido a este utilizador");  
                  }
                  if(u.getAmigos().contains(fitnessUM.getUtilizadorLigado())){
                    JOptionPane.showMessageDialog(null, "Já são amigos");  
                  }
                  else{
                     u.adicionaPedido(fitnessUM.getUtilizadorLigado());
                     JOptionPane.showMessageDialog(null, "Pedido Feito");  
                  }
                  i++;
              }
          }
        }
        else{
          JOptionPane.showMessageDialog(null, "Selecione um Utilizador Valido");  
        } 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        String nomeUtilizador = jTextField1.getText();
        ArrayList<List<String>> aux = new ArrayList<>();
        for (Utilizador u : fitnessUM.getRegistos()) {
            List<String> aux1 = new ArrayList<>();
            if (u.getEmail().contains(nomeUtilizador) || u.getNome().contains(nomeUtilizador)) {
                aux1.add(u.getEmail());
                aux1.add(u.getNome());
                aux.add(aux1);
            }
        }
        if (aux.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nao ha Actividades para esse Mes");
        } else {
            jList1.setListData(aux.toArray());
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        allClear();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        String s = jList1.getSelectedValue().toString();
        if(!s.isEmpty()){
          String s1 = s.split(",")[0].replace("[", "");
          System.out.println("huuuuum");
          System.out.println(s1);
          for(Utilizador u : fitnessUM.getRegistos()){
              if(u.getEmail().equals(s1)){
                  System.out.println("hum");
                  fitnessUM.getUtilizadorLigado().adicionaAmigo(u);
                  fitnessUM.getUtilizadorLigado().removePedido(u);
                  u.adicionaAmigo(fitnessUM.getUtilizadorLigado());
                  JOptionPane.showMessageDialog(null, "Amigo Adicionado");  
              }
          }
        }
        else{
          JOptionPane.showMessageDialog(null, "Selecione um Utilizador Valido");  
        }         
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
         String s = jList1.getSelectedValue().toString();
        if(!s.isEmpty()){
          String s1 = s.split(",")[0].replace("[", "");
          for(Utilizador u : fitnessUM.getRegistos()){
              if(u.getEmail().equals(s1)){
                  fitnessUM.getUtilizadorLigado().removePedido(u);         
              }
          }
        }
        else{
          JOptionPane.showMessageDialog(null, "Selecione um Utilizador Valido");  
        } 
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        try {
            // TODO add your handling code here:
            this.setVisible(false);
            fitnessUM.setUtilizadorLigado(null);
            new MainMenu(fitnessUM).setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(MenuUtilizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        String s = jList1.getSelectedValue().toString();
        if(!s.isEmpty()){
          String s1 = s.split(",")[0].replace("[", "");
          for(Utilizador u : fitnessUM.getRegistos()){
              if(u.getEmail().equals(s1)){
                  this.setVisible(false); 
                  new DadosUtilizador(this.fitnessUM,u).setVisible(true);
              }
          }
        }
        else{
          JOptionPane.showMessageDialog(null, "Selecione um Utilizador Valido");  
        } 
        
       
    }//GEN-LAST:event_jButton10ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
