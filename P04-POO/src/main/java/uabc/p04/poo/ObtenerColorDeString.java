/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.p04.poo;

import java.awt.Color;

/**
 *
 * @author comp10j
 */
public class ObtenerColorDeString {
    public static Color getColorDeString(String color) {
        switch (color.toLowerCase()) {
            case "rojo":
                return Color.RED;
            case "verde":
                return Color.GREEN;
            case "amarillo":
                return Color.YELLOW;
            case "naranja":
                return Color.ORANGE;
            default:
                return Color.GRAY; 
        }
    }
}
