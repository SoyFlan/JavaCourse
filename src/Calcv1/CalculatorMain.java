package Calcv1;

import java.util.Scanner;

//Calculadora simple para 2 valores implementando POO (+,-,/,*)

public class CalculatorMain {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese el primer valor: ");
        int valorUno = in.nextInt();

        System.out.println("Ingrese el segundo valor: ");
        int valorDos = in.nextInt();

        System.out.println("¿Que operacion quiere hacer? ");
        in.nextLine();
        String tipoOperacion = in.nextLine();

        boolean operacionInvalida = true;

        while (operacionInvalida){

            operacionInvalida = false;

            if (tipoOperacion.equalsIgnoreCase("Suma")) {

                Suma suma = new Suma(valorUno, valorDos);
                suma.imprimir();

            } else if (tipoOperacion.equalsIgnoreCase("Resta")) {

                Resta resta = new Resta(valorUno, valorDos);
                resta.imprimir();

            } else if (tipoOperacion.equalsIgnoreCase("Multiplicacion")) {

                Multiplicacion multiplicacion = new Multiplicacion(valorUno, valorDos);
                multiplicacion.imprimir();

            } else if (tipoOperacion.equalsIgnoreCase("Division")) {

                Division division = new Division(valorUno, valorDos);
                division.imprimir();
            } else {
                operacionInvalida = true;
            }
        }
    }
}