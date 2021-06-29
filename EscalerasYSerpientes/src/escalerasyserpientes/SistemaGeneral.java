/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalerasyserpientes;

import Jugador.Jugador;
import Jugador.Jugadores;

/**
 *
 * @author baquiax
 */
public class SistemaGeneral {

    private Jugadores jugadores;

    public SistemaGeneral(Jugadores jugadores) {
        this.jugadores = jugadores;
    }

    public SistemaGeneral() {
        jugadores = new Jugadores();
        llenarDatos();
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

    public void llenarDatos() {
        jugadores.agregarJugador(new Jugador(4, "Ludvin", "Baquiax", 5, 3, 2, true));
        jugadores.agregarJugador(new Jugador(5, "Oliver", "Lopez", 10, 3, 7, true));
        jugadores.agregarJugador(new Jugador(2, "Pedro", "Gonzalez", 12, 10, 2, true));
        jugadores.agregarJugador(new Jugador(1, "Yahiri", "Ruiz", 5, 1, 4, true));
        jugadores.agregarJugador(new Jugador(8, "Claudia", "Perez", 5, 4, 1, true));
    }

}
