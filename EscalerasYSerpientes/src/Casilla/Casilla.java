/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casilla;

/**
 *
 * @author baquiax
 */
public class Casilla {

    private int fila;
    private int columna;
    private int id;

    /**
     * Crea un objeto de tipo casilla
     *
     * @param fila
     * @param columna
     * @param id
     */
    public Casilla(int fila, int columna, int id) {
        this.fila = fila;
        this.columna = columna;
        this.id = id;
    }

    /**
     * Crea un objeto de tipo casilla
     *
     * @param fila
     * @param columna
     */
    public Casilla(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    /**
     * Crea un objeto de tipo casilla
     *
     * @param id
     */
    public Casilla(int id) {
        this.id = id;
    }

    /**
     * @return the fila
     */
    public int getFila() {
        return fila;
    }

    /**
     * @param fila the fila to set
     */
    public void setFila(int fila) {
        this.fila = fila;
    }

    /**
     * @return the columna
     */
    public int getColumna() {
        return columna;
    }

    /**
     * @param columna the columna to set
     */
    public void setColumna(int columna) {
        this.columna = columna;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

}
