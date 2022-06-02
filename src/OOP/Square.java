package OOP;

import java.util.Scanner;

public class Square implements Figure {
    private double side, result;
    private boolean perimeter;
    private String perimeterStatus;

    Scanner in = new Scanner(System.in);
    public Square(int side, boolean perimeter, String perimeterStatus){
        this.side = side;
        this.perimeter = perimeter;
        this.perimeterStatus = perimeterStatus;
    }
    public void CalcSquareArea(){
        result = Math.pow(side, 2);
    }

    public void print(){
        CalcSquareArea();
        System.out.println("This is the area of the square: " + result);
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
