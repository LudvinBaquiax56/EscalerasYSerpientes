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
public class CasillaEscalera extends Casilla implements CasillaEspecial {

    private int filaSubir;
    private int columnaSubir;
    private int idCasillaSubir;

    /**
     * Crea un casilla Escalera para que un jugador avance a una casilla en
     * especifico
     *
     * @param filaSubir
     * @param columnaSubir
     * @param idCasillaSubir
     * @param fila
     * @param columna
     * @param id
     */
    public CasillaEscalera(int filaSubir, int columnaSubir, int idCasillaSubir, int fila, int columna, int id) {
        super(fila, columna, id);
        this.filaSubir = filaSubir;
        this.columnaSubir = columnaSubir;
        this.idCasillaSubir = idCasillaSubir;
    }

    /**
     * Crea un casilla Escalera para que un jugador avance a una casilla en
     * especifico
     *
     * @param filaSubir
     * @param columnaSubir
     * @param idCasillaSubir
     * @param fila
     * @param columna
     */
    public CasillaEscalera(int filaSubir, int columnaSubir, int idCasillaSubir, int fila, int columna) {
        super(fila, columna);
        this.filaSubir = filaSubir;
        this.columnaSubir = columnaSubir;
        this.idCasillaSubir = idCasillaSubir;
    }

    /**
     * Crea un casilla Escalera para que un jugador avance a una casilla en
     * especifico
     *
     * @param filaSubir 
     * @param columnaSubir
     * @param idCasillaSubir
     * @param id
     */
    public CasillaEscalera(int filaSubir, int columnaSubir, int idCasillaSubir, int id) {
        super(id);
        this.filaSubir = filaSubir;
        this.columnaSubir = columnaSubir;
        this.idCasillaSubir = idCasillaSubir;
    }

    /**
     * Suma al jugador las casillas para subir las escaleras
     *
     * @param jugador
     * @param casillas
     */
    @Override
    public void accionCasilla(Jugador jugador, List<Casilla> casillas) {
        int casillasASubir = super.getId() - getIdCasillaSubir();
        jugador.setPosicion(jugador.getPosicion() + casillasASubir);
    }

    /**
     * @return the filaSubir
     */
    public int getFilaSubir() {
        return filaSubir;
    }

    /**
     * @param filaSubir the filaSubir to set
     */
    public void setFilaSubir(int filaSubir) {
        this.filaSubir = filaSubir;
    }

    /**
     * @return the columnaSubir
     */
    public int getColumnaSubir() {
        return columnaSubir;
    }

    /**
     * @param columnaSubir the columnaSubir to set
     */
    public void setColumnaSubir(int columnaSubir) {
        this.columnaSubir = columnaSubir;
    }

    /**
     * @return the idCasillaSubir
     */
    public int getIdCasillaSubir() {
        return idCasillaSubir;
    }

    /**
     * @param idCasillaSubir the idCasillaSubir to set
     */
    public void setIdCasillaSubir(int idCasillaSubir) {
        this.idCasillaSubir = idCasillaSubir;
    }

}
