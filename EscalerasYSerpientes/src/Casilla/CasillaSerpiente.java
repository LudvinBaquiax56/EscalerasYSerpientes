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
public class CasillaSerpiente extends Casilla implements CasillaEspecial {

    private int filaBajar;
    private int columnaBajar;
    private int idCasillaBajar;

    public CasillaSerpiente(int filaBajar, int columnaBajar, int idCasillaBajar, int fila, int columna, int id) {
        super(fila, columna, id);
        super.setColor(SERPIENTE);
        this.filaBajar = filaBajar;
        this.columnaBajar = columnaBajar;
        this.idCasillaBajar = idCasillaBajar;
    }

    public CasillaSerpiente(int filaBajar, int columnaBajar, int idCasillaBajar, int fila, int columna) {
        super(fila, columna);
        super.setColor(SERPIENTE);
        this.filaBajar = filaBajar;
        this.columnaBajar = columnaBajar;
        this.idCasillaBajar = idCasillaBajar;
    }

    public CasillaSerpiente(int filaBajar, int columnaBajar, int idCasillaBajar, int id) {
        super(id);
        super.setColor(SERPIENTE);
        this.filaBajar = filaBajar;
        this.columnaBajar = columnaBajar;
        this.idCasillaBajar = idCasillaBajar;
    }

    @Override
    public void accionCasilla(Jugador jugador, List<Casilla> casillas) {
        jugador.setPosicion(idCasillaBajar);
    }

    /**
     * @return the filaBajar
     */
    public int getFilaBajar() {
        return filaBajar;
    }

    /**
     * @param filaBajar the filaBajar to set
     */
    public void setFilaBajar(int filaBajar) {
        this.filaBajar = filaBajar;
    }

    /**
     * @return the columnaBajar
     */
    public int getColumnaBajar() {
        return columnaBajar;
    }

    /**
     * @param columnaBajar the columnaBajar to set
     */
    public void setColumnaBajar(int columnaBajar) {
        this.columnaBajar = columnaBajar;
    }

    /**
     * @return the idCasillaBajar
     */
    public int getIdCasillaBajar() {
        return idCasillaBajar;
    }

    /**
     * @param idCasillaBajar the idCasillaBajar to set
     */
    public void setIdCasillaBajar(int idCasillaBajar) {
        this.idCasillaBajar = idCasillaBajar;
    }

}
