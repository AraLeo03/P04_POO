/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.p04.poo;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Dell
 */
public class Vocabulario {
    private ArrayList<String> baseDePalabras;

    public Vocabulario() {
        baseDePalabras = new ArrayList<>();
        baseDePalabras.add("carro");
        baseDePalabras.add("lucha");
        baseDePalabras.add("mesa");
        baseDePalabras.add("azote");
        baseDePalabras.add("mente");
        baseDePalabras.add("lugar");
        baseDePalabras.add("rodeo");
        baseDePalabras.add("gesto");
        baseDePalabras.add("claro");
        baseDePalabras.add("cepas");
    }
           
    public String darPalabraRandom(){
        Random rmd = new Random();
        return baseDePalabras.get(rmd.nextInt(baseDePalabras.size()));
    }
}
