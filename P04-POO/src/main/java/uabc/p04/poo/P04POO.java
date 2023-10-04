/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package uabc.p04.poo;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class P04POO {

    private String palabraSecreta;
    private boolean juegoTerminado;

    public P04POO() {
        inicializarJuego();
    }

    public static void main(String[] args) {
        P04POO wordle = new P04POO();
        wordle.juego();
    }

    public void inicializarJuego() {
        Vocabulario vocabulario1 = new Vocabulario();
        palabraSecreta = vocabulario1.darPalabraRandom();
        juegoTerminado = false;
    }

    public void juego() {
        Jugador player = new Jugador(6);
        Scanner leerPalabra = new Scanner(System.in);
        char[] caracteresDePalabraSecreta = palabraSecreta.toCharArray();
        System.out.println("Bienvenido a Wordle by Leonel Araujo");

        while (!juegoTerminado) {
            System.out.println("Tienes " + player.getVidas() + " vidas");
            System.out.println("Ingrese palabra de 5 letras: ");
            String palabraIngresada = leerPalabra.nextLine();
            palabraIngresada = palabraIngresada.toLowerCase();

            char[] caracteresDePalabraIngresada = palabraIngresada.toCharArray();
            if (palabraSecreta.equals(palabraIngresada)) {
                System.out.println("La palabra ingresada es correcta");
                System.out.println("La palabra secreta era: " + palabraSecreta);
                juegoTerminado = true;
            } else {
                for (int i = 0; i < palabraSecreta.length(); i++) {
                    if (caracterCorrectoEnPosicion(caracteresDePalabraSecreta[i], caracteresDePalabraIngresada[i])) {
                        System.out.println("El caracter " + caracteresDePalabraIngresada[i] + " en la posicion " + (i + 1) + " es correcto y en la posicion correcta");
                    } else if (caracterEnPalabra(caracteresDePalabraIngresada[i])) {
                        System.out.println("El caracter " + caracteresDePalabraIngresada[i] + " en la posicion " + (i + 1) + " es correcto pero en la posicion incorrecta");
                    } else {
                        System.out.println("El caracter " + caracteresDePalabraIngresada[i] + " en la posicion " + (i + 1) + " no se encuentra en la palabra secreta");
                    }
                }
                player.setVidas(player.getVidas() - 1);
                if (player.getVidas() == 0) {
                    System.out.println("Has agotado tus intentos");
                    juegoTerminado = true;
                    System.out.println("La palabra secreta era: " + palabraSecreta);
                } else {
                    System.out.println("Intenta de nuevo");
                }
            }

        }

    }

    public boolean caracterCorrectoEnPosicion(char cPalabraSecreta, char cPalabraIngresada) {
        return cPalabraSecreta == cPalabraIngresada;
    }

    public boolean caracterEnPalabra(char cPalabraIngresada) {
        return palabraSecreta.contains(String.valueOf(cPalabraIngresada));
    }
}
