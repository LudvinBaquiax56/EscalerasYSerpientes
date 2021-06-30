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
public class CasillaBonoDados extends Casilla implements CasillaEspecial {

    /**
     * Casilla con un bono para lanzar el dado en el mismo turno
     *
     * @param fila
     * @param columna
     * @param id
     */
    public CasillaBonoDados(int fila, int columna, int id) {
        super(fila, columna, id);
        super.setColor(TIRAR_DADOS);
    }

    /**
     *
     * Casilla con un bono para lanzar el dado en el mismo turno
     *
     * @param fila
     * @param columna
     */
    public CasillaBonoDados(int fila, int columna) {
        super(fila, columna);
        super.setColor(TIRAR_DADOS);
    }

    /**
     * Casilla con un bono para lanzar el dado en el mismo turno
     *
     * @param id
     */
    public CasillaBonoDados(int id) {
        super(id);
        super.setColor(TIRAR_DADOS);
    }

    /**
     * Permite al jugador lanzar nuevamente el lado en el mismo turno
     *
     * @param jugador
     * @param casillas
     */
    @Override
    public void accionCasilla(Jugador jugador, List<Casilla> casillas) {
        //System.out.println("Ganaste otro turno");
    }

}
