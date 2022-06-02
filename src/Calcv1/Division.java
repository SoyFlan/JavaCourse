package Calcv1;

public class Division {
    private int vUno = 0, vDos = 0, resultado = 0;

    public Division(int valorUno,int valorDos){
        this.vUno = valorUno;
        this.vDos = valorDos;
    }
    public void operacionDivision(){
        resultado = vUno / vDos;
    }
    public void imprimir(){
        operacionDivision();
        System.out.println("El resultado de tu RDivision es: " + resultado);
    }
}