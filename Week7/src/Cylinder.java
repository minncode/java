public class Cylinder extends Circle {
    double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getVolume();
    }

    public double getArea() {
        return 2 * Math.PI * Math.pow(radius, 2) + 2 * Math.PI * radius * height;
    }

    @Override
    public String toString() {
        return "Cylinder[" +
                "radius=" + radius +
                ", height=" + height +
                ']';
    }
}
