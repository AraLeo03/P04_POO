/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package uabc.p04.poo;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
//        GraphicString x = new GraphicString("",xPos,yPos,ObtenerColorDeString.getColorDeString("color"),tamañoLetra);
//        x.mostrarString();
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
        InterfazGrafica.mostrarJuego();

        Scanner leerPalabra = new Scanner(System.in);

        GraphicString bienvenida = new GraphicString("Wordle by Leonel Araujo", 45, 50, ObtenerColorDeString.getColorDeString("verde"), 20);
        bienvenida.mostrarString();

        while (!juegoTerminado) {
            mostrarInformacion(player);

            String palabraIngresada = leerPalabra.nextLine();
            palabraIngresada = palabraIngresada.toLowerCase();

            verificarPalabra(palabraIngresada, palabraSecreta, player);
        }

    }

    public void mostrarInformacion(Jugador player) {
        GraphicString vidas = new GraphicString(("Tienes " + player.getVidas() + " vidas"), 10, 355, ObtenerColorDeString.getColorDeString("rojo"), 15);
        vidas.mostrarString();

        GraphicString ingrese = new GraphicString("Ingrese palabra de 5 letras: ", 10, 370, ObtenerColorDeString.getColorDeString("naranja"), 20);
        ingrese.mostrarString();
    }

    public String obtenerPalabraIngresada(Scanner leerPalabra) {
        return leerPalabra.nextLine();
    }

    public void verificarPalabra(String palabraIngresada, String palabraSecreta, Jugador player) {
        char[] caracteresDePalabraIngresada = palabraIngresada.toCharArray();
        char[] caracteresDePalabraSecreta = palabraSecreta.toCharArray();
        
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

    public boolean caracterCorrectoEnPosicion(char cPalabraSecreta, char cPalabraIngresada) {
        return cPalabraSecreta == cPalabraIngresada;
    }

    public boolean caracterEnPalabra(char cPalabraIngresada) {
        return palabraSecreta.contains(String.valueOf(cPalabraIngresada));
    }
}
