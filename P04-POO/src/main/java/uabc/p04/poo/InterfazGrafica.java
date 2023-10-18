/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.p04.poo;

import java.util.ArrayList;

/**
 *
 * @author comp10j
 */
public class InterfazGrafica {

    private static ArrayList<Rectangle> rectangulos;

    public static void mostrarJuego() {
        rectangulos = new ArrayList();
        for (int i = 0; i < 25; i++) {
            for (int j = 1; j <= 5; j++) {
                for (int k = 1; k <= 5; k++) {
                    Rectangle rec = new Rectangle("gris", k*45, j*60, 40);
                    rectangulos.add(rec);
                }
            }
            rectangulos.get(i).draw();
        }
    }
    
    
}
