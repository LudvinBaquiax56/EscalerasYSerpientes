/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import Casilla.Casilla;
import Jugador.Jugador;
import java.util.List;

/**
 *
 * @author baquiax
 */
public class JuegoEscalerasYSerpientes {

    private List<Jugador> jugadores;
    private Casilla[][] casillas;
    private List<Casilla> listaCasillas;

    /**
     * Crea un juego de escaleras y serpientes
     *
     * @param jugadores
     * @param casillas
     * @param listaCasillas
     */
    public JuegoEscalerasYSerpientes(List<Jugador> jugadores, Casilla[][] casillas, List<Casilla> listaCasillas) {
        this.jugadores = jugadores;
        this.casillas = casillas;
        this.listaCasillas = listaCasillas;
        sumarPartidaJugada();
        colacarJugadoresEnElInicio();
    }

    /**
     * @return the jugadores
     */
    public List<Jugador> getJugadores() {
        return jugadores;
    }

    /**
     * @param jugadores the jugadores to set
     */
    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    /**
     * @return the casillas
     */
    public Casilla[][] getCasillas() {
        return casillas;
    }

    /**
     * @param casillas the casillas to set
     */
    public void setCasillas(Casilla[][] casillas) {
        this.casillas = casillas;
    }

    /**
     * @return the listaCasillas
     */
    public List<Casilla> getListaCasillas() {
        return listaCasillas;
    }

    /**
     * @param listaCasillas the listaCasillas to set
     */
    public void setListaCasillas(List<Casilla> listaCasillas) {
        this.listaCasillas = listaCasillas;
    }

    /**
     * Otorga una partida jugada a todos los jugadores de una partida
     */
    public void sumarPartidaJugada() {
        for (int i = 0; i < jugadores.size(); i++) {
            jugadores.get(i).setPartidasJugadas(jugadores.get(i).getPartidasJugadas() + 1);
        }
    }

    /**
     * Ubica a los jugadores en la casilla inicial
     */
    public void colacarJugadoresEnElInicio() {
        for (int i = 0; i < jugadores.size(); i++) {
            jugadores.get(i).setPosicion(0);
        }
    }

    /**
     * Le suma un victoria a un jugaador
     *
     * @param ganador
     */
    public void declararGandor(Jugador ganador) {
        ganador.setPartidasGanadas(ganador.getPartidasGanadas() + 1);
    }

}
