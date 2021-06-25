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
public class Jugador {

    private int Id;
    private String nombre;
    private String apellido;
    private int partidasJugadas;
    private int partidasGanadas;
    private int partidasPerdidas;
    private int conTurno;

    /**
     * @param Id
     * @param nombre
     * @param apellido
     */
    public Jugador(int Id, String nombre, String apellido) {
        this.Id = Id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.partidasJugadas = 0;
        this.partidasGanadas = 0;
        this.partidasPerdidas = 0;
    }

    /**
     *
     * @param Id
     * @param nombre
     * @param apellido
     * @param partidasJugadas
     * @param partidasGanadas
     * @param partidasPerdidas
     * @param conTurno
     */
    public Jugador(int Id, String nombre, String apellido, int partidasJugadas, int partidasGanadas, int partidasPerdidas, int conTurno) {
        this.Id = Id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.partidasJugadas = partidasJugadas;
        this.partidasGanadas = partidasGanadas;
        this.partidasPerdidas = partidasPerdidas;
        this.conTurno = conTurno;
    }

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the partidasJugadas
     */
    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    /**
     * @param partidasJugadas the partidasJugadas to set
     */
    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }

    /**
     * @return the partidasGanadas
     */
    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    /**
     * @param partidasGanadas the partidasGanadas to set
     */
    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    /**
     * @return the partidasPerdidas
     */
    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    /**
     * @param partidasPerdidas the partidasPerdidas to set
     */
    public void setPartidasPerdidas(int partidasPerdidas) {
        this.partidasPerdidas = partidasPerdidas;
    }

    /**
     * @return the conTurno
     */
    public int getConTurno() {
        return conTurno;
    }

    /**
     * @param conTurno the conTurno to set
     */
    public void setConTurno(int conTurno) {
        this.conTurno = conTurno;
    }

}
