/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalerasyserpientes;

import Jugador.Jugadores;

/**
 *
 * @author baquiax
 */
public class SistemaGeneral {

    private Jugadores jugadores;

    public SistemaGeneral(Jugadores jugadore) {
        this.jugadores = jugadore;
    }

    public SistemaGeneral() {
        jugadores = new Jugadores();
    }

    /**
     * @return the jugadores
     */
    public Jugadores getJugadores() {
        return jugadores;
    }

    /**
     * @param jugadores the jugadores to set
     */
    public void setJugadores(Jugadores jugadores) {
        this.jugadores = jugadores;
    }

}
