package OOP;

import java.lang.Math.*;
import java.util.Scanner;

/* Form of geometric figures using:
* conditionals (if, else if, else) ✓
* loops (for, while y do while) ✓
* methods  ✓
* objects ✓
* inheritance
* polymorphism
* */


public class FiguresArea {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

         int side = 0,high = 0, base = 0, radius = 0;
         String figureType = "", floatFigureType = "", solidFigureType = "", perimeterStatus = "";
         boolean flat = true, solid, perimeter = true;



         System.out.println("The figure is flat or solid?");
         figureType = in.nextLine();
         if (figureType.equalsIgnoreCase("flat")) {
             flat = true;
         } else if (figureType.equalsIgnoreCase("solid")) {
            solid = true;
         }

         while (flat) {
             flat = false;

             System.out.println("Which figure do you need to find the area of?");
             floatFigureType = in.nextLine();

             if (floatFigureType.equalsIgnoreCase("Square")) {

                 System.out.println("Give me the side value: ");
                 side = in.nextInt();

                 Square messenger = new Square(side, perimeter, perimeterStatus);
                 messenger.print();
                 messenger.askPerimeter();

             } else if (floatFigureType.equalsIgnoreCase("Rectangle")) {

                 System.out.println("Give me the high value: ");
                 high = in.nextInt();

                 System.out.println("Give me the base value: ");
                 base = in.nextInt();

                 Rectangle messenger = new Rectangle(high, base, perimeter, perimeterStatus);
                 messenger.print();
                 messenger.askPerimeter();


             } else if (floatFigureType.equalsIgnoreCase("Circle")) {

                 System.out.println("Give me the radius value: ");
                 radius = in.nextInt();

                 Circle messenger = new Circle(radius, perimeter, perimeterStatus);
                 messenger.print();
                 messenger.askPerimeter();

             } else if (floatFigureType.equalsIgnoreCase("Triangle")) {

                 System.out.println("Give me the high value: ");
                 high = in.nextInt();

                 System.out.println("Give me the base value: ");
                 base = in.nextInt();

                 Triangle messenger = new Triangle(high, base, perimeter, perimeterStatus);
                 messenger.print();
                 messenger.askPerimeter();

             } else {
                 flat = true;
             }
         }
    }
}

/*
 * Secuencia
 * Seleccion
 * Iteracion
 */