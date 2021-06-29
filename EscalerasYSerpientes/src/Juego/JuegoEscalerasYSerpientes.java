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

    public JuegoEscalerasYSerpientes(List<Jugador> jugadores, Casilla[][] casillas, List<Casilla> listaCasillas) {
        this.jugadores = jugadores;
        this.casillas = casillas;
        this.listaCasillas = listaCasillas;
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

    public void sumarPartidaJugada() {
        for (int i = 0; i < jugadores.size(); i++) {
            jugadores.get(i).setPartidasJugadas(jugadores.get(i).getPartidasJugadas() + 1);
        }
    }

    public void colacarJugadoresEnElInicio() {
        for (int i = 0; i < jugadores.size(); i++) {
            jugadores.get(i).setPosicion(0);
        }
    }

}
