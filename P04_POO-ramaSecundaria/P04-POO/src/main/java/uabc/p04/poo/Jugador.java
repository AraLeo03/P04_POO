/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.p04.poo;

/**
 *
 * @author Dell
 */
public class Jugador {
    private int vidas;

    public Jugador(int vidas) {
        this.vidas = vidas;
    }

    public Jugador() {
        vidas = 6;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
    
    
}
