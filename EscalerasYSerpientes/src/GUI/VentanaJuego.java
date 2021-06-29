/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Dado.Dado;
import GUI.pnlCasilla.PanelCasilla;
import static GUI.pnlCasilla.PanelCasilla.ALTO;
import static GUI.pnlCasilla.PanelCasilla.ANCHO;
import Juego.JuegoEscalerasYSerpientes;
import Jugador.Jugador;
import WindowsListener.IrAlMenu;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author baquiax
 */
public class VentanaJuego extends javax.swing.JFrame {

    VentanaPrincipal menu;
    JuegoEscalerasYSerpientes juego;
    List<PanelCasilla> panelesCasilla;
    Dado dadito;
    Jugador jugadorEnTurno;
    int indiceJugadorEnTurno;
    int random;

    /**
     * Creates new form VentanaJuego
     *
     * @param menu
     * @param juego
     */
    public VentanaJuego(VentanaPrincipal menu, JuegoEscalerasYSerpientes juego) {
        initComponents();
        this.menu = menu;
        this.juego = juego;
        dadito = new Dado();
        iniciarPanelesCasilla();

        IrAlMenu irAlMenu = new IrAlMenu(this.menu, this);
        super.addWindowListener(irAlMenu);

        iniciarImagenDado();

        super.setResizable(false);
        super.setLocationRelativeTo(null);
        super.setVisible(true);
        iniciarJuego();
        //jugar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDado = new javax.swing.JPanel();
        lblImagenDado = new javax.swing.JLabel();
        lblValorDado = new javax.swing.JLabel();
        lblJugadorEnTurno = new javax.swing.JLabel();
        btnDener = new javax.swing.JButton();
        btnLanzar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Escaleras y Serpientes");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pnlDado.setBackground(new java.awt.Color(157, 254, 254));

        lblImagenDado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dado/random.gif"))); // NOI18N

        lblValorDado.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        lblValorDado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorDado.setText("0");

        lblJugadorEnTurno.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        lblJugadorEnTurno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJugadorEnTurno.setText("Jugador");

        btnDener.setText("Detener");
        btnDener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDenerActionPerformed(evt);
            }
        });

        btnLanzar.setText("Lanzar");
        btnLanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanzarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDadoLayout = new javax.swing.GroupLayout(pnlDado);
        pnlDado.setLayout(pnlDadoLayout);
        pnlDadoLayout.setHorizontalGroup(
            pnlDadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDener, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlDadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblJugadorEnTurno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblImagenDado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnLanzar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblValorDado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlDadoLayout.setVerticalGroup(
            pnlDadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblJugadorEnTurno)
                .addGap(12, 12, 12)
                .addComponent(lblImagenDado)
                .addGap(12, 12, 12)
                .addComponent(lblValorDado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLanzar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDener)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(1211, Short.MAX_VALUE)
                .addComponent(pnlDado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(426, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanzarActionPerformed
        // TODO add your handling code here:
        lblImagenDado.setIcon(dadito.obtenerGifRandom());
        lblImagenDado.repaint();

        btnLanzar.setEnabled(false);
        btnDener.setEnabled(true);
    }//GEN-LAST:event_btnLanzarActionPerformed

    private void btnDenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDenerActionPerformed
        // TODO add your handling code here:
        lanzarDadoJugadorEnTurno();
    }//GEN-LAST:event_btnDenerActionPerformed

    private void iniciarPanelesCasilla() {
        panelesCasilla = new ArrayList<>();
        for (int i = 0; i < juego.getListaCasillas().size(); i++) {
            PanelCasilla aux = new PanelCasilla(juego.getListaCasillas().get(i));
            aux.setVisible(true);
            aux.setBounds(juego.getListaCasillas().get(i).getColumna() * ANCHO,
                    juego.getListaCasillas().get(i).getFila() * ALTO, ANCHO, ALTO);
            aux.repaint();
            super.add(aux);
            panelesCasilla.add(aux);
        }
        for (int i = 0; i < juego.getJugadores().size(); i++) {
            mostrarFichaJugador((i + 1), juego.getJugadores().get(i));
        }
        this.repaint();
        this.revalidate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDener;
    private javax.swing.JButton btnLanzar;
    private javax.swing.JLabel lblImagenDado;
    private javax.swing.JLabel lblJugadorEnTurno;
    private javax.swing.JLabel lblValorDado;
    private javax.swing.JPanel pnlDado;
    // End of variables declaration//GEN-END:variables

    private void iniciarImagenDado() {
        int random = dadito.tirarDado();
        lblImagenDado.setIcon(dadito.obtenerImagen(random));
        lblImagenDado.repaint();
    }

    public void mostrarFichaJugador(int indiceJugador, Jugador jugador) {
        panelesCasilla.get(jugador.getPosicion()).mostrarFichaJugador(indiceJugador, jugador);
    }

    public boolean verificarGanador(Jugador jugador) {
        return jugador.getPosicion() >= juego.getListaCasillas().size() - 1;
    }

    private void lanzarDadoJugadorEnTurno() {
        panelesCasilla.get(jugadorEnTurno.getPosicion()).ocultarFichaJugador(indiceJugadorEnTurno);
        panelesCasilla.get(jugadorEnTurno.getPosicion()).repaint();

        random = dadito.tirarDado();

        lblImagenDado.setIcon(dadito.obtenerImagen(random));
        lblImagenDado.repaint();
        lblValorDado.setText(String.valueOf(random));

        btnLanzar.setEnabled(true);
        btnDener.setEnabled(false);

        jugadorEnTurno.setPosicion(jugadorEnTurno.getPosicion() + random);
        if (!verificarGanador(jugadorEnTurno)) {
            panelesCasilla.get(jugadorEnTurno.getPosicion()).mostrarFichaJugador(
                    indiceJugadorEnTurno, jugadorEnTurno);
        }

        if (verificarGanador(jugadorEnTurno)) {
            JOptionPane.showMessageDialog(null, "Feliciades ganaste "
                    + jugadorEnTurno.getNombre(), "Ganador " + jugadorEnTurno.getNombre(), INFORMATION_MESSAGE);
            jugadorEnTurno.setPartidasGanadas(jugadorEnTurno.getPartidasGanadas() + 1);
            declararPerdedores();
            btnLanzar.setEnabled(false);
            btnDener.setEnabled(false);
        } else {
            jugadorEnTurno = siguienteJugadorEnturno();
        }
    }

    private void iniciarJuego() {
        jugadorEnTurno = juego.getJugadores().get(0);
        indiceJugadorEnTurno = 1;
        lblJugadorEnTurno.setText(jugadorEnTurno.getNombre());
        lblJugadorEnTurno.repaint();
    }

    private Jugador siguienteJugadorEnturno() {
        Jugador aux = null;
        if (indiceJugadorEnTurno == juego.getJugadores().size()) {
            indiceJugadorEnTurno = 1;
            aux = juego.getJugadores().get(indiceJugadorEnTurno - 1);
        } else {
            aux = juego.getJugadores().get(indiceJugadorEnTurno);
            indiceJugadorEnTurno++;
        }
        lblJugadorEnTurno.setText(aux.getNombre());
        lblJugadorEnTurno.repaint();
        lblJugadorEnTurno.revalidate();
        return aux;
    }

    private void declararPerdedores() {
        for (int i = 0; i < juego.getJugadores().size(); i++) {
            if (juego.getJugadores().get(i) != jugadorEnTurno) {
                juego.getJugadores().get(i).setPartidasPerdidas(
                        juego.getJugadores().get(i).getPartidasPerdidas() + 1);
            }
        }
    }

}
