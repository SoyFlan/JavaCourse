package OOP;

import java.util.Scanner;

public class Triangle {
    private int high, base, result;
    private boolean perimeter;
    private String perimeterStatus;

    Scanner in = new Scanner(System.in);

    public Triangle(int high, int base, boolean perimeter, String perimeterStatus){
        this.high = high;
        this.base = base;
        this.perimeter = perimeter;
        this.perimeterStatus = perimeterStatus;
    }
    public void calcTriangleArea(){
        result = base * high / 2;
    }

    public void print() {
        calcTriangleArea();
        System.out.println("This is the area of the Triangle: \n" + result) ;
    }

    public void askPerimeter(){
        System.out.println("Do you want the perimeter too?");
        perimeterStatus = in.nextLine();

        if (perimeterStatus.equalsIgnoreCase("yes")) {
            perimeter = true;
        } else if (perimeterStatus.equalsIgnoreCase("No")) {
            perimeter = false;
        }
    }
}
