/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dado;

import java.awt.Image;
import javax.swing.ImageIcon;

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
    public int tirarDado() {
        return (int) (Math.random() * 6 + 1);
    }

    public ImageIcon obtenerImagen(int valor) {
        ImageIcon aux = null;
        Image img;
        switch (valor) {
            case 1:
                img = new ImageIcon(getClass().getResource("1.png")).getImage();
                aux = new ImageIcon(img.getScaledInstance(72, 72, Image.SCALE_SMOOTH));
                break;
            case 2:
                img = new ImageIcon(getClass().getResource("2.png")).getImage();
                aux = new ImageIcon(img.getScaledInstance(72, 72, Image.SCALE_SMOOTH));
                break;
            case 3:
                img = new ImageIcon(getClass().getResource("3.png")).getImage();
                aux = new ImageIcon(img.getScaledInstance(72, 72, Image.SCALE_SMOOTH));
                break;
            case 4:
                img = new ImageIcon(getClass().getResource("4.png")).getImage();
                aux = new ImageIcon(img.getScaledInstance(72, 72, Image.SCALE_SMOOTH));
                break;
            case 5:
                img = new ImageIcon(getClass().getResource("5.png")).getImage();
                aux = new ImageIcon(img.getScaledInstance(72, 72, Image.SCALE_SMOOTH));
                break;
            case 6:
                img = new ImageIcon(getClass().getResource("6.png")).getImage();
                aux = new ImageIcon(img.getScaledInstance(72, 72, Image.SCALE_SMOOTH));
                break;
            default:

        }
        return aux;
    }

    public ImageIcon obtenerGifRandom() {
        ImageIcon aux = new ImageIcon(getClass().getResource("random.gif"));
        return aux;
    }
}
