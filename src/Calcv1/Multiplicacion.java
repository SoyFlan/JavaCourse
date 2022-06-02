package Calcv1;

public class Multiplicacion {
    private int vUno = 0, vDos = 0, resultado = 0;

    public Multiplicacion(int valorUno, int valorDos) {
        this.vUno = valorUno;
        this.vDos = valorDos;
    }

    public void operacionMultiplicacion() {
        resultado = vUno * vDos;
    }

    public void imprimir() {
        operacionMultiplicacion();
        System.out.println("El resultado de tu Multiplicacion es: " + resultado);
    }
}