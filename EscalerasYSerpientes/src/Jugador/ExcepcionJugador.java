/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;

/**
 *
 * @author baquiax
 */
public class ExcepcionJugador extends Exception {

    /**
     * Creates a new instance of <code>ExcepcionJugador</code> without detail
     * message.
     */
    public ExcepcionJugador() {
    }

    /**
     * Constructs an instance of <code>ExcepcionJugador</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ExcepcionJugador(String msg) {
        super(msg);
    }
}
