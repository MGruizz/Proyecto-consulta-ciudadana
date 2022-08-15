/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ManejoDeColecciones;
import Modelo.ArrayListConsultas;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;

/**
 * Clase VentanaAgregarRespuestaMultiple:
 * Interfaz grafica la cual se ocupa para agregar una consulta multiple.
 */
public class VentanaAgregarRespuestaMultiple extends javax.swing.JFrame {

    private ManejoDeColecciones manejo;
    private JFrame menuPrincipal;

    /**
     * Creates new form VentanaAgregarRespuestaM
     */
    public VentanaAgregarRespuestaMultiple(ManejoDeColecciones manejo, JFrame menuPrincipal) {
        initComponents();
        this.manejo=manejo;
        this.menuPrincipal= menuPrincipal;
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        boxTemas = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        boxID = new javax.swing.JComboBox();
        botonMenuPrincipal = new javax.swing.JButton();
        botonOK = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        boxVoto = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Agregar Respuesta:");

        jLabel2.setText("Ingrese tema:");

        boxTemas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxTemasItemStateChanged(evt);
            }
        });
        boxTemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTemasActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingrese ID:");

        boxID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxIDActionPerformed(evt);
            }
        });

        botonMenuPrincipal.setText("Volver a menu");
        botonMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuPrincipalActionPerformed(evt);
            }
        });

        botonOK.setText("OK");
        botonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOKActionPerformed(evt);
            }
        });

        jLabel4.setText("Ingrese Voto:");

        boxVoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxVotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(botonMenuPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxVoto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxTemas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(boxTemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxVoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonMenuPrincipal)
                    .addComponent(botonOK))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxTemasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxTemasItemStateChanged
        String tema = (String)(boxTemas.getSelectedItem());
        mostrarIds(tema);
    }//GEN-LAST:event_boxTemasItemStateChanged

    private void boxTemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTemasActionPerformed

    }//GEN-LAST:event_boxTemasActionPerformed

    private void boxIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxIDActionPerformed

    }//GEN-LAST:event_boxIDActionPerformed

    private void botonMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuPrincipalActionPerformed
        this.setVisible(false);
        this.menuPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonMenuPrincipalActionPerformed

    private void botonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOKActionPerformed

        switch ((String)(boxVoto.getSelectedItem())){
            case "Muy a favor":
                manejo.agregarRespuesta((String)boxTemas.getSelectedItem(),(String)boxID.getSelectedItem(), 5);  
                break;
            
            case "A favor":
                manejo.agregarRespuesta((String)boxTemas.getSelectedItem(),(String)boxID.getSelectedItem(), 4);  
                break;
            
            case "Neutro":
                manejo.agregarRespuesta((String)boxTemas.getSelectedItem(),(String)boxID.getSelectedItem(), 3);  
                break;
                
            case "Desacuerdo":
                manejo.agregarRespuesta((String)boxTemas.getSelectedItem(),(String)boxID.getSelectedItem(), 2);  
                break;
                
            case "Muy en desacuerdo":
                manejo.agregarRespuesta((String)boxTemas.getSelectedItem(),(String)boxID.getSelectedItem(), 1);  
                break;
        }
        this.setVisible(false);
        this.menuPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonOKActionPerformed

    private void boxVotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxVotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxVotoActionPerformed
    
    public void mostrarTemas(){
        HashMap<String,ArrayListConsultas> auxMapa = manejo.getConsultasMultiples();
        for(Map.Entry<String,ArrayListConsultas> set: auxMapa.entrySet()){
            if(this.manejo.getArrayCopia(set.getKey()).sizeConsultas() != 0)
                boxTemas.addItem(set.getKey());
        }
    }
    
    public void mostrarIds(String tema){
        ArrayListConsultas arrayListdeIDs = manejo.getConsultasMultiplesPorTema(tema);
        boxID.removeAllItems();
        for (int i = 0; i < arrayListdeIDs.sizeConsultas(); i++) {
            boxID.addItem(Integer.toString(arrayListdeIDs.getConsulta(i).getIdConsulta()));
        }
    }
    
    public void mostrarVotos(){
        boxVoto.addItem("Muy a favor");
        boxVoto.addItem("A favor");
        boxVoto.addItem("Neutro");
        boxVoto.addItem("Desacuerdo");
        boxVoto.addItem("Muy en desacuerdo");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonMenuPrincipal;
    private javax.swing.JButton botonOK;
    private javax.swing.JComboBox boxID;
    private javax.swing.JComboBox boxTemas;
    private javax.swing.JComboBox<String> boxVoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
