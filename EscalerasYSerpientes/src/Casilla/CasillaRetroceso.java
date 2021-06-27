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
public class CasillaRetroceso extends Casilla implements CasillaEspecial {

    int posicionesParaRetroceder;

    /**
     * Crea una casilla, en la que si un jugador cae retrocede N posiciones;
     *
     * @param posicionesParaRetroceder
     * @param fila
     * @param columna
     * @param id
     */
    public CasillaRetroceso(int posicionesParaRetroceder, int fila, int columna, int id) {
        super(fila, columna, id);
        this.posicionesParaRetroceder = posicionesParaRetroceder;
    }

    public CasillaRetroceso(int posicionesParaRetroceder, int fila, int columna) {
        super(fila, columna);
        this.posicionesParaRetroceder = posicionesParaRetroceder;
    }

    public CasillaRetroceso(int posicionesParaRetroceder, int id) {
        super(id);
        this.posicionesParaRetroceder = posicionesParaRetroceder;
    }

    @Override
    public void accionCasilla(Jugador jugador, List<Casilla> casillas) {
        jugador.setPosicion(jugador.getPosicion() - posicionesParaRetroceder);
    }

}
