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
    public String palabra;
    public int xPos;
    public int yPos;
    public Color color;
    public int tamaño;

    public GraphicString() {
        palabra="carro";
        xPos = 15;
        yPos = 15;
        color = Color.RED;
        tamaño = 20;
    }

    public GraphicString(String palabra, int xPos, int yPos, Color color, int tamaño) {
        this.palabra = palabra;
        this.xPos = xPos;
        this.yPos = yPos;
        this.color = color;
        this.tamaño = tamaño;
    }
    
    
    public void mostrarString(){
        
        Canvas canvas = Canvas.getCanvas();
        Font font = new Font("Arial", Font.PLAIN, tamaño);  
        canvas.setFont(font);
        canvas.drawString(palabra,xPos,yPos,color);
        canvas.wait(10);
    }
    
    public void borrarString(){
        Canvas canvas = Canvas.getCanvas();
        canvas.eraseString(palabra, xPos, yPos);
    }
    
}
