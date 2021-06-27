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
public class CasillaFin extends Casilla implements CasillaEspecial {
    
    public CasillaFin(int fila, int columna, int id) {
        super(fila, columna, id);
    }
    
    public CasillaFin(int fila, int columna) {
        super(fila, columna);
    }
    
    public CasillaFin(int id) {
        super(id);
    }
    
    @Override
    public void accionCasilla(Jugador jugador, List<Casilla> casillas) {
        jugador.setPartidasGanadas(jugador.getPartidasGanadas() + 1);
    }
    
}
