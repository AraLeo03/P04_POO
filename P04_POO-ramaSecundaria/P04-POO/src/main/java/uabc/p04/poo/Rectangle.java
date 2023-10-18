/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.p04.poo;

import java.awt.*;

/**
 *
 * @author Dell
 */
public class Rectangle {

    private Color color;
    private int xPos;
    private int yPos;
    private int size;

    public Rectangle(String color, int xPos, int yPos, int size) {
        this.color = getColorDeString(color);
        this.xPos = xPos;
        this.yPos = yPos;
        this.size = size;
    }

    public Rectangle() {
        color = getColorDeString("amarillo");
        xPos = 20;
        yPos = 20;
        size = 25;
    }

    private Color getColorDeString(String color) {
        switch (color.toLowerCase()) {
            case "rojo":
                return Color.RED;
            case "verde":
                return Color.GREEN;
            case "azul":
                return Color.BLUE;
            case "amarillo":
                return Color.YELLOW;
            case "magenta":
                return Color.MAGENTA;
            case "naranja":
                return Color.ORANGE;
            case "rosa":
                return Color.PINK;
            default:
                return Color.BLACK; // Color predeterminado si no se reconoce el nombre
        }
    }

    public void draw() {
        Canvas canvas = Canvas.getCanvas();
        java.awt.Rectangle rectangle = new java.awt.Rectangle(xPos, yPos, size, size);
//        canvas.draw(rectangle);
        canvas.setForegroundColor(color);

        canvas.fillRectangle(xPos, yPos, size, size);
        canvas.wait(10);
    }

    public void erase() {
        Canvas canvas = Canvas.getCanvas();
        canvas.eraseRectangle(xPos, yPos, size, size);
    }

    public void changeColor(String newColor) {
        color = Color.decode(newColor);
        draw();
    }

    public void changeSize(int newSize) {
        erase();
        size = newSize;
        draw();
    }

    public String getColor() {
        return color.toString();
    }

    public void setColor(String color) {
        this.color = Color.decode(color);
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
