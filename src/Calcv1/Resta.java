package Calcv1;

public class Resta {
    private int vUno = 0, vDos = 0, resultado = 0;

    public Resta(int valorUno, int valorDos) {
        this.vUno = valorUno;
        this.vDos = valorDos;
    }

    public void operacionResta() {
        resultado = vUno - vDos;
    }

    public void imprimir() {
        operacionResta();
        System.out.println("El resultado de tu R es: " + resultado);
    }
}