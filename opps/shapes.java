package opps;

import java.util.*;

// Do not edit the Quadrilateral class
// general (Specify all 4 sides)
abstract class Quadrilateral {
    double side1;
    double side2;
    double side3;
    double side4;

    public Quadrilateral(double side1, double side2, double side3, double side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    protected abstract double getArea();

    protected double getPerimeter() {
        return (side1+side2+side3+side4);
    }
}

// Implement class Parallelogram and methods getArea() and getPerimeter()
class Parallelogram extends Quadrilateral {
    double height;
    Parallelogram(double side1, double side2, double height) {
        super(side1, side2, side1, side2);
        this.height = height;
    }

    @Override
    protected double getArea() {
        double base = side1;
        return base * height;
    }
}

// Implement class Rhombus and methods getArea() and getPerimeter()
class Rhombus extends Parallelogram {
    Rhombus(double side, double height) {
        super(side, side, height);
    }
}

//Implement class Rectangle and methods getArea() and getPerimeter()
class Rectangle extends Parallelogram {
    Rectangle(double len, double width) {
        super(len, width, width);
    }

    @Override
    protected double getArea() {
        return side1 * side2;
    }

}
//Implement class Square and methods getArea() and getPerimeter()
class Square extends Rhombus {
    Square(double side) {
        super(side, side);
    }

    @Override
    protected double getArea() {
        return side1 * side1;
    }
}



// Do not edit the Main class
class shapes {
    // ... any number of arguments
    static boolean checkPositive(double... args) {
        for (double arg: args) {
            if (arg < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double side1P = in.nextDouble();
        double side2P = in.nextDouble();
        double heightP = in.nextDouble();

        double side1R = in.nextDouble();
        double heightR = in.nextDouble();

        double side1Rec = in.nextDouble();
        double side2Rec = in.nextDouble();

        double sideS = in.nextDouble();

        if (!checkPositive(side1P, side2P, heightP, side1R, heightR, side1Rec, side2Rec, sideS)) {
            System.out.println("Length of a side cannot be negative. Please Enter a positive integer");
            return;
        }

        Parallelogram parallelogram = new Parallelogram(side1P, side2P, heightP);
        System.out.println("Perimeter of Parallelogram is " + parallelogram.getPerimeter() +" and Area of Parallelogram is " + parallelogram.getArea());


        Rhombus rhombus = new Rhombus(side1R, heightR);
        System.out.println("Perimeter of Rhombus is " + rhombus.getPerimeter() +" and Area of Rhombus is " + rhombus.getArea());


        Rectangle rectangle = new Rectangle(side1Rec, side2Rec);
        System.out.println("Perimeter of Rectangle is " + rectangle.getPerimeter() +" and Area of Rectangle is " + rectangle.getArea());


        Square square = new Square(sideS);
        System.out.println("Perimeter of Square is " + square.getPerimeter()+ " and Area of Square is " + square.getArea());

        in.close();
    }
}
