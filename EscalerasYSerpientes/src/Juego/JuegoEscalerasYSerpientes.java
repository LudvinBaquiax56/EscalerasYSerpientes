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

    List<Jugador> jugadores;
    Casilla[][] casillas;
    List<Casilla> listaCasillas;

    public JuegoEscalerasYSerpientes(List<Jugador> jugadores, Casilla[][] casillas, List<Casilla> listaCasillas) {
        this.jugadores = jugadores;
        this.casillas = casillas;
        this.listaCasillas = listaCasillas;
    }

}
