package OOP;

import java.util.Scanner;

public class Circle {
    private double radius, result, finalResult, pi = Math.PI;
    private boolean perimeter;
    private String perimeterStatus;

    Scanner in = new Scanner(System.in);

    public Circle(double radius, boolean perimeter, String perimeterStatus){
        this.radius = radius;
        this.perimeter = perimeter;
        this.perimeterStatus = perimeterStatus;
    }
    public void CalcCircleArea(){
        result = pi * Math.pow(radius, 2);
        finalResult = Math.round(result * 100) / 100d;
    }

    public void print() {
        CalcCircleArea();
        System.out.println("This is the area of the rectangle: \n" + finalResult );
    }

    public void askPerimeter(){
        System.out.println("Do you want the perimeter too?");
        perimeterStatus = in.nextLine();

        if (perimeterStatus.equals("yes")) {
            perimeter = true;
        } else if (perimeterStatus.equals("No")) {
            perimeter = false;
        }
    }
}