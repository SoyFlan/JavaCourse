package Calcv1;

public class Suma {
    private int vUno = 0, vDos = 0, resultado = 0;

    public Suma(int valorUno,int valorDos){
        this.vUno = valorUno;
        this.vDos = valorDos;
    }
    public void operacionSuma(){
        resultado = vUno + vDos;
    }
    public void imprimir(){
        operacionSuma();
        System.out.println("El resultado de tu Suma es: " + resultado);
    }
}