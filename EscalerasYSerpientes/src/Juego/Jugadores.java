/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import Jugador.ExcepcionJugador;
import Jugador.Jugador;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author baquiax
 */
public class Jugadores {

    private List<Jugador> listadoJugadores;

    public Jugadores(List<Jugador> listadoJugadores) {
        this.listadoJugadores = listadoJugadores;
    }

    public Jugadores() {
        listadoJugadores = new ArrayList<Jugador>();
    }

    /**
     * Retorna verdadero si el jugador es agregado y falso si ya existe un
     * jugador con el mismo id
     *
     * @param jugador
     * @return
     */
    public boolean agregarJugador(Jugador jugador) {
        if (buscarJugador(jugador)) {
            return false;
        } else {
            listadoJugadores.add(jugador);
            return true;
        }
    }

    /**
     * Busca si un jugador ya existe con el mismo Id
     *
     * @param jugador
     * @return
     */
    public boolean buscarJugador(Jugador jugador) {
        for (Jugador player : listadoJugadores) {
            if (player.getId() == jugador.getId()) {
                return true;
            }
        }
        return false;
    }

    /**
     * Retorna el indice de un jugador
     *
     * @param jugador
     * @return
     * @throws ExcepcionJugador si el jugador no existe
     */
    public int buscarIndiceJugador(Jugador jugador) throws ExcepcionJugador {
        for (int i = 0; i < listadoJugadores.size(); i++) {
            if (listadoJugadores.get(i) == jugador) {
                return i;
            }
        }
        throw new ExcepcionJugador("Jugador no encontrado");
    }

    /**
     * Ordena los jugadores por partidas jugadas
     */
    public void ordenarJugadoresPorPJ() {
        Collections.sort(getListadoJugadores(), new Comparator<Jugador>() {
            @Override
            public int compare(Jugador o1, Jugador o2) {
                return o1.getPartidasJugadas() > o2.getPartidasJugadas() ? -1 : 1;
            }
        });
    }

    /**
     * Ordena los jugadores por partidas Ganadas
     */
    public void ordenarJugadoresPorPG() {
        Collections.sort(getListadoJugadores(), new Comparator<Jugador>() {
            @Override
            public int compare(Jugador o1, Jugador o2) {
                return o1.getPartidasGanadas() > o2.getPartidasGanadas() ? -1 : 1;
            }
        });
    }

    /**
     * Ordena los jugadores por partidas perdidas
     */
    public void ordenarJugadoresPorPP() {
        Collections.sort(getListadoJugadores(), new Comparator<Jugador>() {
            @Override
            public int compare(Jugador o1, Jugador o2) {
                return o1.getPartidasPerdidas() > o2.getPartidasPerdidas() ? -1 : 1;
            }
        });
    }

    /**
     * @return the listadoJugadores
     */
    public List<Jugador> getListadoJugadores() {
        return listadoJugadores;
    }

    /**
     * @param listadoJugadores the listadoJugadores to set
     */
    public void setListadoJugadores(List<Jugador> listadoJugadores) {
        this.listadoJugadores = listadoJugadores;
    }
}
