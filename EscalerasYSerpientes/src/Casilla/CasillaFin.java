/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casilla;

import Jugador.Jugador;
import java.util.List;

/**
 *
 * @author baquiax
 */
public class CasillaFin extends Casilla implements CasillaEspecial {

    /**
     * Casilla final, si un jugador llega a esta casilla finaliza el juego
     *
     * @param fila
     * @param columna
     * @param id
     */
    public CasillaFin(int fila, int columna, int id) {
        super(fila, columna, id);
    }

    /**
     * Casilla final, si un jugador llega a esta casilla finaliza el juego
     *
     * @param fila
     * @param columna
     */
    public CasillaFin(int fila, int columna) {
        super(fila, columna);
    }

    /**
     * Casilla final, si un jugador llega a esta casilla finaliza el juego
     *
     * @param id
     */
    public CasillaFin(int id) {
        super(id);
    }

    /**
     * Suma una vitoria al jugador que llegue a esta casilla, sin embargo no
     * finzaliza el juego
     *
     * @param jugador
     * @param casillas
     */
    @Override
    public void accionCasilla(Jugador jugador, List<Casilla> casillas) {
        jugador.setPartidasGanadas(jugador.getPartidasGanadas() + 1);
    }

}
