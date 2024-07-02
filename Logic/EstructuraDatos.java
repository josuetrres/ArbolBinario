/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logic;

import GUI.Pantalla;
import GUI.Ventana1;

/**
 *
 * @author jorod
 */
public class EstructuraDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ventana1 ventana1 = new Ventana1();
        Pantalla pantalla1 = new Pantalla(ventana1);
        ventana1.setPantalla(pantalla1);
        pantalla1.setVisible(true);
        pantalla1.setLocationRelativeTo(null);
    }
    
}
