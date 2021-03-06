/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import escalerasyserpientes.SistemaGeneral;

/**
 *
 * @author baquiax
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    SistemaGeneral sistema;

    /**
     * Creates new form VentanaPrincipal
     * @param sistema
     */
    public VentanaPrincipal(SistemaGeneral sistema) {
        this.sistema = sistema;
        initComponents();
        super.setLocationRelativeTo(null);
        super.setResizable(false);
        super.setVisible(true);
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
        btnJugar = new javax.swing.JButton();
        btnAgregarJugador = new javax.swing.JButton();
        btnMostrarJugadores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo.png"))); // NOI18N

        btnJugar.setText("Jugar");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        btnAgregarJugador.setText("Agregar Jugador");
        btnAgregarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarJugadorActionPerformed(evt);
            }
        });

        btnMostrarJugadores.setText("Mostrar Jugadores");
        btnMostrarJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarJugadoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnJugar, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(btnAgregarJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMostrarJugadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(btnJugar)
                .addGap(12, 12, 12)
                .addComponent(btnAgregarJugador)
                .addGap(18, 18, 18)
                .addComponent(btnMostrarJugadores)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        // TODO add your handling code here:
        VentaInicioPartida ventana = new VentaInicioPartida(this, sistema);
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnAgregarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarJugadorActionPerformed
        // TODO add your handling code here:
        AgregarJugador ventana = new AgregarJugador(this, sistema.getJugadores());
    }//GEN-LAST:event_btnAgregarJugadorActionPerformed

    private void btnMostrarJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarJugadoresActionPerformed
        // TODO add your handling code here:
        MostrarJugadores ventana = new MostrarJugadores(this, sistema.getJugadores());
    }//GEN-LAST:event_btnMostrarJugadoresActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarJugador;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnMostrarJugadores;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
