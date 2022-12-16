public class Circle extends Shape {
    private double radius;

    /*public Shape getArea() {

    }

    public Shape getPerimeter() {

    }*/

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "A Circle with " +
                "radius=" + radius +
                ", which is a subclass of "+super.toString();
    }
}
