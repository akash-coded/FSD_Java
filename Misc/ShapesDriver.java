// class Shapes {
//     double findArea(int radius) {
//         return 3.14 * radius * radius;
//     }

//     double findArea(double side) {
//         return side * side;
//     }

//     double findArea(double length, double breadth) {
//         return length * breadth;
//     }
// }

// interface Shapes {
//     double area();
// }

// class Circle implements Shapes {
//     static final double PI = 3.14;
//     private double radius;

//     Circle() {

//     }

//     Circle(double radius) {
//         this.radius = radius;
//     }

//     public double getRadius() {
//         return this.radius;
//     }

//     public void setRadius(double radius) {
//         this.radius = radius;
//     }

//     public double area() {
//         return PI * radius * radius;
//     }

//     @Override
//     public String toString() {
//         return "Circle [radius=" + radius + ", area=" + area() + "]";
//     }
// }

// class Rectangle implements Shapes {
//     private double length;
//     private double breadth;

//     Rectangle() {

//     }

//     Rectangle(double length, double breadth) {
//         this.length = length;
//         this.breadth = breadth;
//     }

//     public double getLength() {
//         return this.length;
//     }

//     public void setLength(double length) {
//         this.length = length;
//     }

//     public double getBreadth() {
//         return this.breadth;
//     }

//     public void setBreadth(double breadth) {
//         this.breadth = breadth;
//     }

//     public double area() {
//         return length * breadth;
//     }

//     @Override
//     public String toString() {
//         return "Rectangle [breadth=" + breadth + ", length=" + length + ", area=" + area() + "]";
//     }
// }

interface Shapes {
    double area(double x);
}

public class ShapesDriver {
    public static void main(String[] args) {
        // Shapes shapes = new Shapes();
        // String name1 = "Akash";
        // String name2 = "Akash";
        // name1 = "Akash Das";
        // name2 = "Akash Das";
        // name1 = "Akash";

        // System.out.println("Area of Rectangle:: " + shapes.findArea(5));
        // System.out.println("Area of square:: " + shapes.findArea(5.0));
        // System.out.println("Area of rectangle:: " + shapes.findArea(5, 6));

        // Shapes circle = new Circle(5);
        // Shapes rectangle = new Rectangle(5, 6);

        // System.out.println(circle);
        // System.out.println(rectangle);

        // Shapes circle = new Shapes() {
        // public double area(double radius) {
        // return 3.14 * radius * radius;
        // }
        // };

        Shapes circle = radius -> 3.14 * radius * radius;

        System.out.println(circle.area(5));
    }
}