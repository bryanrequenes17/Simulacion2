/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatoriedadsimulacion;

import Controller.Congruencial_Mixto;
import javax.swing.JOptionPane;
import windows.index;

/**
 *
 * @author alex
 */
public class AleatoriedadSimulacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int x0, d, k;
//        k = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de k"));
//        d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de d"));
//        x0 = 0;
//        do {
//            x0 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la semilla X0"));
//        } while (x0 <= 0);
//        System.out.println("n\tXn\t   (aXn + c) / m\tXn+1\tNU");
//        System.out.println("Aleatorio CM: " + new Congruencial_Mixto().aleatorio(x0, k, d, 0));
        new index().setVisible(true);
    }
    
}
