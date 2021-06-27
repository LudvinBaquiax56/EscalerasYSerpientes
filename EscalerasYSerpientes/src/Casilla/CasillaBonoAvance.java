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
public class CasillaBonoAvance extends Casilla implements CasillaEspecial {

    private int posicionesParaAvanzar;

    /**
     * Crea una casilla, en la que si un jugador cae avanza N posiciones
     *
     * @param posicionesParaAvanzar
     * @param fila
     * @param columna
     * @param id
     */
    public CasillaBonoAvance(int posicionesParaAvanzar, int fila, int columna, int id) {
        super(fila, columna, id);
        this.posicionesParaAvanzar = posicionesParaAvanzar;
    }

    /**
     * Crea una casilla, en la que si un jugador cae avanza N posiciones
     *
     * @param posicionesParaAvanzar
     * @param fila
     * @param columna
     */
    public CasillaBonoAvance(int posicionesParaAvanzar, int fila, int columna) {
        super(fila, columna);
        this.posicionesParaAvanzar = posicionesParaAvanzar;
    }

    /**
     * Crea una casilla, en la que si un jugador cae avanza N posiciones
     *
     * @param posicionesParaAvanzar
     * @param id
     */
    public CasillaBonoAvance(int posicionesParaAvanzar, int id) {
        super(id);
        this.posicionesParaAvanzar = posicionesParaAvanzar;
    }

    /**
     * Avanza al jugador N casillas
     *
     * @param jugador
     * @param casillas
     */
    @Override
    public void accionCasilla(Jugador jugador, List<Casilla> casillas) {
        jugador.setPosicion(jugador.getPosicion() + posicionesParaAvanzar);
    }

    /**
     * @return the posicionesParaAvanzar
     */
    public int getPosicionesParaAvanzar() {
        return posicionesParaAvanzar;
    }

    /**
     * @param posicionesParaAvanzar the posicionesParaAvanzar to set
     */
    public void setPosicionesParaAvanzar(int posicionesParaAvanzar) {
        this.posicionesParaAvanzar = posicionesParaAvanzar;
    }

}
