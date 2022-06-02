package ClaseUno;

import java.util.Scanner;

public class InversorDePalabras {
    public static void main(String[] args) {

        String palabra = "", palabraInvertida = "", respuesta = "";
        int longitudPalabra = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Escribe una palabra o frase: ");
        palabra = in.nextLine();

        longitudPalabra = palabra.length();

        while(longitudPalabra != 0){
            palabraInvertida += palabra.substring(longitudPalabra -1, longitudPalabra );
            longitudPalabra--;
        }

        System.out.print("Esta es su palabra o frase invertida: " + palabraInvertida);
        System.out.println("");
    }
}

