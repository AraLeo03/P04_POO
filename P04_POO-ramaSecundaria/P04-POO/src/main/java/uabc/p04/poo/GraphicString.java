/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.p04.poo;


import java.awt.Color;
import java.awt.*;
/**
 *
 * @author Dell
// */
public class GraphicString {

    public GraphicString() {
    }
    
    
    public void mostrarString(String palabra,int xPos,int yPos,Color color,int tamaño){
        
        Canvas canvas = new Canvas("Canvas");
        Font font = new Font("Arial", Font.PLAIN, tamaño);  
        canvas.setFont(font);
        canvas.drawString(palabra,xPos,yPos,color);
    }
    
}
