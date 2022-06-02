package OOP;

import java.util.Scanner;

public class Rectangle {
    private int high, base, result;
    private boolean perimeter;
    private String perimeterStatus;

    Scanner in = new Scanner(System.in);

    public Rectangle(int high, int base, boolean perimeter, String perimeterStatus){
        this.high = high;
        this.base = base;
        this.perimeter = perimeter;
        this.perimeterStatus = perimeterStatus;
    }
    public void CalcRectangleArea(){
        result = high * base;
    }

    public void print() {
        CalcRectangleArea();
        System.out.println("This is the area of the rectangle: " + result);
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
