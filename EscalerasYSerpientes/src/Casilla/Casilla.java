/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casilla;

import java.awt.Color;

/**
 *
 * @author baquiax
 */
public class Casilla {

    public static final Color INICIO = Color.YELLOW;
    public static final Color FIN = Color.BLUE;
    
    public static final Color NORMAL = Color.GRAY;
    
    public static final Color PIERDE_TURNO = Color.RED;
    public static final Color TIRAR_DADOS = Color.WHITE;
    public static final Color AVANZAR = Color.CYAN;
    public static final Color RETROCEDER = new Color(78, 22, 6);//corinto
    public static final Color ESCALERA = Color.ORANGE;
    public static final Color SERPIENTE = Color.MAGENTA;

    private int fila;
    private int columna;
    private int id;
    private Color color;

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
        this.color = NORMAL;
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
        this.color = NORMAL;
    }

    /**
     * Crea un objeto de tipo casilla
     *
     * @param id
     */
    public Casilla(int id) {
        this.id = id;
        this.color = NORMAL;
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

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

}
