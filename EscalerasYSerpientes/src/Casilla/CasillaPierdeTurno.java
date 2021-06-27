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
public class CasillaPierdeTurno extends Casilla implements CasillaEspecial {

    /**
     * Casilla especial en la que si un jugador cae en esta pierde el siguiente
     * turno
     *
     * @param fila
     * @param columna
     * @param id
     */
    public CasillaPierdeTurno(int fila, int columna, int id) {
        super(fila, columna, id);
    }

    /**
     * Casilla especial en la que si un jugador cae en esta pierde el siguiente
     * turno
     *
     * @param fila
     * @param columna
     */
    public CasillaPierdeTurno(int fila, int columna) {
        super(fila, columna);
    }

    /**
     * Casilla especial en la que si un jugador cae en esta pierde el siguiente
     * turno
     *
     * @param id
     */
    public CasillaPierdeTurno(int id) {
        super(id);
    }

    /**
     * Hace que el jugador pierda el turno para el siguiente turno
     *
     * @param jugador
     * @param casillas
     */
    @Override
    public void accionCasilla(Jugador jugador, List<Casilla> casillas) {
        jugador.setConTurno(false);
    }

}
