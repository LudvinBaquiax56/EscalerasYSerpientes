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

    public static int tirarDado() {
        return (int) (Math.random() * 6 + 1);
    }
}
