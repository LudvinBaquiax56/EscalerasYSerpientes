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
public class CasillaInicio extends Casilla implements CasillaEspecial {

    private static final int ID_CASILLA = 1;


    public CasillaInicio(int fila, int columna) {
        super(fila, columna,ID_CASILLA);
    }

    public CasillaInicio() {
        super(ID_CASILLA);
    }

    @Override
    public void accionCasilla(Jugador jugador, List<Casilla> casillas) {
        System.out.println("Bienvenido " + jugador.getNombre() + " ve a por todas");
        //To change body of generated methods, choose Tools | Templates.
    }

}
