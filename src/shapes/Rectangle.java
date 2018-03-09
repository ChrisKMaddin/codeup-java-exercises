package shapes;

public class Rectangle {

    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }
}

//public class Rectangle extends Quadrilateral implements Measurable {
//
//    public Rectangle(double length, double width) {
//        super(length, width);
//    }
//
//    @Override
//    public double getPerimeter() {
//        return width * 2 + length * 2;
//    }
//
//    @Override
//    public double getArea() {
//        return width * length;
//    }
//
//    @Override
//    public void setLength(double length) {
//        this.length = length;
//    }
//
//    @Override
//    public void setWidth(double width) {
//        this.width = width;
//    }
//}
//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea() {
//        return length * width;
//    }
//
//    public double getPerimeter() {
//        return (2 * length) + (2 * width);
//    }
//}




//

//
//
////instructors solution
//package shapes;
//
