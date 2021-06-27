/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dado;

/**
 *
 * @author baquiax
 */
public class Dado {

    public Dado() {
    }

    /**
     * Lanza un dado y retorna un valor entre 1 y 6
     *
     * @return
     */
    public static int tirarDado() {
        return (int) (Math.random() * 6 + 1);
    }
}
